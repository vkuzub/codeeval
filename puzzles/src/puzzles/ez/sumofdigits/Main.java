package puzzles.ez.sumofdigits;

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

    static int doWork(String input) {
        int result = 0;

        char[] chars = input.toCharArray();
        for (char aChar : chars) {
            result+=Character.getNumericValue(aChar);
        }
        return result;
    }

}
