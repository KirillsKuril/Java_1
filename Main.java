package Lesson_2;

import java.util.Arrays;

public class Main {

    public static void main(String[] args) {
        invertArray();
        fillArray();
        changeArray();
        fillDiagonal();
        findMinMax();
    }

    public static void invertArray(){ //задание 1
        int [] arr = {1,0,1,0,0,1};
        System.out.println("arr.length: " + arr.length);
        for (int i = 0; i < arr.length; i++) {
        if(arr[i] == 1){
            arr[i] = 0;
        }else{
            arr[i] = 1;
        }
        }
        System.out.print(Arrays.toString(arr));
        System.out.println();
    }

    public static void fillArray() {
          int[] arr = new int[8];
          System.out.println("arr.length: " + arr.length);
          for (int i = 0, j = 0; i < arr.length && j <= 21; i++, j = j + 3) {
          System.out.print("" + j);

          }
           System.out.println();
        }

    public static void changeArray() {
        int[] arr = {1, 5, 3, 2, 11, 4, 5, 2, 4, 8, 9, 1};
        System.out.println("arr.length: " + arr.length);
        for (int i = 0; i <arr.length; i++) {
            if(arr[i] < 6){
                arr[i] = arr[i] * 2;
            }
        System.out.print(arr[i] + "");
        }
        System.out.println();
    }

    public static void fillDiagonal(){
        int [][] arr = new int [4][4];
        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < 4; j++) {
                arr[i][i] = 1;
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }
    }



    public static void findMinMax(){

        int[] arr = {1, 5, 3, 2, 11, 4, 5, 2, 4, 8, 9, 1};
        System.out.println("arr.length: " + arr.length);
        int min = arr[0];
        int max = arr[0];
        for (int i = 0; i < arr.length; i++) {

            if (arr[i] < min){
                min = arr[i];
            } else if(arr[i] > max){
                max = arr[i];
            }

        }
        System.out.print(min + " " + max);
    }
}