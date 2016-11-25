package puzzles.ez.swap_numbers;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
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

                System.out.println(doWork(line));
            }

            scanner.close();
        } catch (IOException e) {
        }
    }

    static String doWork(String input) {
        StringBuilder result = new StringBuilder();
        ArrayList<String> items = new ArrayList<>(Arrays.asList(input.split(" ")));
        for (String item : items) {
            int lastChar = item.length() - 1;
            String first = String.valueOf(item.charAt(0));
            String last = String.valueOf(item.charAt(lastChar));
            result.append(last + item.substring(1, lastChar) + first).append(" ");
        }
        return result.toString().trim();
    }

}
