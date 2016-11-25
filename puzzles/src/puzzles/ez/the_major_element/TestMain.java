package puzzles.ez.the_major_element;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

/**
 * Created by Vyacheslav on 17.11.2016.
 */


public class TestMain {


    @Test
    public void testMain0() {
        String input = "1,2,3,1,1,2,1,1";

        String result = Main.doWork(input);
        String expected = "1";

        assertEquals(expected, result);
    }

    @Test
    public void testMain() {
        String input = "92,19,19,76,19,21,19,85,19,19,19,94,19,19,22,67,83,19,19,54,59,1,19,19";

        String result = Main.doWork(input);
        String expected = "19";

        assertEquals(expected, result);
    }

    @Test
    public void testMain2() {
        String input = "92,11,30,92,1,11,92,38,92,92,43,92,92,51,92,36,97,92,92,92,43,22,84,92,92";

        String result = Main.doWork(input);
        String expected = "92";

        assertEquals(expected, result);
    }


    @Test
    public void testMain3() {
        String input = "4,79,89,98,48,42,39,79,55,70,21,39,98,16,96,2,10,24,14,47,0,50,95,20,95,48,50,12,42";

        String result = Main.doWork(input);
        String expected = "None";

        assertEquals(expected, result);
    }
}
