package gr.aueb.cf.ch5;

import java.util.Scanner;


public class StarsMenu {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int choice = 0;
        int numStars = 0;

        do {
            printMenu();
            choice = in.nextInt();

            if (choice < 1 || choice > 6) {
                System.out.println("Λάθος επιλογή");
                continue;
            }

            if (choice == 6) {
                System.out.println("Επιλέξατε έξοδο");
                break;
            }

            System.out.println("Δώστε αριθμό για αστεράκια");
            numStars = in.nextInt();
            while (numStars <= 0) {
                System.out.println("Παρακαλώ δώστε αριθμό μεγαλύτερο του μηδέν");
                numStars = in.nextInt();
            }
            commandSelect(choice, numStars);

        } while (choice != 6);
    }

    public static void printMenu() {
        System.out.println("1. Εμφάνισε n οριζόντια αστεράκια");
        System.out.println("2. Εμφάνισε n αστεράκια κάθετα");
        System.out.println("3. Εμφάνισε n γραμμές με n αστεράκια");
        System.out.println("4. Εμφάνισε n γραμμές με αστεράκια 1-n");
        System.out.println("5. Εμφάνισε n γραμμές με αστεράκια n-1");
        System.out.println("6. Έξοδος από το πρόγραμμα");
        System.out.println("Δώσε επιλογή:");
    }

    public static void commandSelect(int choice, int stars) {

        switch (choice) {
            case 1:
                horizontalStars(stars);
                break;
            case 2:
                verticalStars(stars);
                break;
            case 3:
                matrixStars(stars);
                break;
            case 4:
                ascStars(stars);
                break;
            case 5:
                descStars(stars);
                break;
        }

    }

    public static void horizontalStars(int stars) {
        for (int i = 1; i <= stars; i++) {
            System.out.print('*');
        }
        System.out.println();
    }

    public static void verticalStars(int stars) {
        for (int i = 1; i <= stars; i++) {
            System.out.println('*');
        }

    }

    public static void matrixStars(int stars) {
        for (int i = 1; i <= stars; i++) {
            horizontalStars(stars);
        }

    }

    public static void ascStars(int stars) {
        for (int i = 1; i <= stars; i++) {
            horizontalStars(i);
        }
    }

    public static void descStars(int stars) {
        for (int i = stars; i >= 1; i--) {
            horizontalStars(i);
        }
    }


}



