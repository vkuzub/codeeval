package puzzles.template;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

/**
 * Created by Vyacheslav on 17.11.2016.
 */


public class TestMain {

    @Test
    public void testMain() {
        String input = "1";

        String result = Main.doWork(input);
        String expected = "";

        assertEquals(expected, result);
    }


}
