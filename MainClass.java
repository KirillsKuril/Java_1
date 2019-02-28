package lesson_1;


import java.util.Scanner;

public class MainClass {
    private static Scanner scanner = new Scanner(System.in);

    public static void main (String[] args){
    getResult(5,4,3,3);
    checkRange(10,-15);
    checkNumber(-15);
    checkMinus(-20);
    printName("Kirill");
    isLeapYear(2000);
//        byte b1 = 1;
//        short sh1 = 32000;
//        int in1 = 2000000000;
//        long l1 = 2130000000000000000L;
//        float fl1 = 320.1f;
//        double d1= 620.5;
//
//        boolean bool1 = true; // false - by default;
//        char c1 = 'a';
//
//        String string = "Hello string!";



//


        }
        public static void getResult(int a, int b, int c, int d){

            int result = (a * (b + (c / d)));
            System.out.println("Ваш результат: " + result);
        }

        public static void checkRange(int e, int h){
           int sum = e + h;
        if (sum >=10 && sum <= 20) {
            System.out.println("True: " + sum);
        }
        else {
            System.out.println("False: " + sum);
        }

        }
        public static void checkNumber (int f){

            if(f >= 0) {
            System.out.println("Число положительное: " + f);
        }
        else {
            System.out.println("Число отрицательное: " + f);
        }

        }
        public static void checkMinus(int g){
        if(g < 0){
            System.out.println("Вы ввели отрицательное число: " + g);
        }

        }

        public static void printName(String name){

        System.out.println("Введите имя: " );
        name = scanner.nextLine();

        System.out.println("Вас зовут: " + name);

        }

        public static void isLeapYear (int year){

            System.out.println("Введите год: ");
            year = scanner.nextInt();

            if(year % 400 == 0 && year % 100 == 0 && year % 4 == 0) {
                System.out.println("Вы указали високосный год!");
            } else if (year % 4 == 0 && year % 100 != 0){
                System.out.println("Вы указали високосный год!");
            } else {
                System.out.println("Вы указали стандартный год!");
            }

        }
    }

