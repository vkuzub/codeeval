package puzzles.ez.armstrong;

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

                String res = String.valueOf(doWork(line));
                res = res.substring(0, 1).toUpperCase() + res.substring(1);
                System.out.println(res);
            }

            scanner.close();
        } catch (IOException e) {
        }
    }

    static boolean doWork(String input) {
        int inputVal = Integer.parseInt(input);
        if (inputVal < 10) {
            return true;
        }
        int pow = input.length();
        char[] chars = input.toCharArray();
        int tmp = 0;
        for (char aChar : chars) {
            tmp += Math.pow(Character.getNumericValue(aChar), pow);
        }
        if (tmp == inputVal) {
            return true;
        }
        return false;
    }

}
