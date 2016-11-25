package puzzles.ez.hex_to_decimal;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

/**
 * Created by Vyacheslav on 17.11.2016.
 */


public class TestMain {

    @Test
    public void testMain() {
        String input = "9f";

        int result = Main.doWork(input);
        int expected = 159;

        assertEquals(expected, result);
    }

    @Test
    public void testMain1() {
        String input = "11";

        int result = Main.doWork(input);
        int expected = 17;

        assertEquals(expected, result);
    }

}
