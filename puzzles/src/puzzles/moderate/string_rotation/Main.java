package puzzles.moderate.string_rotation;

import java.io.File;
import java.io.IOException;
import java.util.Arrays;
import java.util.Scanner;

/**
 * Created by Vyacheslav on 17.11.2016.
 */
public class Main {
    public static void main(String args[]) {
        File file = new File(args[0]);

        try {
            Scanner scanner = new Scanner(file);
            while (scanner.hasNextLine()) {
                String line = scanner.nextLine();
                if (line.equals(""))
                    continue;

                if (doWork(line)) {
                    System.out.println("True");
                } else {
                    System.out.println("False");
                }
            }

            scanner.close();
        } catch (IOException e) {
        }
    }

    static boolean doWork(String input) {
        String[] split = input.split(",");
        String original = split[0];
        String rotated = split[1];
        if (original.length() != rotated.length()) {
            return false;
        }
        for (int i = 0; i < original.length(); i++) {
            rotated = shift(rotated);
            if (rotated.equals(original)) {
                return true;
            }
        }
        return false;
    }

    static String shift(String input) {
        char last = input.charAt(input.length() - 1);
        return last + input.substring(0, input.length() - 1);
    }

}
