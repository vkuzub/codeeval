package puzzles.ez.happy_numbers;

import java.io.File;
import java.io.IOException;
import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

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

                if (doWork(Integer.parseInt(line))) {
                    System.out.println(1);
                } else {
                    System.out.println(0);
                }
            }

            scanner.close();
        } catch (IOException e) {
        }
    }

    static boolean doWork(int value) {

        Set<Integer> items = new HashSet<>();
        while (!items.contains(value)) {
            items.add(value);

            value = getSquares(value);
            if (value == 1) {
                return true;
            }
        }
        return false;
    }

    static int getSquares(int value) {
        int result = 0;
        while (value > 0) {
            int lastDigit = value % 10;
            result += lastDigit * lastDigit;
            value /= 10;
        }
        return result;
    }

}
