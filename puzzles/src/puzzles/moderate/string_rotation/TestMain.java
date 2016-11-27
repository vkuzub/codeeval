package puzzles.moderate.string_rotation;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

/**
 * Created by Vyacheslav on 17.11.2016.
 */


public class TestMain {

    @Test
    public void testMain() {
        String input = "Hello,lloHe";

        boolean result = Main.doWork(input);
        boolean expected = true;

        assertEquals(expected, result);
    }

    @Test
    public void testMain1() {
        String input = "Basefont,tBasefon";

        boolean result = Main.doWork(input);
        boolean expected = true;

        assertEquals(expected, result);
    }

    @Test
    public void testMain2() {
        String input = "aBsefont,tBasefon";

        boolean result = Main.doWork(input);
        boolean expected = false;

        assertEquals(expected, result);
    }

    @Test
    public void testShift() {
        String input = "abc";

        String result = Main.shift(input);
        String expected = "cab";

        assertEquals(expected, result);
    }

    @Test
    public void testShift2() {
        String input = "ab";

        String result = Main.shift(input);
        String expected = "ba";

        assertEquals(expected, result);
    }

}
