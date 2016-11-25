package puzzles.ez.testing;

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
        String[] arr = input.split(" \\| ");
        if (arr.length >= 2) {
            String result = arr[0];
            String expected = arr[1];
            char[] resArr = result.toCharArray();
            char[] exArr = expected.toCharArray();
            int n = 0;
            for (int i = 0; i < exArr.length; i++) {
                if (resArr[i] != exArr[i]) {
                    n++;
                }
            }

            if (result.equals(expected)) {
                return "Done";
            }

            if (n <= 2) {
                return "Low";
            }

            if (n <= 4) {
                return "Medium";
            }

            if (n <= 6) {
                return "Medium";
            }

            if (n > 6) {
                return "Critical";
            }


        }
        return "Done";
    }

}
