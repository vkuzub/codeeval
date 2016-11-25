package puzzles.ez.simple_sorting;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

/**
 * Created by Vyacheslav on 17.11.2016.
 */


public class TestMain {

    @Test
    public void testMain() {
        String input = "70.920 -38.797 14.354 99.323 90.374 7.581";

        String result = Main.doWork(input);
        String expected = "-38.797 7.581 14.354 70.920 90.374 99.323";

        assertEquals(expected, result);
    }

    @Test
    public void testMain1() {
        String input = "-37.507 -3.263 40.079 27.999 65.213 -55.552";

        String result = Main.doWork(input);
        String expected = "-55.552 -37.507 -3.263 27.999 40.079 65.213";

        assertEquals(expected, result);
    }

}
