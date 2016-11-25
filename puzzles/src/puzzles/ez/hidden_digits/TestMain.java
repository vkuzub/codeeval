package puzzles.ez.hidden_digits;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

/**
 * Created by Vyacheslav on 17.11.2016.
 */


public class TestMain {

    @Test
    public void testMain() {
        String input = "abcdefghik";

        String result = Main.doWork(input);
        String expected = "012345678";

        assertEquals(expected, result);
    }

    @Test
    public void testMain1() {
        String input = "Xa,}A#5N}{xOBwYBHIlH,#W";

        String result = Main.doWork(input);
        String expected = "05";

        assertEquals(expected, result);
    }

    @Test
    public void testMain2() {
        String input = "(ABW>'yy^'M{X-K}q,";

        String result = Main.doWork(input);
        String expected = "NONE";

        assertEquals(expected, result);
    }

    @Test
    public void testMai3() {
        String input = "6240488";

        String result = Main.doWork(input);
        String expected = "6240488";

        assertEquals(expected, result);
    }
}

