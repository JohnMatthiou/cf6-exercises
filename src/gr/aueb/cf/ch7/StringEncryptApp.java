package gr.aueb.cf.ch7;

import java.util.Scanner;

public class StringEncryptApp {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String encryptedStr;

        System.out.println("Give a string to encrypt");
        encryptedStr = encryptString(in.nextLine());

        System.out.println("Encrypted string: " + encryptedStr);
    }

    public static String encryptString(String message) {
        char encryptedLetter;
        String encryptedString = "";
        for (int i = 0; i < message.length(); i++) {
            encryptedLetter = (char) (message.charAt(i) + 1);
            encryptedString += encryptedLetter;
        }
        return encryptedString;
    }
}
