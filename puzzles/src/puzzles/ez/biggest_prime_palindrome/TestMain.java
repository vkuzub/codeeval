package puzzles.ez.biggest_prime_palindrome;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

/**
 * Created by Vyacheslav on 17.11.2016.
 */


public class TestMain {

    @Test
    public void testMain() {
        String input = "200";

        int result = Main.doWork(input);
        int expected = 191;

        assertEquals(expected, result);
    }

    @Test
    public void testMain2() {
        String input = "191";

        boolean result = Main.isPalindrome(Integer.parseInt(input));
        boolean expected = true;

        assertEquals(expected, result);
    }

    @Test
    public void testMain4() {
        String input = "11";

        boolean result = Main.isPalindrome(Integer.parseInt(input));
        boolean expected = true;

        assertEquals(expected, result);
    }

    @Test
    public void testMain3() {
        String input = "10";

        boolean result = Main.isPalindrome(Integer.parseInt(input));
        boolean expected = false;

        assertEquals(expected, result);
    }

    @Test
    public void testMain5() {
        String input = "1";

        boolean result = Main.isPalindrome(Integer.parseInt(input));
        boolean expected = true;

        assertEquals(expected, result);
    }

}
