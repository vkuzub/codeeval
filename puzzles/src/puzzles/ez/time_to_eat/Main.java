package puzzles.ez.time_to_eat;

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
        List<String> items = new ArrayList<>(Arrays.asList(input.split(" ")));
        Collections.sort(items);
        Collections.reverse(items);
        for (String item : items) {
            sb.append(item).append(" ");
        }
        return sb.toString().trim();
    }

}
