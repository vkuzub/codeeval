package puzzles.ez.swap_case;

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
            resutl.append(swapCase(s)).append(" ");
        }
        return resutl.toString().trim();
    }

    static String swapCase(String string) {
        char[] chars = string.toCharArray();
        for (int i = 0; i < chars.length; i++) {
            char letter = chars[i];
            if (Character.isUpperCase(letter)) {
                chars[i] = Character.toLowerCase(chars[i]);
            } else {
            chars[i] = Character.toUpperCase(chars[i]);}
        }
        return new String(chars);
    }

}
