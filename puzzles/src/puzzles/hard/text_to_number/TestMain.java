package puzzles.hard.text_to_number;

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
        String input = "negative six hundred thirty eight";

        String result = Main.doWork(input);
        String expected = "-638";

        assertEquals(expected, result);
    }

    @Test
    public void testMain1() {
        String input = "fifteen";

        String result = Main.doWork(input);
        String expected = "15";

        assertEquals(expected, result);
    }


    @Test
    public void testMain2() {
        String input = "zero";

        String result = Main.doWork(input);
        String expected = "0";

        assertEquals(expected, result);
    }

    @Test
    public void testMain3() {
        String input = "two million one hundred seven";

        String result = Main.doWork(input);
        String expected = "2000107";

        assertEquals(expected, result);
    }

    @Test
    public void testMain4() {
        String input = "twenty two";

        String result = Main.doWork(input);
        String expected = "22";

        assertEquals(expected, result);
    }

    @Test
    public void testMain5() {
        String input = "six hundred";

        String result = Main.doWork(input);
        String expected = "600";

        assertEquals(expected, result);
    }

    @Test
    public void testMain6() {
        String input = "six hundred fifty five";

        String result = Main.doWork(input);
        String expected = "655";

        assertEquals(expected, result);
    }

    @Test
    public void testMain7() {
        String input = "six hundred six";

        String result = Main.doWork(input);
        String expected = "606";

        assertEquals(expected, result);
    }

    @Test
    public void testMain8() {
        String input = "six hundred nineteen";

        String result = Main.doWork(input);
        String expected = "619";

        assertEquals(expected, result);
    }

    @Test
    public void testMain9() {
        String input = "one thousand six hundred nineteen";

        String result = Main.doWork(input);
        String expected = "1619";

        assertEquals(expected, result);
    }

    @Test
    public void testMain10() {
        String input = "one thousand nineteen";

        String result = Main.doWork(input);
        String expected = "1019";

        assertEquals(expected, result);
    }

    @Test
    public void testMain11() {
        String input = "nine hundred ninety nine";

        String result = Main.doWork(input);
        String expected = "999";

        assertEquals(expected, result);
    }

    @Test
    public void testBellow1k1() {
        List<Long> input = new ArrayList<>(Arrays.asList(9l, 100l, 90l, 9l));

        long result = Main.getBellow1k(input);
        long expected = 999;

        assertEquals(expected, result);
    }

    @Test
    public void testBellow1k2() {
        List<Long> input = new ArrayList<>(Arrays.asList(1l, 100l, 1l));

        long result = Main.getBellow1k(input);
        long expected = 101;

        assertEquals(expected, result);
    }

    @Test
    public void testToDigits() {
        List<Long> input = new ArrayList<>(Arrays.asList(1l, 100l, 1l));

        long result = Main.getBellow1k(input);
        long expected = 101;

        assertEquals(expected, result);
    }

}
