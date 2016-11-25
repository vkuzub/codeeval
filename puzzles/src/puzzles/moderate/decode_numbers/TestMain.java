package puzzles.moderate.decode_numbers;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

/**
 * Created by Vyacheslav on 17.11.2016.
 */


public class TestMain {

    @Test
    public void testMain() {
        String input = "12";

        int result = Main.doWork(input);
        int expected = 2;

        assertEquals(expected, result);
    }

    @Test
    public void testMain2() {
        String input = "123";

        int result = Main.doWork(input);
        int expected = 3;

        assertEquals(expected, result);
    }

    @Test
    public void testMain3() {
        String input = "1223";

        int result = Main.doWork(input);
        int expected = 4;

        assertEquals(expected, result);
    }

    @Test
    public void testMain4() {
        String input = "1";

        int result = Main.doWork(input);
        int expected = 1;

        assertEquals(expected, result);
    }

    @Test
    public void testMain5() {
        String input = "999999";

        int result = Main.doWork(input);
        int expected = 1;

        assertEquals(expected, result);
    }

}
