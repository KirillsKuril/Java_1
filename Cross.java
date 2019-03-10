package Lesson_4;

import java.util.Random;
import java.util.Scanner;

public class Cross {

    static int size_X = 3;
    static int size_Y = 3;
    static char [][] field = new char [size_Y][size_X];

    static char PLAYER_DOT = 'X';
    static char AI_DOT = 'O';
    static char EMPTY_DOT = '.';

   static Scanner scanner = new Scanner(System.in);
   static Random random = new Random();

   //заполнить поле
    private static void initField (){
        for (int i = 0; i < size_Y; i++) {
            for (int j = 0; j < size_X; j++) {
                field[i][j] = EMPTY_DOT;
            }
        }
    }
    // метод для вывода на консоль поля
    private static void printField(){
        System.out.println("-------");
        for (int i = 1; i <= size_Y; i++) {
            System.out.print(i + " ");
        }
        System.out.println();
        for (int i = 0; i < size_Y; i++) {
            System.out.print((i+1) + " ");
            System.out.print("|");
            for (int j = 0; j < size_X; j++) {
                System.out.print(field[i][j] + "|");
            }
            System.out.println();
        }
        System.out.println("-------");
    }
    // метод для установки символа
    private static void setSym(int y, int x, char sym){
    field[y][x] = sym;
    }

    private static boolean isCellValid (int y, int x){
        if(x < 0 || y < 0 || x > size_X - 1 || y > size_Y-1) {
            return false;
        }

        return(field[y][x] == EMPTY_DOT);
    }

    // ход игрока
    private static void playerStep(){
        int x;
        int y;
        do {
            System.out.println("введите координаты : X Y (1-3)");
            x = scanner.nextInt() - 1;
            y = scanner.nextInt() - 1;
        } while(!isCellValid(y,x));
        setSym(y, x, PLAYER_DOT);
    }

    //ход AI
    private static void aiStep(){
        int x;
        int y;
        do {
            x = random.nextInt(size_X);
            y = random.nextInt(size_Y);
        } while(!isCellValid(y,x));
        setSym(y, x, AI_DOT);
    }
// если не найдена пустая ячейка -> все поле заполнено
    private static boolean isDraw(){
        for (int i = 0; i < size_Y; i++) {
            for (int j = 0; j < size_X; j++) {
                if (field[i][j] == EMPTY_DOT){
                    return false;
                }

            }

        }
        return true;
    }

    private static boolean checkWin(char sym) {
        for (int i = 0; i < size_Y; i++) {
            for (int j = 0; j < size_X; j++) {
                if (field[i][j] == sym) {
                      return false;
                }
            }
        }
        return true;
    }

    public static void main (String [] args){
        initField();
        printField();
        while (true){
            playerStep();
            printField();
            if(checkWin(PLAYER_DOT)){
                System.out.println("Player WIN!");
                break;
            }
            if(isDraw()){
                System.out.println("DRAW");
                break;
            }
            aiStep();
            printField();
            if(checkWin(AI_DOT)) {
                System.out.println("AI WIN!");
            }
            if(isDraw()){
                System.out.println("DRAW");
                break;
            }
        }
    }

}
