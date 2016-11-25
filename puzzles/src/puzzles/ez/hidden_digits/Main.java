package puzzles.ez.hidden_digits;

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
        StringBuilder result = new StringBuilder();
        char[] chars = input.toCharArray();
        for (int i = 0; i < chars.length; i++) {
            char symbol = chars[i];
            if (Character.isDigit(symbol)) {
                result.append(symbol);
                continue;
            }
            if (symbol == 'a') {
                result.append("0");
                continue;
            }
            if (symbol == 'b') {
                result.append("1");
                continue;
            }
            if (symbol == 'c') {
                result.append("2");
                continue;
            }
            if (symbol == 'd') {
                result.append("3");
                continue;
            }
            if (symbol == 'e') {
                result.append("4");
                continue;
            }
            if (symbol == 'f') {
                result.append("5");
                continue;
            }
            if (symbol == 'g') {
                result.append("6");
                continue;
            }
            if (symbol == 'h') {
                result.append("7");
                continue;
            }
            if (symbol == 'i') {
                result.append("8");
                continue;
            }
            if (symbol == 'j') {
                result.append("9");
            }
        }

        if (result.length() == 0) {
            return "NONE";
        }

        return result.toString();
    }

}
