package puzzles.ez.file_size;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

/**
 * Created by Vyacheslav on 17.11.2016.
 */


public class TestMain {

    @Test
    public void testMain() {
        String input = "C://1.txt";

        long result = Main.doWork(input);
        long expected = 4;

        assertEquals(expected, result);
    }

}
