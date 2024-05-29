package gr.aueb.cf.ch8;

import java.util.Scanner;


public class MenuWithException {

    static Scanner in = new Scanner(System.in);

    public static void main(String[] args) {
        int choice = 0;

        while (true) {
            try {
                printMenu();
                choice = getChoice();
                if (choice == 5) {
                    System.out.println("Exiting the program.");
                    break;
                } else {
                    printChoice(choice);
                }
            } catch (IllegalArgumentException e) {
                System.out.println(e.getMessage());
            }
        }

    }

    public static void printMenu() {
        System.out.println("Please select one of the following choices");
        System.out.println("Press 1 for Choice1");
        System.out.println("Press 2 for Choice2");
        System.out.println("Press 3 for Choice3");
        System.out.println("Press 4 for Choice4");
        System.out.println("Press 5 for exit");
    }

    public static int getChoice() {

        while (true) {
            if (in.hasNextInt()) {
                break;
            } else {
                System.out.println("Please provide an integer number");
                in.nextLine();
            }
        }
        return in.nextInt();

    }

    public static void printChoice(int choice) throws IllegalArgumentException {


        if (choice > 0 && choice <= 4) {
            System.out.println("You selected choice" + choice);
        } else {
            throw new IllegalArgumentException("Invalid choice");
        }

    }

}
