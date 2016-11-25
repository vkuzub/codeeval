package puzzles.moderate.longest_lines;

import org.junit.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import static org.junit.Assert.assertEquals;

/**
 * Created by Vyacheslav on 17.11.2016.
 */


public class TestMain {

    @Test
    public void testMain() {
        List<String> input = new ArrayList<>(Arrays.asList("2", "Hello world", "CodeEval", "Quick Fox", "A", "San Francisco"));

        List<String> result = Main.doWork(input);
        List<String> expected = new ArrayList<>(Arrays.asList("San Francisco", "Hello world"));

        assertEquals(expected, result);
    }


}
