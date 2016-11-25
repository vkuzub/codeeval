package puzzles.ez.real_fake;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

/**
 * Created by Vyacheslav on 17.11.2016.
 */


public class TestMain {

    @Test
    public void testMain() {
        String input = "9999 9999 9999 9999";

        boolean result = Main.doWork(input);
        boolean expected = false;

        assertEquals(expected, result);
    }

    @Test
    public void testMain1() {
        String input = "9999 9999 9999 9993";

        boolean result = Main.doWork(input);
        boolean expected = true;

        assertEquals(expected, result);
    }

    @Test
    public void testMain2() {
        String input = "1234 5678 9876 5432";

        boolean result = Main.doWork(input);
        boolean expected = true;

        assertEquals(expected, result);
    }

    @Test
    public void testMain3() {
        String input = "5168 7427 0187 4055";

        boolean result = Main.doWork(input);
        boolean expected = false;

        assertEquals(expected, result);
    }

    @Test
    public void testMain4() {
        String input = "4731 2117 0456 8215";

        boolean result = Main.doWork(input);
        boolean expected = false;

        assertEquals(expected, result);
    }

    @Test
    public void testMain5() {
        String input = "0000 0000 0000 0000";

        boolean result = Main.doWork(input);
        boolean expected = false;

        assertEquals(expected, result);
    }

    @Test
    public void testMain6() {
        String input = "1111 1111 1111 1111";

        boolean result = Main.doWork(input);
        boolean expected = false;

        assertEquals(expected, result);
    }

    @Test
    public void testMain7() {
        String input = "9076 6595 5442 5386";

        boolean result = Main.doWork(input);
        boolean expected = false;

        assertEquals(expected, result);
    }

    @Test
    public void testMain8() {
        String input = "7747 4926 2026 1726";

        boolean result = Main.doWork(input);
        boolean expected = false;

        assertEquals(expected, result);
    }

}
