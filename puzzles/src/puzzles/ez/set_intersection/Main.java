package puzzles.ez.set_intersection;

import java.io.File;
import java.io.IOException;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

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
        String[] split = input.split(";");
        Set<String> first = new HashSet<>(Arrays.asList(split[0].split(",")));
        Set<String> second = new HashSet<>(Arrays.asList(split[1].split(",")));

        StringBuilder sb = new StringBuilder();
        for (String s : second) {
            if (first.contains(s)) {
                sb.append(s).append(",");
            }
        }
        if (sb.length() == 0) {
            return "";
        }

        if (sb.charAt(sb.length() - 1) == ',') {
            return sb.toString().trim().substring(0, sb.length() - 1);
        }

        return sb.toString().trim();
    }

}
