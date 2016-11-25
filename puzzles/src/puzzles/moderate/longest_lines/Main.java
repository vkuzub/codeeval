package puzzles.moderate.longest_lines;

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
            List<String> input = new ArrayList<>();
            while (scanner.hasNextLine()) {
                String line = scanner.nextLine();
                if (line.equals(""))
                    continue;
                input.add(line);

            }
            doWork(input).forEach(System.out::println);
            scanner.close();
        } catch (IOException e) {
        }
    }

    static List<String> doWork(List<String> input) {
        List<String> list = new ArrayList<>();

        Integer n = Integer.parseInt(input.get(0));
        input.remove(0);
        if (n <= 0) {
            return list;
        }
        Collections.sort(input, (o1, o2) -> {
            if (o1.length() == o2.length()) {
                return 0;
            }
            if (o1.length() > o2.length()) {
                return 1;
            } else {
                return -1;
            }

        });
        Collections.reverse(input);

        for (int i = 0; i < n; i++) {
            list.add(input.get(i));
        }

        return list;
    }

}
