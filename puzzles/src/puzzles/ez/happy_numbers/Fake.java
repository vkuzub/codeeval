package puzzles.ez.happy_numbers;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.HashSet;
import java.util.Set;

/**
 * Created by Vyacheslav on 18.11.2016.
 */
public class Fake {


    public static void main(String[] args)
            throws IOException {
        File file = new File(args[0]);
        BufferedReader in = new BufferedReader(new FileReader(file));
        String line;

        while ((line = in.readLine()) != null) {
            line = line.trim();
            int n = Integer.parseInt(line);

            boolean isHappyNumber = isNumberHappy(n);

            if (isHappyNumber) {
                System.out.println(1);
            } else {
                System.out.println(0);
            }
        }
    }

    public static boolean isNumberHappy(int n) {
        Set<Integer> visited = new HashSet<Integer>();

        while (!visited.contains(n)) {
            visited.add(n);
            n = sumOfDigitSquares(n);

            if (n == 1) {
                return true;
            }
        }

        return false;
    }

    public static int sumOfDigitSquares(int n) {
        int sum = 0;

//        do {
//            int lastDigit = n % 10;
//            sum += lastDigit * lastDigit;
//            n /= 10;
//        } while (n > 1);

        while (n > 0) {
            int lastDigit = n % 10;
            sum += lastDigit * lastDigit;
            n /= 10;
        }

        return sum;
    }

}
