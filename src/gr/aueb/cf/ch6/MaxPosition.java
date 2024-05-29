package gr.aueb.cf.ch6;

import java.util.Arrays;
import java.util.Scanner;

public class MaxPosition {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] arr;
        int arrSize = 0;
        int low = 0;
        int high = 0;
        int maxPos = 0;

        System.out.println("Enter size of array(number must be greater than 1):");
        arrSize = sc.nextInt();
        while (arrSize < 2) {
            System.out.println("Please enter a value greater than 1");
            arrSize = sc.nextInt();
        }
        high = arrSize - 1;
        arr = createArray(arrSize);
        maxPos = getMaxPosition(arr, low, high);
        System.out.printf("Max value: %d, Max Position: %d\n", arr[maxPos], maxPos + 1);
        System.out.println(Arrays.toString(arr));
    }

    public static int[] createArray(int size) {
        int[] arr = new int[size];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = (int) (Math.random() * 101);
        }
        return arr;
    }

    public static int getMaxPosition(int[] arr, int low, int high) {
        int maxPos = low;
        int maxValue = arr[maxPos];
        for (int i = low; i <= high; i++){
            if (arr[i] > maxValue) {
                maxValue = arr[i];
                maxPos = i;
            }
        }
        return maxPos;
    }
}
