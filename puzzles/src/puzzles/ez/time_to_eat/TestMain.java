package puzzles.ez.time_to_eat;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

/**
 * Created by Vyacheslav on 17.11.2016.
 */


public class TestMain {

    @Test
    public void testMain() {
        String input = "02:26:31 14:44:45 09:53:27";

        String result = Main.doWork(input);
        String expected = "14:44:45 09:53:27 02:26:31";

        assertEquals(expected, result);
    }

    @Test
    public void testMain1() {
        String input = "05:33:44 21:25:41";

        String result = Main.doWork(input);
        String expected = "21:25:41 05:33:44";

        assertEquals(expected, result);
    }


}
