package puzzles.ez.unique_elements;

import org.junit.Test;

import java.util.ArrayList;
import java.util.Arrays;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

/**
 * Created by Vyacheslav on 17.11.2016.
 */


public class TestMain {

    @Test
    public void testMain() {
        String input = "1,1,1,2,2,3,3,4,4";

        ArrayList<Integer> result = (ArrayList<Integer>) Main.doWork(input);
        ArrayList<Integer> expected = new ArrayList<>(Arrays.asList(1, 2, 3, 4));

//        assertEquals(expected, result);
    }

    @Test
    public void testMain1() {
        String input = "2,3,4,5,5";

        ArrayList<Integer> result = (ArrayList<Integer>) Main.doWork(input);
        ArrayList<Integer> expected = new ArrayList<>(Arrays.asList(2, 3, 4, 5));

        assertEquals(expected, result);
    }

    @Test
    public void testMain2() {
        String input = "1,1,1,2,2,3,3,4,4";

        String getConcat = Main.getConcatString(Main.doWork(input));
        String expected = "1,2,3,4";

        assertEquals(expected, getConcat);
    }

    @Test
    public void testMain3() {
        String input = "12,13,14,15,15,16";

        String getConcat = Main.getConcatString(Main.doWork(input));
        String expected = "12,13,14,15,16";

        assertEquals(expected, getConcat);
    }

    @Test
    public void testMain4() {
        String input = "6,7,8,9,9,10,10,10,11,11,11,12,13";

        String getConcat = Main.getConcatString(Main.doWork(input));
        String expected = "6,7,8,9,10,11,12,13";

        assertEquals(expected, getConcat);
    }

    @Test
    public void testMain5() {
        String input = "12,12,12,13,14,15,15,15,15,16,17";

        String getConcat = Main.getConcatString(Main.doWork(input));
        String expected = "12,13,14,15,16,17";

        assertEquals(expected, getConcat);
    }

    @Test
    public void testMain6() {
        String input = "2,2,2,2,2";

        String getConcat = Main.getConcatString(Main.doWork(input));
        String expected = "2";

        assertEquals(expected, getConcat);
    }

    @Test
    public void testMain7() {
        String input = "9,10,11,11,11,11,12,12,13,14,15,16,17,18,18";

        String getConcat = Main.getConcatString(Main.doWork(input));
        String expected = "9,10,11,12,13,14,15,16,17,18";

        assertEquals(expected, getConcat);
    }

    @Test
    public void testMain8() {
        String input = "10,10,10,11,12,12,13,13,14,14,15,16,17,18,19";

        String getConcat = Main.getConcatString(Main.doWork(input));
        String expected = "10,11,12,13,14,15,16,17,18,19";

        assertEquals(expected, getConcat);
    }

}
