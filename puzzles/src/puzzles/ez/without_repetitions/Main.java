package puzzles.ez.without_repetitions;

import java.io.File;
import java.io.IOException;
import java.util.*;

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

        StringBuilder sb = new StringBuilder();
        char[] chars = input.toCharArray();
        char tmp = chars[0];
        for (int i = 0; i < chars.length; i++) {
            if (i == 0) {
                sb.append(Character.toString(tmp));
                continue;
            }
            if (tmp == chars[i]) {
                continue;
            } else {
                sb.append(Character.toString(chars[i]));
                tmp = chars[i];
            }
        }

        return sb.toString().trim();
    }

}
