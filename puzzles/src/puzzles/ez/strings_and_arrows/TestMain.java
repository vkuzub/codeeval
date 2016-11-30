package puzzles.ez.strings_and_arrows;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

/**
 * Created by Vyacheslav on 17.11.2016.
 */


public class TestMain {

    @Test
    public void testMain() {
        String input = "<--<<--<<";

        String result = Main.doWork(input);
        String expected = "2";

        assertEquals(expected, result);
    }

    @Test
    public void testMain3() {
        String input = ">>-->>-->";

        String result = Main.doWork(input);
        String expected = "2";

        assertEquals(expected, result);
    }

    @Test
    public void testMain1() {
        String input = ">><<--><--<<-->>-->>>>--<<<-----<--<<-->>";

        String result = Main.doWork(input);
        String expected = "3";

        assertEquals(expected, result);
    }

    @Test
    public void testMain2() {
        String input = "<<>>--><--<<--<<>>>--><";

        String result = Main.doWork(input);
        String expected = "4";

        assertEquals(expected, result);
    }

}
