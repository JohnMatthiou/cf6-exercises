package gr.aueb.cf.ch3;

import java.util.Scanner;

public class LeapYearFinder {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int year = 0;

        System.out.println("Give a year (integer)");
        year = scanner.nextInt();

        if (year % 4 == 0 && (year % 100 != 0 || year % 400 == 0)) {
            System.out.printf("Year %d is a leap year.", year);
        } else {
            System.out.printf("Year %d is not a leap year.", year);
        }

    }
}
