package puzzles.ez.longest_word;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

/**
 * Created by Vyacheslav on 17.11.2016.
 */


public class TestMain {

    @Test
    public void testMain() {
        String input = "some line with text";

        String result = Main.doWork(input);
        String expected = "some";

        assertEquals(expected, result);
    }

    @Test
    public void testMain1() {
        String input = "another line";

        String result = Main.doWork(input);
        String expected = "another";

        assertEquals(expected, result);
    }

}
