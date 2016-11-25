package puzzles.moderate.first_non_repeat_char;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

/**
 * Created by Vyacheslav on 17.11.2016.
 */


public class TestMain {

    @Test
    public void testMain() {
        String input = "yellow";

        String result = Main.doWork(input);
        String expected = "y";

        assertEquals(expected, result);
    }


    @Test
    public void testMain2() {
        String input = "tooth";

        String result = Main.doWork(input);
        String expected = "h";

        assertEquals(expected, result);
    }


}
