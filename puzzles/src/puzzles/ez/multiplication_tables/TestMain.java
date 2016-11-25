package puzzles.ez.multiplication_tables;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

/**
 * Created by Vyacheslav on 17.11.2016.
 */


public class TestMain {

    @Test
    public void testMain() {
        String input = "1";

        int result = puzzles.ez.fibonacci.Main.doWork(input);
        int expected = 1;

        assertEquals(expected, result);
    }


    @Test
    public void testMain1() {
        String input = "0";

        int result = puzzles.ez.fibonacci.Main.doWork(input);
        int expected = 0;

        assertEquals(expected, result);
    }

    @Test
    public void testMain4() {
        String input = "3";

        int result = puzzles.ez.fibonacci.Main.doWork(input);
        int expected = 2;

        assertEquals(expected, result);
    }

    @Test
    public void testMain2() {
        String input = "7";

        int result = puzzles.ez.fibonacci.Main.doWork(input);
        int expected = 13;

        assertEquals(expected, result);
    }


    @Test
    public void testMain3() {
        String input = "12";

        int result = puzzles.ez.fibonacci.Main.doWork(input);
        int expected = 144;

        assertEquals(expected, result);
    }

    @Test
    public void testMain5() {
        String input = "5";

        int result = puzzles.ez.fibonacci.Main.doWork(input);
        int expected = 5;

        assertEquals(expected, result);
    }

}
