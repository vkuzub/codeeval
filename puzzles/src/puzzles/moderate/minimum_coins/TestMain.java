package puzzles.moderate.minimum_coins;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

/**
 * Created by Vyacheslav on 17.11.2016.
 */


public class TestMain {

    @Test
    public void testMain() {
        String input = "11";

        String result = Main.doWork(input);
        String expected = "3";

        assertEquals(expected, result);
    }

    @Test
    public void testMai1() {
        String input = "20";

        String result = Main.doWork(input);
        String expected = "4";

        assertEquals(expected, result);
    }

}
