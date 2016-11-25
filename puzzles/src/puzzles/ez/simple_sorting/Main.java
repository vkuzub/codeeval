package puzzles.ez.simple_sorting;

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
        StringBuilder sb = new StringBuilder();
        List<Double> item = new ArrayList<>();
        for (String s : input.split(" ")) {
            item.add(Double.parseDouble(s));
        }
        Collections.sort(item);
        for (Double s : item) {
            sb.append(String.format("%.3f", s)).append(" ");
        }
        return sb.toString().replaceAll(",",".").trim();
    }

}
