package puzzles.ez.sumofdigits;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

/**
 * Created by Vyacheslav on 17.11.2016.
 */


public class TestMain {

    @Test
    public void testMain() {
        String input = "23";

        int result = Main.doWork(input);
        int expected = 5;

        assertEquals(expected, result);
    }

    @Test
    public void testMain1() {
        String input = "496";

        int result = Main.doWork(input);
        int expected = 19;

        assertEquals(expected, result);
    }

}
