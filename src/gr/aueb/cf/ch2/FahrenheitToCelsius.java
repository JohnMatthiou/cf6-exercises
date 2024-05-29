package gr.aueb.cf.ch2;


import java.util.Scanner;

/**
 * Διαβάζει από τον χρήστη έναν ακέραιο που αντιστοιχεί
 * σε θρεμοκρασία σε βαθμούς Fahrenheit, την μετατρέπει σε
 * βαθμούς Κελσίου και εκτυπώνει το αποτέλεσμα στην οθόνη.
 */
public class FahrenheitToCelsius {
    public static void main(String[] args) {

        //Δήλωση και αρχικοποίηση μεταβλητών
        Scanner scan = new Scanner(System.in);
        int tempInFahrenheit = 0;
        int tempInCelcius = 0;

        System.out.println("Enter temperature in Fahrenheit");
        tempInFahrenheit = scan.nextInt();

        //Τύπος για την μετατροπή σε βαθμούς Κελσίου
        tempInCelcius = 5 * (tempInFahrenheit - 32) / 9;

        //Εκτύπωση αποτελεσμάτων
        System.out.printf("Fahrenheit: %d F, Celsius: %d C", tempInFahrenheit, tempInCelcius);
    }
}
