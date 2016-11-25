package puzzles.ez.trick_or_treat;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

/**
 * Created by Vyacheslav on 17.11.2016.
 */


public class TestMain {

    @Test
    public void testMain() {
        String input = "Vampires: 1, Zombies: 1, Witches: 1, Houses: 1";

        int result = Main.doWork(input);
        int expected = 4;

        assertEquals(expected, result);
    }

    @Test
    public void testMain1() {
        String input = "Vampires: 3, Zombies: 2, Witches: 1, Houses: 10";

        int result = Main.doWork(input);
        int expected = 36;

        assertEquals(expected, result);
    }
}
