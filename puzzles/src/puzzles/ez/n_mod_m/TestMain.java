package puzzles.ez.n_mod_m;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

/**
 * Created by Vyacheslav on 17.11.2016.
 */


public class TestMain {

    @Test
    public void testMain() {
        String input = "20,6";

        int result = Main.doWork(input);
        int expected = 20 % 6;

        assertEquals(expected, result);
    }

    @Test
    public void testMain2() {
        String input = "2,3";

        int result = Main.doWork(input);
        int expected = 2 % 6;

        assertEquals(expected, result);
    }

    @Test
    public void testMain3() {
        String input = "3,3";

        int result = Main.doWork(input);
        int expected = 3 % 3;

        assertEquals(expected, result);
    }

}
