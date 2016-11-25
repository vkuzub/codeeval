package puzzles.hard.string_searching;

import java.io.File;
import java.io.IOException;
import java.util.Scanner;
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
        String[] split = input.split(",");
        String line = split[0];
        String regex = split[1].trim().replace("*", ".*");



        if (line.contains(regex)) {
            return String.valueOf(true);
        } else {
            Pattern p = Pattern.compile(regex);
            return String.valueOf(p.matcher(line).matches());
        }
    }

}
