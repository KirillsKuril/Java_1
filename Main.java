package Lesson_3;

import java.sql.SQLOutput;
import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class Main {

    private static Scanner scanner = new Scanner(System.in);
    public static Random random = new Random();

    public static void main(String[] args) {

//        int [] mass = {6,88,4,8,1,};
//        sortBubble(mass);
//        System.out.println(Arrays.toString(mass));
//        System.out.println(Arrays.toString(getRandomNumber()));

        System.out.println(insertNumber("Введите число от 0 до 9"));
        guessTheWord("Попробуй угадать загаданное слово: " );
        scanner.close();
    }

//    public static void sortBubble(int[] mass){
//        for (int i = mass.length - 1; i >0; i--) {
//            for (int j = 0; j < i; j++) {
//                if (mass[j] > mass[j +1]){
//                    int tmp = mass[j];
//                    mass [j] = mass[j + 1];
//                    mass[j + 1] = tmp;
//                }
//            }
//
//        }
//    }

    public static int insertNumber(String msg){
        int answer = 0;
        int number = random.nextInt(9); // нижняя граница задается на "0" по дефолту. Для управления границей можно вынести декремент за границу.
        do {
            for (int i = 3; i >= 0 ; i--) {

                System.out.println(msg);
                int input_number = scanner.nextInt();

                if (input_number == number){
                    System.out.println("Вы угадали!");
                    break;
                } else if (input_number > number){
                    System.out.println("Загаданное число меньше " + input_number + " Осталось попыток:" + i);
                } else {
                    System.out.println("Загаданное число больше " + input_number + " Осталось попыток:" + i);
                }
                if (i == 0){
                    System.out.println("Вы достигли максимум попыток!");
                }
            }
            System.out.println("Повторить игру еще раз?" + " Введите 1-да или 0-нет.");
            answer = scanner.nextInt();

        } while (answer == 1);
        System.out.print("Загаданное число: " );
        return number;
//
//    }

        public static void guessTheWord(String msg){
            String[] words = {"apple", "orange", "lemon", "banana", "apricot", "avocado", "broccoli", "carrot", "cherry", "garlic", "grape", "melon", "leak", "kiwi", "mango", "mushroom", "nut", "olive", "pea", "peanut", "pear", "pepper", "pineapple", "pumpkin", "potato"};
            int pos = random.nextInt(words.length);
            System.out.println(msg);
            do {

                String input_word = scanner.next();
                if (input_word.equals(words[pos])) {
                    System.out.println("Вы угадали!");
                    break;
                } else {
                    System.out.println("Вы не угадали!");
                    for (int i = 0; i < input_word.length(); i++) {
                        for (int j = 0; j < words[pos].length(); j++) {
                            if (input_word.charAt(i) == words[pos].charAt(j)) {
                                System.out.print(words[pos].charAt(i));
                        }
                        }

                    }
                    System.out.println("###############");
                }

            } while (true);







        }
//    public static int[] getRandomNumber(){
//        int [] mass = new int[6];
//        for (int i = 0; i < mass.length; i++) {
//            mass[i] = random.nextInt(99) + 1;
//         }
//        return mass;
}





