package puzzles.ez.mersenne_prime;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
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
        int calcTo = Integer.parseInt(input);

        int n = 2;
        int tmp = 0;

        List<Integer> items = new ArrayList<>();

        while (true) {
            if (isPrime(n)) {
                tmp = (int) (Math.pow(2, n) - 1);
                if (tmp < calcTo) {
                    n++;
                    items.add(tmp);
                } else {
                    break;
                }
            } else {
                n++;
                continue;
            }
        }

        StringBuilder sb = new StringBuilder();
        for (Integer item : items) {
            sb.append(item).append(", ");
        }
        return sb.toString().substring(0, sb.length() - 2);
    }

    static boolean isPrime(int value) {
        if (value == 1) {
            return false;
        }
        if (value == 2) {
            return true;
        }
        if (value % 2 == 0) {
            return false;
        }
        double sqrt = Math.sqrt(value);
        int maxDivider = Double.valueOf(Math.ceil(sqrt)).intValue();
        int startDivider = 3;
        for (int i = startDivider; i <= maxDivider; i++) {
            if (value % i == 0) {
                return false;
            }
        }
        return true;
    }

}
