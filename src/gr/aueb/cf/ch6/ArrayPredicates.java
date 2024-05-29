package gr.aueb.cf.ch6;

import java.util.Scanner;

public class ArrayPredicates {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int[] arr = new int[6];
        int inputNum = 0;

        for (int i = 0; i < arr.length; i++ ) {
            System.out.println("Please give a number from 1 up to 49");
            inputNum = in.nextInt();
            while (inputNum < 1 || inputNum > 49) {
                System.out.println("Incorrect value, please give a number from 1 up to 49");
                inputNum = in.nextInt();
            }
            arr[i] = inputNum;
        }

        System.out.println("Array has no more than 3 even numbers: " + areLTEven(arr, 3));
        System.out.println("Array has no more than 3 odd numbers: " + areLTOdd(arr, 3));
        System.out.println("Array has no more than 3 consecutive numbers: " + hasLTConsecutive(arr));
        System.out.println("Array has no more than 3 numbers with same ending: " + hasLTSameEnd(arr, 3));
        System.out.println("Array has no more than 3 numbers in the same group of ten: " + hasLTSameGroupOfTen(arr, 3));

        }

        public static boolean areLTEven(int[] arr, int threshold) {
        int count = 0;
        for (int value : arr ) {
            if(value % 2 == 0) count++;
        }
        return count <= threshold;
        }

        public static boolean areLTOdd(int[] arr, int threshold) {
        int count = 0;
            for (int value : arr ) {
                if(value % 2 != 0) count++;
            }
            return count <= threshold;
        }

        public static boolean hasLTConsecutive(int[] arr) {
        boolean hasLT4Cons = true;
        for(int i = 0; i < arr.length - 3; i++) {
            if ((arr[i] == arr[i+1] - 1) && (arr[i] == arr[i+2] - 2) && (arr[i] == arr[i+3] - 3)) {
                hasLT4Cons = false;
                break;
            }
        }
        return hasLT4Cons;
        }

        public static boolean hasLTSameEnd(int[] arr, int threshold) {
        boolean underThresh = true;
        int[] endings = new int[10];
        for (int value : arr) {
            endings[value % 10]++;
        }
        for (int value : endings) {
            if (value > threshold) {
                underThresh = false;
                break;
            }
        }
        return underThresh;
        }

        public static boolean hasLTSameGroupOfTen(int[] arr, int threshold) {
        boolean underThresh = true;
        int[] tens = new int[10];
            for (int value : arr) {
                tens[value / 10]++;
            }
            for (int value : tens) {
                if (value > threshold) {
                    underThresh = false;
                    break;
                }
            }
            return underThresh;
        }


    }

