package puzzles.hard.longest_common_subsequence;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

/**
 * Created by Vyacheslav on 17.11.2016.
 */


public class TestMain {

    @Test
    public void testMain() {
        String input = "XMJYAUZ;MZJAWXU";

        String result = Main.doWork(input);
        String expected = "MJAU";

        assertEquals(expected, result);
    }


}
