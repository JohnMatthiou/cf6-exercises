package gr.aueb.cf.ch3;

import java.util.Scanner;

public class CrudMenu {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int input = 0;

        do {
            System.out.println("Παρακαλώ επιλέξτε ενέργεια.");
            System.out.println("1. Εισαγωγή");
            System.out.println("2. Διαγραφή");
            System.out.println("3. Ενημέρωση");
            System.out.println("4. Αναζήτηση");
            System.out.println("5. Έξοδος");
            input = scanner.nextInt();

            if (input <= 0 || input > 5) {
                System.out.println("Μη αναγνωρίσιμη εντολή, προσπαθήστε ξανά.");
                continue;
            } else if (input == 1) {
                System.out.println("Επιλέξατε Εισαγωγή");
            } else if (input == 2) {
                System.out.println("Επιλέξατε Διαγραφή");
            } else if (input == 3) {
                System.out.println("Επιλέξατε Ενημέρωση");
            } else if (input == 4) {
                System.out.println("Επιλέξατε Αναζήτηση");
            }

        } while (input != 5);
    }
}
