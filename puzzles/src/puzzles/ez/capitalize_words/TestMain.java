package puzzles.ez.capitalize_words;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

/**
 * Created by Vyacheslav on 17.11.2016.
 */


public class TestMain {

    @Test
    public void testMain() {
        String input = "Hello world";

        String result = Main.doWork(input);
        String expected = "Hello World";

        assertEquals(expected, result);
    }

    @Test
    public void testMain2() {
        String input = "1st thing";

        String result = Main.doWork(input);
        String expected = "1st Thing";

        assertEquals(expected, result);
    }

    @Test
    public void testMain3() {
        String input = "a letter";

        String result = Main.doWork(input);
        String expected = "A Letter";

        assertEquals(expected, result);
    }

}
