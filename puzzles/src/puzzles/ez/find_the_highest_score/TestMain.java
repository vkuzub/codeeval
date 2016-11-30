package puzzles.ez.find_the_highest_score;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

/**
 * Created by Vyacheslav on 17.11.2016.
 */


public class TestMain {

    @Test
    public void testMain() {
        String input = "72 64 150 | 100 18 33 | 13 250 -6";

        String result = Main.doWork(input);
        String expected = "100 250 150";

        assertEquals(expected, result);
    }

    @Test
    public void testMain1() {
        String input = "10 25 -30 44 | 5 16 70 8 | 13 1 31 12";

        String result = Main.doWork(input);
        String expected = "13 25 70 44";

        assertEquals(expected, result);
    }

}
