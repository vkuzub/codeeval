package puzzles.ez.one_zero_two_zero;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

/**
 * Created by Vyacheslav on 17.11.2016.
 */


public class TestMain {

    @Test
    public void testMain() {
        String input = "2 4";

        int result = Main.doWork(input);
        int expected = 1;

        assertEquals(expected, result);
    }


    @Test
    public void testMai1() {
        String input = "1 8";

        int result = Main.doWork(input);
        int expected = 3;

        assertEquals(expected, result);
    }

    @Test
    public void testMai2() {
        String input = "1 2";

        int result = Main.doWork(input);
        int expected = 1;

        assertEquals(expected, result);
    }

    @Test
    public void testMai4() {
        String input = "1 11";

        int result = Main.doWork(input);
        int expected = 4;

        assertEquals(expected, result);
    }

    @Test
    public void testMai5() {
        String input = "3 2";

        int result = Main.doWork(input);
        int expected = 0;

        assertEquals(expected, result);
    }

    @Test
    public void testMain6() {
        String input = "3 20";

        int result = Main.doWork(input);
        int expected = 12;

        assertEquals(expected, result);
    }

}
