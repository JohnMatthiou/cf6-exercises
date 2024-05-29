package gr.aueb.cf.ch4;

import java.util.Scanner;

public class VerticalStars {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int starsNum = 0;

        System.out.println("Please enter a number to print as stars ");
        starsNum = in.nextInt();

        while (starsNum <= 0) {
            System.out.println("Please enter a number greater than zero");
            starsNum = in.nextInt();
        }

        for (int i = 1; i <= starsNum; i++) {
            System.out.println('*');
        }
    }
}
