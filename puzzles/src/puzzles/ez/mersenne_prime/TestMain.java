package puzzles.ez.mersenne_prime;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

/**
 * Created by Vyacheslav on 17.11.2016.
 */


public class TestMain {

    @Test
    public void testMain() {
        String input = "4";

        String result = Main.doWork(input);
        String expected = "3";

        assertEquals(expected, result);
    }

    @Test
    public void testMain1() {
        String input = "308";

        String result = Main.doWork(input);
        String expected = "3, 7, 31, 127";

        assertEquals(expected, result);
    }

}
