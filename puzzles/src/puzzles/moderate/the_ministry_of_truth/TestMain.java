package puzzles.moderate.the_ministry_of_truth;

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
        String input = "Higher meaning;Hi mean abc";

        String result = Main.doWork(input);
        String expected = Main.CONST;

        assertEquals(expected, result);
    }

    @Test
    public void testMain1() {
        String input = "this is impossible;im possible";

        String result = Main.doWork(input);
        String expected = Main.CONST;

        assertEquals(expected, result);
    }

    @Test
    public void testMain2() {
        String input = "twenty   two minutes;two minutes";

        String result = Main.doWork(input);
        String expected = "______ two minutes";

        assertEquals(expected, result);
    }

    @Test
    public void testMain3() {
        String input = "Higher meaning;e 1";

        String result = Main.doWork(input);
        String expected = Main.CONST;

        assertEquals(expected, result);
    }

    @Test
    public void testMain4() {
        String input = "Higher meaning;e";

        String result = Main.doWork(input);
        String expected = "____e_ _______";

        assertEquals(expected, result);
    }

    @Test
    public void testMain5() {
        String input = "Hello world;el rl";

        String result = Main.doWork(input);
        String expected = "_el__ __rl_";

        assertEquals(expected, result);
    }

    @Test
    public void testMain6() {
        String input = "abc def;a";

        String result = Main.doWork(input);
        String expected = "a__ ___";

        assertEquals(expected, result);
    }

    @Test
    public void testMain7() {
        String input = "abc def;b";

        String result = Main.doWork(input);
        String expected = "_b_ ___";

        assertEquals(expected, result);
    }

    @Test
    public void testMain8() {
        String input = "abc def;ab";

        String result = Main.doWork(input);
        String expected = "ab_ ___";

        assertEquals(expected, result);
    }

    @Test
    public void testMain9() {
        String input = "abc def;f";

        String result = Main.doWork(input);
        String expected = "___ __f";

        assertEquals(expected, result);
    }

    @Test
    public void testCount1() {
        List<String> input = new ArrayList<>(Arrays.asList("Hello world abc".split(" ")));
        List<String> input2 = new ArrayList<>(Arrays.asList("el rl".split(" ")));

        int result = Main.getMatchesCount(input, input2);
        int expected = 2;

        assertEquals(expected, result);
    }

    @Test
    public void testCount2() {
        List<String> input = new ArrayList<>(Arrays.asList("Hello world abc".split(" ")));
        List<String> input2 = new ArrayList<>(Arrays.asList("el".split(" ")));

        int result = Main.getMatchesCount(input, input2);
        int expected = 1;

        assertEquals(expected, result);
    }

    @Test
    public void testCount3() {
        List<String> input = new ArrayList<>(Arrays.asList("world abc".split(" ")));
        List<String> input2 = new ArrayList<>(Arrays.asList("el".split(" ")));

        int result = Main.getMatchesCount(input, input2);
        int expected = 0;

        assertEquals(expected, result);
    }

    @Test
    public void testMatchIndex() {
        List<String> input = new ArrayList<>(Arrays.asList("world abc".split(" ")));
        List<String> input2 = new ArrayList<>(Arrays.asList("o".split(" ")));

        int result = Main.findFirstMatchIndex(input, input2);
        int expected = 0;

        assertEquals(expected, result);
    }

    @Test
    public void testMatchIndex2() {
        List<String> input = new ArrayList<>(Arrays.asList("world abc".split(" ")));
        List<String> input2 = new ArrayList<>(Arrays.asList("bc".split(" ")));

        int result = Main.findFirstMatchIndex(input, input2);
        int expected = 1;

        assertEquals(expected, result);
    }


    @Test
    public void testRealignLength1() {
        List<String> input = new ArrayList<>(Arrays.asList("world abc".split(" ")));
        List<String> input2 = new ArrayList<>(Arrays.asList("bc".split(" ")));

        List<String> result = Main.realignLenght(input, input2);
        List<String> expected = new ArrayList<>(Arrays.asList("", "bc"));

        assertEquals(expected, result);
    }

    @Test
    public void testRealignLength2() {
        List<String> input = new ArrayList<>(Arrays.asList("world abc def".split(" ")));
        List<String> input2 = new ArrayList<>(Arrays.asList("ef".split(" ")));

        List<String> result = Main.realignLenght(input, input2);
        List<String> expected = new ArrayList<>(Arrays.asList("", "", "ef"));

        assertEquals(expected, result);
    }

    @Test
    public void testRealignLength3() {
        List<String> input = new ArrayList<>(Arrays.asList("world abc def".split(" ")));
        List<String> input2 = new ArrayList<>(Arrays.asList("abc".split(" ")));

        List<String> result = Main.realignLenght(input, input2);
        List<String> expected = new ArrayList<>(Arrays.asList("", "abc", ""));

        assertEquals(expected, result);
    }

    @Test
    public void testRealignLength4() {
        List<String> input = new ArrayList<>(Arrays.asList("world abc def".split(" ")));
        List<String> input2 = new ArrayList<>(Arrays.asList("abc def".split(" ")));

        List<String> result = Main.realignLenght(input, input2);
        List<String> expected = new ArrayList<>(Arrays.asList("", "abc", "def"));

        assertEquals(expected, result);
    }

    @Test
    public void testRealignLength5() {
        List<String> input = new ArrayList<>(Arrays.asList("warld abc def".split(" ")));
        List<String> input2 = new ArrayList<>(Arrays.asList("a".split(" ")));

        List<String> result = Main.realignLenght(input, input2);
        List<String> expected = new ArrayList<>(Arrays.asList("a", "", ""));

        assertEquals(expected, result);
    }

    @Test
    public void testRealignLength6() {
        List<String> input = new ArrayList<>(Arrays.asList("warld abc def".split(" ")));
        List<String> input2 = new ArrayList<>(Arrays.asList("a a".split(" ")));

        List<String> result = Main.realignLenght(input, input2);
        List<String> expected = new ArrayList<>(Arrays.asList("a", "a", ""));

        assertEquals(expected, result);
    }

}
