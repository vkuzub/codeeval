package puzzles.ez.word_to_digit;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

/**
 * Created by Vyacheslav on 17.11.2016.
 */


public class TestMain {

    @Test
    public void testMain() {
        String input = "zero;two;five;seven;eight;four";

        String result = Main.doWork(input);
        String expected = "025784";

        assertEquals(expected, result);
    }

    @Test
    public void testMain1() {
        String input = "three;seven;eight;nine;two";

        String result = Main.doWork(input);
        String expected = "37892";

        assertEquals(expected, result);
    }

}
