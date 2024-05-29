package gr.aueb.cf.ch2;

import java.util.Scanner;

/**
 * Διαβάζει από τον χρήστη τρείς ακεραίους που αντιστοιχούν
 * σε μέρα, μήνα και έτος και τους εμφανίζει με την μορφή ΗΗ/ΜΜ/ΕΕ
 * στην οθόνη.
 */
public class NumbersToDate {
    public static void main(String[] args) {

        //Δήλωση και αρχικοποίηση μεταβλητών
        Scanner scan = new Scanner(System.in);
        int day = 0;
        int month = 0;
        int year = 0;


        System.out.println("Please insert day, month and year");
        day = scan.nextInt();
        month = scan.nextInt();
        year = scan.nextInt();


        System.out.printf("Date is %02d/%02d/%d", day, month, (year % 100));
    }
}
