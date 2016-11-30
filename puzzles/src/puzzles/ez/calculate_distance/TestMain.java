package puzzles.ez.calculate_distance;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

/**
 * Created by Vyacheslav on 17.11.2016.
 */


public class TestMain {

    @Test
    public void testMain() {
        String input = "(25, 4) (1, -6)";

        String result = Main.doWork(input);
        String expected = "26";

        assertEquals(expected, result);
    }

    @Test
    public void testMain2() {
        String input = "(47, 43) (-25, -11)";

        String result = Main.doWork(input);
        String expected = "90";

        assertEquals(expected, result);
    }


}
