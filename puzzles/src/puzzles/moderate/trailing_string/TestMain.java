package puzzles.moderate.trailing_string;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

/**
 * Created by Vyacheslav on 17.11.2016.
 */


public class TestMain {

    @Test
    public void testMain() {
        String input = "Hello CodeEval,CodeEval";

        String result = Main.doWork(input);
        String expected = "1";

        assertEquals(expected, result);
    }


    @Test
    public void testMain1() {
        String input = "San Francisco,San Jose";

        String result = Main.doWork(input);
        String expected = "0";

        assertEquals(expected, result);
    }

    @Test
    public void testMain2() {
        String input = "OK,NOK";

        String result = Main.doWork(input);
        String expected = "0";

        assertEquals(expected, result);
    }

}
