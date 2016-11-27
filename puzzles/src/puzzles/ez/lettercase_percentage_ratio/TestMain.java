package puzzles.ez.lettercase_percentage_ratio;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

/**
 * Created by Vyacheslav on 17.11.2016.
 */


public class TestMain {

    @Test
    public void testMain() {
        String input = "thisTHIS";

        String result = Main.doWork(input);
        String expected = "lowercase: 50.00 uppercase: 50.00";

        assertEquals(expected, result);
    }

    @Test
    public void testMain1() {
        String input = "AAbbCCDDEE";

        String result = Main.doWork(input);
        String expected = "lowercase: 20.00 uppercase: 80.00";

        assertEquals(expected, result);
    }

    @Test
    public void testMain2() {
        String input = "N";

        String result = Main.doWork(input);
        String expected = "lowercase: 0.00 uppercase: 100.00";

        assertEquals(expected, result);
    }

    @Test
    public void testMain3() {
        String input = "UkJ";

        String result = Main.doWork(input);
        String expected = "lowercase: 33.33 uppercase: 66.67";

        assertEquals(expected, result);
    }

}
