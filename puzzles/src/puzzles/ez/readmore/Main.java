package puzzles.ez.readmore;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
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
        String readMore = "... <Read More>";
        if (input.length() > 55) {
            String result = input.substring(0, 40).trim();
            List<String> items = new ArrayList<>(Arrays.asList(result.split(" ")));
            if (items.size() > 1) {
                String last = items.get(items.size() - 1);
                Character lastWordFirstChar = last.charAt(0);
                if (!Character.isWhitespace(lastWordFirstChar)) {
                    int lastWordLenght = last.length();
                    result = result.substring(0, result.length() - 1 - lastWordLenght).trim();
                }
            }
            return result + readMore;
        }
        return input;
    }

}
