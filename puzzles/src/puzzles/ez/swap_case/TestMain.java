package puzzles.ez.swap_case;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

/**
 * Created by Vyacheslav on 17.11.2016.
 */


public class TestMain {

    @Test
    public void testMain() {
        String input = "Hello world!";

        String result = Main.doWork(input);
        String expected = "hELLO WORLD!";

        assertEquals(expected, result);
    }

    @Test
    public void testMain2() {
        String input = "JavaScript language 1.8";

        String result = Main.doWork(input);
        String expected = "jAVAsCRIPT LANGUAGE 1.8";

        assertEquals(expected, result);
    }

    @Test
    public void testMain3() {
        String input = "A letter";

        String result = Main.doWork(input);
        String expected = "a LETTER";

        assertEquals(expected, result);
    }

}
