package puzzles.ez.swap_numbers;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

/**
 * Created by Vyacheslav on 17.11.2016.
 */


public class TestMain {

    @Test
    public void testMain() {
        String input = "4Always0 5look8 4on9 7the2 4bright8 9side7 3of8 5life5";

        String result = Main.doWork(input);
        String expected = "0Always4 8look5 9on4 2the7 8bright4 7side9 8of3 5life5";

        assertEquals(expected, result);
    }


}
