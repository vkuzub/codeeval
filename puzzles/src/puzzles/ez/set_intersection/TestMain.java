package puzzles.ez.set_intersection;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

/**
 * Created by Vyacheslav on 17.11.2016.
 */


public class TestMain {

    @Test
    public void testMain() {
        String input = "1,2,3,4;4,5,6";

        String result = Main.doWork(input);
        String expected = "4";

        assertEquals(expected, result);
    }

    @Test
    public void testMain1() {
        String input = "20,21,22;45,46,47";

        String result = Main.doWork(input);
        String expected = "";

        assertEquals(expected, result);
    }

    @Test
    public void testMain2() {
        String input = "7,8,9;8,9,10,11,12";

        String result = Main.doWork(input);
        String expected = "8,9";

        assertEquals(expected, result);
    }

}
