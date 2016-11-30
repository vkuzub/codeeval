package puzzles.ez.without_repetitions;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

/**
 * Created by Vyacheslav on 17.11.2016.
 */


public class TestMain {

    @Test
    public void testMain() {
        String input = "Shellless mollusk lives in wallless house in wellness. Aaaarrghh!";

        String result = Main.doWork(input);
        String expected = "Sheles molusk lives in wales house in welnes. Aargh!";

        assertEquals(expected, result);
    }


    @Test
    public void testMain1() {
        String input = "But as he spake he drew the good sword from its scabbard, and smote a heathen knight, Jusssstin of thee Iron Valley.";

        String result = Main.doWork(input);
        String expected = "But as he spake he drew the god sword from its scabard, and smote a heathen knight, Justin of the Iron Valey.";

        assertEquals(expected, result);
    }

}
