package puzzles.moderate.trailing_string;

import java.io.File;
import java.io.IOException;
import java.util.Scanner;

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
                System.out.println(line);
                System.out.println(doWork(line));
            }

            scanner.close();
        } catch (IOException e) {
        }
    }

    static String doWork(String input) {
        if (input.length() == 0 || !input.contains(",")) {
            return "0";
        }
        String[] split = input.split(",");
        if (split.length != 2) {
            return "0";
        }
        String val = split[0];
        String searchable = split[1];
        if (val.length() < searchable.length()) {
            return "0";
        }
        String sub = val.substring(val.length() - searchable.length(), val.length());

        if (sub.length() < searchable.length()) {
            return "0";
        }

        if (sub.equals(searchable)) {
            return "1";
        }

        return "0";
    }

}
