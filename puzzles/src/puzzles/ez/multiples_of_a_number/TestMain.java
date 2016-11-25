package puzzles.ez.multiples_of_a_number;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

/**
 * Created by Vyacheslav on 17.11.2016.
 */


public class TestMain {

    @Test
    public void testMain() {
        String input = "13,8";

        int result = Main.doWork(input);
        int expected = 16;

        assertEquals(expected, result);
    }

    @Test
    public void testMain1() {
        String input = "17,16";

        int result = Main.doWork(input);
        int expected = 32;

        assertEquals(expected, result);
    }

    @Test
    public void testMain2() {
        String input = "12,3";

        int result = Main.doWork(input);
        int expected = 12;

        assertEquals(expected, result);
    }


    @Test
    public void testMain3() {
        String input = "11,3";

        int result = Main.doWork(input);
        int expected = 12;

        assertEquals(expected, result);
    }

}
