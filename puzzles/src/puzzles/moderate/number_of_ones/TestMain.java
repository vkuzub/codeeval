package puzzles.moderate.number_of_ones;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

/**
 * Created by Vyacheslav on 17.11.2016.
 */


public class TestMain {

    @Test
    public void testMain() {
        String input = "10";

        String result = Main.doWork(input);
        String expected = "2";

        assertEquals(expected, result);
    }

    @Test
    public void testMain1() {
        String input = "22";

        String result = Main.doWork(input);
        String expected = "3";

        assertEquals(expected, result);
    }

    @Test
    public void testMain2() {
        String input = "56";

        String result = Main.doWork(input);
        String expected = "3";

        assertEquals(expected, result);
    }

}
