package puzzles.ez.stepwise_word;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

/**
 * Created by Vyacheslav on 17.11.2016.
 */


public class TestMain {

    @Test
    public void testMain() {
        String input = "cat dog hello";

        String result = Main.doWork(input);
        String expected = "h *e **l ***l ****o";

        assertEquals(expected, result);
    }

    @Test
    public void testMain1() {
        String input = "stop football play";

        String result = Main.doWork(input);
        String expected = "f *o **o ***t ****b *****a ******l *******l";

        assertEquals(expected, result);
    }

}
