package puzzles.moderate.roman_and_arabic;

import java.io.File;
import java.io.IOException;
import java.util.*;

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
        List<String> digits = new ArrayList<>(Arrays.asList(input.split("\\D")));
        List<String> letters = new ArrayList<>(Arrays.asList(input.split("\\d")));
        letters.remove(0);
        List<String> pairs = new ArrayList<>();
        for (int i = 0; i < digits.size(); i++) {
            pairs.add(digits.get(i) + letters.get(i));
        }

        long value = 0;

        Map<String, Integer> map = getHashMap();
        for (String pair : pairs) {
            int letterVal = map.get(String.valueOf(pair.charAt(1)));
            int numbVar = Character.getNumericValue(pair.charAt(0));
            value += letterVal * numbVar;
        }


        return String.valueOf(value);
    }


    static Map<String, Integer> getHashMap() {
        Map<String, Integer> vals = new HashMap<>();
        vals.put("I", 1);
        vals.put("V", 5);
        vals.put("X", 10);
        vals.put("L", 50);
        vals.put("C", 100);
        vals.put("D", 500);
        vals.put("M", 1000);
        return vals;
    }

}
