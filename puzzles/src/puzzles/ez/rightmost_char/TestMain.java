package puzzles.ez.rightmost_char;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

/**
 * Created by Vyacheslav on 17.11.2016.
 */


public class TestMain {

    @Test
    public void testMain() {
        String input = "Hello World,r";

        int result = Main.doWork(input);
        int expected = 8;

        assertEquals(expected, result);
    }

    @Test
    public void testMain1() {
        String input = "Hello CodeEval,E";

        int result = Main.doWork(input);
        int expected = 10;

        assertEquals(expected, result);
    }

    @Test
    public void testMain2() {
        String input = "qa575ooOtV2Efx9AYB8DqZlXAKXninu,Q";

        int result = Main.doWork(input);
        int expected = -1;

        assertEquals(expected, result);
    }

    @Test
    public void testMain3() {
        String input = "7F7BuumTlXcc7tJY7ncgWuwOhdRU18fiyE,Y";

        int result = Main.doWork(input);
        int expected = 15;

        assertEquals(expected, result);
    }

    @Test
    public void testMain4() {
        String input = "nya9VbVFhWkZojWmmnmoZawpxHFv7YWwp8ne7gBN eC att8aLs1gqZe3MFjE36npY8,Q";

        int result = Main.doWork(input);
        int expected = -1;

        assertEquals(expected, result);
    }

    @Test
    public void testMain5() {
        String input = "How to learn to Cook,C";

        int result = Main.doWork(input);
        int expected = 16;

        assertEquals(expected, result);
    }


    @Test
    public void testMain6() {
        String input = "RS2MIh4ZDkYxLjP1NbWO1HON6WqOFMI2 jPy297yIRKEkrgAlPgLrn3HvYCYgdvgNaELsgDTisf,v";

        int result = Main.doWork(input);
        int expected = 48;

        assertEquals(expected, result);
    }

}
