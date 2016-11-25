package puzzles.ez.sumof;

import org.junit.Test;

import java.util.ArrayList;
import java.util.Arrays;

import static org.junit.Assert.assertEquals;

/**
 * Created by Vyacheslav on 17.11.2016.
 */


public class TestMain {

    @Test
    public void testMain() {
        ArrayList<Integer> input = new ArrayList<>(Arrays.asList(5, 12));

        int result = Main.doWork(input);
        int expected = 17;

        assertEquals(expected, result);
    }
}
