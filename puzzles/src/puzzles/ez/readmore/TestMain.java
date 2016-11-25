package puzzles.ez.readmore;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

/**
 * Created by Vyacheslav on 17.11.2016.
 */


public class TestMain {

    @Test
    public void testMain1() {
        String input = "Tom exhibited.";

        String result = Main.doWork(input);
        String expected = "Tom exhibited.";

        assertEquals(expected, result);
    }

    @Test
    public void testMain2() {
        String input = "Amy Lawrence was proud and glad, and she tried to make Tom see it in her face - but he wouldn't look.";

        String result = Main.doWork(input);
        String expected = "Amy Lawrence was proud and glad, and... <Read More>";

        assertEquals(expected, result);
    }

    @Test
    public void testMain3() {
        String input = "Tom was tugging at a button-hole and looking sheepish.";

        String result = Main.doWork(input);
        String expected = "Tom was tugging at a button-hole and looking sheepish.";

        assertEquals(expected, result);
    }

    @Test
    public void testMain4() {
        String input = "Two thousand verses is a great many - very, very great many.";

        String result = Main.doWork(input);
        String expected = "Two thousand verses is a great many -... <Read More>";

        assertEquals(expected, result);
    }

    @Test
    public void testMain5() {
        String input = "Tom's mouth watered for the apple, but he stuck to his work.";

        String result = Main.doWork(input);
        String expected = "Tom's mouth watered for the apple, but... <Read More>";

        assertEquals(expected, result);
    }

    @Test
    public void testMain6() {
        String input = "123456789A123456789B123456789C123456789D 23456789E1234 6";

        String result = Main.doWork(input);
        String expected = "123456789A123456789B123456789C123456789D... <Read More>";

        assertEquals(expected, result);
    }

    @Test
    public void testMain7() {
        String input = "123456789A123456789B123456789C123456789D123456789E123456789F123456789G";

        String result = Main.doWork(input);
        String expected = "123456789A123456789B123456789C123456789D... <Read More>";

        assertEquals(expected, result);
    }

    @Test
    public void testMain8() {
        String input = "That's what she said, Jim while - I sewed her worlds - it's all of water.";

        String result = Main.doWork(input);
        String expected = "That's what she said, Jim while - I... <Read More>";

        assertEquals(expected, result);
    }

    @Test
    public void testMain9() {
        String input = "You're up and stick to have given the air hurricane-deck giving the county judge - stepped back on whitewashing - what're you can't.";

        String result = Main.doWork(input);
        String expected = "You're up and stick to have given the... <Read More>";

        assertEquals(expected, result);
    }
}
