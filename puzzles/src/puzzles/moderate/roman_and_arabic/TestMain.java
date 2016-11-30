package puzzles.moderate.roman_and_arabic;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

/**
 * Created by Vyacheslav on 17.11.2016.
 */


public class TestMain {

    @Test
    public void testMain() {
        String input = "3M1D2C";

        String result = Main.doWork(input);
        String expected = "3700";

        assertEquals(expected, result);
    }

    @Test
    public void testMain2() {
        String input = "3X2I4X";

        String result = Main.doWork(input);
        String expected = "68";

        assertEquals(expected, result);
    }

    @Test
    public void testMain1() {
        String input = "2I3I2X9V1X";

        String result = Main.doWork(input);
        String expected = "-16";

        assertEquals(expected, result);
    }

}
