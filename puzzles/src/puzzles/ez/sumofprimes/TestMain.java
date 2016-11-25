package puzzles.ez.sumofprimes;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

/**
 * Created by Vyacheslav on 17.11.2016.
 */


public class TestMain {

    @Test
    public void testMain() {
        boolean result = Main.isPrime(37);
        boolean expected = true;

        assertEquals(expected, result);
    }

    @Test
    public void testMain2() {
        boolean result = Main.isPrime(11);
        boolean expected = true;

        assertEquals(expected, result);
    }

    @Test
    public void testMain3() {
        boolean result = Main.isPrime(61);
        boolean expected = true;

        assertEquals(expected, result);
    }

    @Test
    public void testMain4() {
        boolean result = Main.isPrime(199);
        boolean expected = true;

        assertEquals(expected, result);
    }

    @Test
    public void testMain55() {
        int result = Main.doWork(3);
        int expected = 10;

        assertEquals(expected, result);
    }

    @Test
    public void testMain5() {
        int result = Main.doWork(10);
        int expected = 129;

        assertEquals(expected, result);
    }

    @Test
    public void testMain6() {
        int result = Main.doWork(15);
        int expected = 328;

        assertEquals(expected, result);
    }

    @Test
    public void testMain7() {
        int result = Main.doWork(20);
        int expected = 639;

        assertEquals(expected, result);
    }

    @Test
    public void testMain8() {
        int result = Main.doWork(1000);
        int expected = 3682913;

        assertEquals(expected, result);
    }
}
