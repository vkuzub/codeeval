package puzzles.ez.biggest_prime_palindrome;

/**
 * Created by Vyacheslav on 17.11.2016.
 */
public class Main {
    public static void main(String args[]) {
        System.out.println(doWork("1000"));
    }

    static int doWork(String input) {
        int result = 0;
        int begin = Integer.parseInt(input);

        while (true) {
            if (isPrime(begin) && isPalindrome(begin)) {
                result = begin;
                break;
            }
            begin--;
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

    static boolean isPalindrome(int value) {
        String str = String.valueOf(value);
        String strRev = new StringBuilder(str).reverse().toString();
        if (str.equals(strRev)) {
            return true;
        }
        return false;
    }

}
