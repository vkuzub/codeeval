package puzzles.ez.lowest_unique_number;

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
        List<String> items = new ArrayList<>(Arrays.asList(input.split(" ")));
        HashMap<String, Integer> map = new HashMap<>();
        for (String item : items) {
            map.put(item, 0);
        }

        for (String item : items) {
            int amount = map.get(item);
            map.put(item, amount + 1);
        }

        List<Integer> values = new ArrayList<>(map.values());
        Collections.sort(values);
        if (values.get(0) != 1) {
            return "0";
        }

        int searchableVal = 1;

        List<Integer> lowestVals = new ArrayList<>();
        for (Map.Entry<String, Integer> stringIntegerEntry : map.entrySet()) {
            if (stringIntegerEntry.getValue() == searchableVal) {
                lowestVals.add(Integer.parseInt(stringIntegerEntry.getKey()));
            }
        }

        Collections.sort(lowestVals);

        int lowestVal = lowestVals.get(0);

        return String.valueOf(items.indexOf(String.valueOf(lowestVal)) + 1);
    }

}
