package gr.aueb.cf.ch6;

import java.util.Arrays;
import java.util.Scanner;

public class ArrayMenu {

    static Scanner in = new Scanner(System.in);

    public static void main(String[] args) {
        int[] arr = {2, 23, 11, 5, 8, 44, 19, 33, 31, 56};
        int choice = 0;
        int searchNumPos = -1;
        int[] mappedArray;
        boolean atleastOnePosit = false;
        boolean allPositive = true;

        while (true) {
            printMenu();
            choice = getChoice();
            if (choice < 1 || choice > 6) {
                System.out.println("Please enter a valid selection");
                continue;
            }

            switch (choice) {
                case 1:
                    searchNumPos = searchNum(arr);
                    if (searchNumPos == -1) {
                        System.out.println("Number was not found in the array.");
                    } else {
                        System.out.printf("Number was found at position %d of the array\n", searchNumPos + 1);
                    }
                    continue;
                case 2:
                    printEvenNums(arr);
                    continue;
                case 3:
                    mappedArray = mapDouble(arr);
                    System.out.println(Arrays.toString(mappedArray));
                    continue;
                case 4:
                    atleastOnePosit = checkForPositive(arr);
                    System.out.println("At least one value positive: " + atleastOnePosit);
                    continue;
                case 5:
                    allPositive = checkIfAllPositive(arr);
                    System.out.println("All values positive: " + allPositive);
                    continue;
                default:
                    System.out.println("Exiting program.");
                    break;
            }
            break;
        }
    }

    public static void printMenu() {
        System.out.println("Choose one of the following functions");
        System.out.println("1. Search array for a specific value.");
        System.out.println("2. Print the even values of the array.");
        System.out.println("3. Double each value of the original array.");
        System.out.println("4. Check if there is at least one positive value in the array.");
        System.out.println("5. Check if all values of the array are positive.");
        System.out.println("6. Exit");
    }

    public static int getChoice() {
        return in.nextInt();
    }

    public static int searchNum(int[] arr) {
        int position = -1;
        int num = 0;
        System.out.println("Give an integer number to search for in the array");
        num = in.nextInt();
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == num) {
                position = i;
                break;
            }
        }
        return position;
    }

    public static void printEvenNums(int[] arr) {
        int count = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] % 2 == 0) {
                count++;
                System.out.print(arr[i] + " ");
            }
        }
        if (count == 0) System.out.println("There are no even numbers in the array.");
        System.out.println();
    }

    public static int[] mapDouble(int[] arr) {
        int[] returnedArray = new int[arr.length];
        for (int i = 0; i < arr.length; i++) {
            returnedArray[i] = arr[i] * 2;
        }
        return returnedArray;
    }

    public static boolean checkForPositive(int[] arr) {
        boolean checkPositive = false;
        for (int item : arr) {
            if (item > 0) {
                checkPositive = true;
                break;
            }
        }
        return checkPositive;
    }

    public static boolean checkIfAllPositive(int[] arr) {
        boolean checkAllPositives = true;
        for (int item : arr) {
            if (item < 0) {
                checkAllPositives = false;
                break;
            }
        }
        return checkAllPositives;
    }

}
