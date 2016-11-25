package puzzles.ez.panacea;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

/**
 * Created by Vyacheslav on 17.11.2016.
 */


public class TestMain {

    @Test
    public void testMain() {
        String input = "64 6e 78 | 100101100 11110";

        boolean result = Main.doWork(input);
        boolean expected = true;

        assertEquals(expected, result);
    }

    @Test
    public void testMain3() {
        String input = "5e 7d 59 | 1101100 10010101 1100111";

        boolean result = Main.doWork(input);
        boolean expected = true;

        assertEquals(expected, result);
    }

    @Test
    public void testMain4() {
        String input = "93 75 | 1000111 1011010 1100010";

        boolean result = Main.doWork(input);
        boolean expected = false;

        assertEquals(expected, result);
    }

    @Test
    public void testMain1() {
        String input = "646e78";

        int result = Main.fromHex(input);
        int expected = 6581880;

        assertEquals(expected, result);
    }

    @Test
    public void testMain2() {
        String input = "10010110011110";

        int result = Main.fromBin(input);
        int expected = 9630;

        assertEquals(expected, result);
    }

}
