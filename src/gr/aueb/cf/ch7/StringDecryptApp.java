package gr.aueb.cf.ch7;

import java.util.Scanner;

public class StringDecryptApp {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String decryptedStr;

        System.out.println("Give an encrypted string to decrypt");
        decryptedStr = decryptString(in.nextLine());

        System.out.println("Decrypted string: " + decryptedStr);
    }

    public static String decryptString(String code) {
        char decryptedletter;
        String decryptedString = "";
        for (int i = 0; i < code.length(); i++) {
            decryptedletter = (char) (code.charAt(i) - 1);
            decryptedString += decryptedletter;
        }
        return decryptedString;
    }
}
