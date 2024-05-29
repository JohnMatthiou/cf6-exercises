package gr.aueb.cf.ch6;

public class FindSecondMinimum {
    public static void main(String[] args) {
        int[] arr = {34, 84, 5, 28, 99, 100, 101, 8, 72, 64, 8};
        int secondMinPos = -1;

        secondMinPos = getSecondMinPos(arr);
        if (secondMinPos == -1) {
            System.out.println("Error. Couldn't find second smallest value of the array.");
        } else {
            System.out.println("Second smallest value: " + arr[secondMinPos]);
        }
    }

    public static int getSecondMinPos(int[] arr) {
        int minPos = 0;
        int minValue = arr[0];
        Integer secondMinVal = null;
        int secondMinPos = -1;

        if (arr == null || arr.length < 2) return -1;
        for (int i = 1; i < arr.length; i++) {
            if (arr[i] < minValue) {
                secondMinVal = minValue;
                secondMinPos = minPos;
                minValue = arr[i];
                minPos = i;
            } else if (arr[i] > minValue) {
                if (secondMinVal == null || arr[i] < secondMinVal) {
                    secondMinVal = arr[i];
                    secondMinPos = i;
                }
            }
        }
        return secondMinPos;
    }
}
