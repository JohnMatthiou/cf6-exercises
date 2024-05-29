package gr.aueb.cf.ch6;

public class MaxSimultaneouslyParkedCars {
    public static void main(String[] args) {
        int[][] arrDepTimes = {{1012, 1136}, {1317, 1417}, {1015, 1020}};

        System.out.println("Max number of cars parked together at the same time: " + getMaxParkedCars(arrDepTimes));

    }

    public static int getMaxParkedCars(int[][] arr) {
        int[][] formattedArr = formatArray(arr);
        sortArr(formattedArr);
        int counter = 0;
        int Maxcounter = 0;

        for (int i = 0; i < formattedArr.length - 1; i++) {
            if (formattedArr[i][1] == 1) {
                counter++;
            } else {
                if (counter > Maxcounter) Maxcounter = counter;
                counter--;
            }
        }
        return Maxcounter;
    }

    public static int[][] formatArray(int[][] arr) {
        int[][] returnedArr = new int[arr.length * 2][];

        for (int i = 0; i < arr.length; i++) {
            returnedArr[i * 2] = new int[2];
            returnedArr[i * 2 + 1] = new int[2];
            returnedArr[i * 2][0] = arr[i][0];
            returnedArr[i * 2][1] = 1;
            returnedArr[i * 2 + 1][0] = arr[i][1];
            returnedArr[i * 2 + 1][1] = 0;
        }
        return returnedArr;
    }

    public static void sortArr(int[][] arr) {
        for (int i = 0; i < arr.length - 1; i++) {
            int min = arr[i][0];
            int minPos = i;
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[j][0] < min) {
                    min = arr[j][0];
                    minPos = j;
                }
            }
            int[] temp = arr[i];
            arr[i] = arr[minPos];
            arr[minPos] = temp;
        }
    }


}




