package puzzles.ez.lowest_unique_number;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

/**
 * Created by Vyacheslav on 17.11.2016.
 */


public class TestMain {

    @Test
    public void testMain() {
        String input = "3 3 9 1 6 5 8 1 5 3";

        String result = Main.doWork(input);
        String expected = "5";

        assertEquals(expected, result);
    }

    @Test
    public void testMain1() {
        String input = "9 2 9 9 1 8 8 8 2 1 1";

        String result = Main.doWork(input);
        String expected = "0";

        assertEquals(expected, result);
    }

}
