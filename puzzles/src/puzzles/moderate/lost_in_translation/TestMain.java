package puzzles.moderate.lost_in_translation;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

/**
 * Created by Vyacheslav on 17.11.2016.
 */


public class TestMain {

    @Test
    public void testMain() {
        String input = "rbc vjnmkf kd yxyqci na rbc zjkfoscdd ew rbc ujllmcp";

        String result = Main.doWork(input);
        String expected = "the public is amazed by the quickness of the juggler";

        assertEquals(expected, result);
    }

    @Test
    public void testMain1() {
        String input = "tc rbkso rbyr ejp mysljylc kd kxveddknmc re jsicpdrysi";

        String result = Main.doWork(input);
        String expected = "we think that our language is impossible to understand";

        assertEquals(expected, result);
    }

    @Test
    public void testMain2() {
        String input = "de kr kd eoya kw aej icfkici re zjkr";

        String result = Main.doWork(input);
        String expected = "so it is okay if you decided to quit";

        assertEquals(expected, result);
    }

}
