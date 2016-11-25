package puzzles.ez.capitalize_words;

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
        StringBuilder resutl = new StringBuilder();
        for (String s : input.split(" ")) {
            char first = s.charAt(0);
            resutl.append(String.valueOf(Character.toUpperCase(first))).append(s.substring(1, s.length())).append(" ");
        }
        return resutl.toString().trim();
    }

}
