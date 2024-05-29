package gr.aueb.cf.ch9;

import java.io.File;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Scanner;

public class LocationsInOut {
    public static void main(String[] args) {
        File inFd = new File("C:/temp/locations.txt");
        File outFd = new File("C:/temp/locations-out.txt");
        String line;
        String[] tokens;

        try (Scanner in = new Scanner(inFd);
             PrintWriter pw = new PrintWriter(outFd)) {
            while (in.hasNextLine()) {
                line = in.nextLine();
                tokens = line.split(",");
                pw.printf("{location: '%s', latitude: %s, longitude: %s }", tokens[0], tokens[1], tokens[2]);
                if (in.hasNextLine()) pw.println(",");
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
