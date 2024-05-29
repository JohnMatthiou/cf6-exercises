package gr.aueb.cf.ch6;

import java.util.Scanner;

public class LowAndHighIndexOfArray {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int[] arr = {0, 1, 4, 4, 4, 6, 7, 8, 8, 8, 8, 8};
        int keyValue;

        System.out.println("Give a value to search for its low and high index in the array");
        keyValue = in.nextInt();

        int[] returnedArray = getLowAndHighIndexOf(arr, keyValue);

        if (returnedArray == null) {
            System.out.println("Couldn't find low and high index of given value in the array.");
        } else {
            System.out.printf("Low index of given value: %d\n High index of given value: %d", returnedArray[0], returnedArray[1]);
        }
    }

    public static int[] getLowAndHighIndexOf(int[] arr, int key) {
        if (arr == null || arr.length == 0) return null;
        int returnedArr[] = new int[2];
        int lowPos = -1;
        int highPos = lowPos;

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == key && lowPos != -1) {
                highPos = i;
            } else if (arr[i] == key && lowPos == -1) {
                lowPos = i;
                highPos = lowPos;
            }
        }
        if (lowPos == -1) {
            return null;
        } else {
            returnedArr[0] = lowPos;
            returnedArr[1] = highPos;
            return returnedArr;
        }

    }
}
