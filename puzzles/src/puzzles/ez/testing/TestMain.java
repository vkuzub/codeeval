package puzzles.ez.testing;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

/**
 * Created by Vyacheslav on 17.11.2016.
 */


public class TestMain {

    @Test
    public void testMain() {
        String input = "Heelo Codevval | Hello Codeeval";

        String result = Main.doWork(input);
        String expected = "Low";

        assertEquals(expected, result);
    }

    @Test
    public void testMain2() {
        String input = "hELLO cODEEVAL | Hello Codeeval";

        String result = Main.doWork(input);
        String expected = "Critical";

        assertEquals(expected, result);
    }

    @Test
    public void testMain3() {
        String input = "Hello Codeeval | Hello Codeeval";

        String result = Main.doWork(input);
        String expected = "Done";

        assertEquals(expected, result);
    }

}
