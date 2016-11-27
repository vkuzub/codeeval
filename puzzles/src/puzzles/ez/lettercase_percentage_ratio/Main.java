package puzzles.ez.lettercase_percentage_ratio;

import java.io.File;
import java.io.IOException;
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

                System.out.println(doWork(line));
            }

            scanner.close();
        } catch (IOException e) {
        }
    }

    static String doWork(String input) {
        char[] chars = input.toCharArray();
        int length = chars.length;
        double upperCase = 0;
        double lowerCase = 0;
        for (char aChar : chars) {
            if (Character.isUpperCase(aChar)) {
                upperCase++;
            } else {
                lowerCase++;
            }
        }

        upperCase = upperCase / length;
        lowerCase = 1 - upperCase;

        return ("lowercase: " + String.format("%.2f", lowerCase * 100) + " uppercase: " + String.format("%.2f", upperCase * 100)).replace(",", ".");
    }

}
