package puzzles.ez.the_major_element;

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
        List<Integer> items = new ArrayList<>();
        for (String m : input.split(",")) {
            items.add(Integer.parseInt(m));
        }
        int fLenght = items.size()/2;
        List<Integer> values = new ArrayList<>(new HashSet<>(items));
        List<Integer> counts = new ArrayList<>(100);

        for (Integer value : values) {
            counts.add(0);
        }

        for (int i = 0; i < items.size(); i++) {
            int value = items.get(i);
            int index = values.indexOf(value);
            int valueCount = counts.get(index)+1;
            counts.remove(index);
            counts.add(index,valueCount);
        }

        int maxEl = 0;
        int maxIndex = 0;
        for (int i = 0; i < counts.size(); i++) {
             if (counts.get(i)>maxEl){
              maxEl = counts.get(i);
             }
        }

        maxIndex = counts.indexOf(maxEl);

        if (counts.get(maxIndex)>=fLenght){
            return String.valueOf(values.get(maxIndex));
        }

        return "None";
    }

}
