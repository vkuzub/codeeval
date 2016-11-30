package puzzles.ez.string_mask;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

/**
 * Created by Vyacheslav on 17.11.2016.
 */


public class TestMain {

    @Test
    public void testMain() {
        String input = "hello 11001";

        String result = Main.doWork(input);
        String expected = "HEllO";

        assertEquals(expected, result);
    }

    @Test
    public void testMain1() {
        String input = "world 10000";

        String result = Main.doWork(input);
        String expected = "World";

        assertEquals(expected, result);
    }

}
