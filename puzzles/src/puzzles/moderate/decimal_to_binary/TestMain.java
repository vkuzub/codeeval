package puzzles.moderate.decimal_to_binary;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

/**
 * Created by Vyacheslav on 17.11.2016.
 */


public class TestMain {

    @Test
    public void testMain() {
        String input = "67";

        String result = Main.doWork(input);
        String expected = "1000011";

        assertEquals(expected, result);
    }


}
