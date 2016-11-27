package puzzles.ez.word_to_digit;

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
        List<String> items = new ArrayList<>(Arrays.asList(input.split(";")));
        StringBuilder sb = new StringBuilder();
        Map<String, String> map = getHashMap();
        for (String item : items) {
            sb.append(map.get(item));
        }
        return sb.toString();
    }


    static Map<String, String> getHashMap() {
        Map<String, String> vals = new HashMap<>();
        vals.put("zero", "0");
        vals.put("one", "1");
        vals.put("two", "2");
        vals.put("three", "3");
        vals.put("four", "4");
        vals.put("five", "5");
        vals.put("six", "6");
        vals.put("seven", "7");
        vals.put("eight", "8");
        vals.put("nine", "9");
        return vals;
    }
}
