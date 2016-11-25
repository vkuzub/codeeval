package puzzles.ez.armstrong;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

/**
 * Created by Vyacheslav on 17.11.2016.
 */


public class TestMain {

    @Test
    public void testMain() {
        String input = "1";

        boolean result = Main.doWork(input);
        boolean expected = true;

        assertEquals(expected, result);
    }

    @Test
    public void testMain1() {
        String input = "153";

        boolean result = Main.doWork(input);
        boolean expected = true;

        assertEquals(expected, result);
    }

    @Test
    public void testMain2() {
        String input = "222";

        boolean result = Main.doWork(input);
        boolean expected = false;

        assertEquals(expected, result);
    }

    @Test
    public void testMain3() {
        String input = "370";

        boolean result = Main.doWork(input);
        boolean expected = true;

        assertEquals(expected, result);
    }

}
