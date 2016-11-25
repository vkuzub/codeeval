package puzzles.ez.happy_numbers;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

/**
 * Created by Vyacheslav on 17.11.2016.
 */


public class TestMain {

    @Test
    public void testMain() {
        int input = 1;

        boolean result = Main.doWork(input);
        boolean expected = true;

        assertEquals(expected, result);
    }

    @Test
    public void testMain1() {
        int input = 10;

        boolean result = Main.doWork(input);
        boolean expected = true;

        assertEquals(expected, result);
    }

    @Test
    public void testMain2() {
        int input = 100;

        boolean result = Main.doWork(input);
        boolean expected = true;

        assertEquals(expected, result);
    }

    @Test
    public void testFake1() {
        int input = 1;

        boolean result = Fake.isNumberHappy(input);
        boolean expected = true;

        assertEquals(expected, result);
    }

    @Test
    public void testFake2() {
        int input = 7;

        boolean result = Fake.isNumberHappy(input);
        boolean expected = true;

        assertEquals(expected, result);
    }

    @Test
    public void testFake3() {
        int input = 22;

        boolean result = Fake.isNumberHappy(input);
        boolean expected = false;

        assertEquals(expected, result);
    }

    @Test
    public void testMain11() {
        int input = 1;

        boolean result = Main.doWork(input);
        boolean expected = true;

        assertEquals(expected, result);
    }

    @Test
    public void testFake12() {
        int input = 7;

        boolean result = Main.doWork(input);
        boolean expected = true;

        assertEquals(expected, result);
    }

    @Test
    public void testFake13() {
        int input = 22;

        boolean result = Main.doWork(input);
        boolean expected = false;

        assertEquals(expected, result);
    }

}
