package puzzles.ez.strings_and_arrows;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * Created by Vyacheslav on 17.11.2016.
 */
public class Main {
    public static void main(String args[]) {
        File file = new File(args[0]);

        try {
            Scanner scanner = new Scanner(file);
            while (scanner.hasNextLine()) {
                String line = scanner.nextLine();
                if (line.equals(""))
                    continue;

                System.out.println(doWork(line));
            }

            scanner.close();
        } catch (IOException e) {
        }
    }

    static String doWork(String input) {
        String arr1 = ">>-->";
        String arr2 = "<--<<";
        String arr1L = ">>-->>-->";
        String arr2L = "<--<<--<<";

        int baseLength = input.length();
        int longArrLength = arr1L.length();

        int count = 0;
        if (!input.contains(arr1) && !input.contains(arr2)) {
            return "0";
        }
        if (input.equals(arr1L) || input.equals(arr2L)) {
            return "2";
        }

        List<String> inputstr = new ArrayList<>(Arrays.asList(input.split(arr1L)));
        int newLength = 0;
        for (String s : inputstr) {
            newLength += s.length();
        }
        int diff = baseLength - newLength;
        int countL = diff / longArrLength;


        Pattern patArr1 = Pattern.compile(arr1);
        Matcher matcherArr1 = patArr1.matcher(input);
        while (matcherArr1.find()) {
            count++;
        }

        Pattern patArr2 = Pattern.compile(arr2);
        Matcher matcherArr2 = patArr2.matcher(input);
        while (matcherArr2.find()) {
            count++;
        }

//        Pattern patArr1L = Pattern.compile(arr1L);
//        Matcher matcherArr1L = patArr1L.matcher(input);
//        while (matcherArr1L.find()) {
//            count += 2;
//        }
//
//        Pattern patArr2L = Pattern.compile(arr2L);
//        Matcher matcherArr2L = patArr2L.matcher(input);
//        while (matcherArr2L.find()) {
//            count += 2;
//        }

        return String.valueOf(count);
    }

}
