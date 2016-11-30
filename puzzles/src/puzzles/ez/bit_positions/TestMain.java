package puzzles.ez.bit_positions;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

/**
 * Created by Vyacheslav on 17.11.2016.
 */


public class TestMain {

    @Test
    public void testMain() {
        String input = "86,2,3";

        String result = Main.doWork(input);
        String expected = "true";

        assertEquals(expected, result);
    }

    @Test
    public void testMain1() {
        String input = "125,1,2";

        String result = Main.doWork(input);
        String expected = "false";

        assertEquals(expected, result);
    }

}
