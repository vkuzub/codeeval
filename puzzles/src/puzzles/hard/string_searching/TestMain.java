package puzzles.hard.string_searching;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

/**
 * Created by Vyacheslav on 17.11.2016.
 */


public class TestMain {

    @Test
    public void testMain() {
        String input = "0hFlQ COZsRtgdlplk QK78M3IY,COZsRt\\*plk";

        String result = Main.doWork(input);
        String expected = "false";

        assertEquals(expected, result);
    }

    @Test
    public void testMain1() {
        String input = "CodeEval,C*Eval";

        String result = Main.doWork(input);
        String expected = "true";

        assertEquals(expected, result);
    }

    @Test
    public void testMain2() {
        String input = "CoEval,C*Eval";

        String result = Main.doWork(input);
        String expected = "true";

        assertEquals(expected, result);
    }

    @Test
    public void testMain3() {
        String input = "CEval,C*Eval";

        String result = Main.doWork(input);
        String expected = "true";

        assertEquals(expected, result);
    }

    @Test
    public void testMain4() {
        String input = "wKWYwnSatT,W";

        String result = Main.doWork(input);
        String expected = "true";

        assertEquals(expected, result);
    }

    @Test
    public void testMain5() {
        String input = "n7mgVeL9o iJD KmfpXT,o iJD KmfpXT";

        String result = Main.doWork(input);
        String expected = "true";

        assertEquals(expected, result);
    }

    @Test
    public void testMain6() {
        String input = "LqPbXiBy77st8j,s*";

        String result = Main.doWork(input);
        String expected = "true";

        assertEquals(expected, result);
    }

    @Test
    public void testMain7() {
        String input = "DnsBXHXQH2 w40IkoWWI 668G4tsvIZvjib5Rw,40IkoWWI 66";

        String result = Main.doWork(input);
        String expected = "true";

        assertEquals(expected, result);
    }

    @Test
    public void testMain8() {
        String input = "bQ*F BvpPWdSRunNb QoSBNp,Q\\*F BvpP";

        String result = Main.doWork(input);
        String expected = "true";

        assertEquals(expected, result);
    }

    @Test
    public void testMain9() {
        String input = "ZAPzhON,P\\*N";

        String result = Main.doWork(input);
        String expected = "false";

        assertEquals(expected, result);
    }

    @Test
    public void testMain10() {
        String input = "PQYARSqAynqv AZ 9Lh2 lOq v2kH4NwX,*2kH4N";

        String result = Main.doWork(input);
        String expected = "true";

        assertEquals(expected, result);
    }

}
