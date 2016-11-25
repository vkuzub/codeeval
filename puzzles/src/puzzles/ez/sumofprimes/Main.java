package puzzles.ez.sumofprimes;

import java.util.ArrayList;

/**
 * Created by Vyacheslav on 17.11.2016.
 */
public class Main {
    public static void main(String args[]) {
        System.out.println(doWork(1000));
    }

    static int doWork(int maxSize) {
        int result = 0;
        int tmpVal = 1;
        ArrayList<Integer> items = new ArrayList<>();
        while (items.size() != maxSize) {
            if (isPrime(tmpVal)) {
                items.add(tmpVal);
            }
            tmpVal++;
        }
        for (Integer item : items) {
            result += item;
        }
        return result;
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
