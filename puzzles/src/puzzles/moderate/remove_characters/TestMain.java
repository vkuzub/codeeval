package puzzles.moderate.remove_characters;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

/**
 * Created by Vyacheslav on 17.11.2016.
 */


public class TestMain {

    @Test
    public void testMain() {
        String input = "how are you, abc";

        String result = Main.doWork(input);
        String expected = "how re you";

        assertEquals(expected, result);
    }

    @Test
    public void testMain1() {
        String input = "hello world, def";

        String result = Main.doWork(input);
        String expected = "hllo worl";

        assertEquals(expected, result);
    }

}
