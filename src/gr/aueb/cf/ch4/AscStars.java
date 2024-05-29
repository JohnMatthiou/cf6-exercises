package gr.aueb.cf.ch4;

import java.util.Scanner;

public class AscStars {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int starsNum = 0;

        System.out.println("Please enter a number to print as rows of ascending stars ");
        starsNum = in.nextInt();

        while (starsNum <= 0) {
            System.out.println("Please enter a number greater than zero");
            starsNum = in.nextInt();
        }

        for (int i = 1; i <= starsNum; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print('*');
            }
            System.out.println();
        }
    }
}
