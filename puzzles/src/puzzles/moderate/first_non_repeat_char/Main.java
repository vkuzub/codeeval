package puzzles.moderate.first_non_repeat_char;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
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

                System.out.println(doWork(line.toLowerCase()));
            }

            scanner.close();
        } catch (IOException e) {
        }
    }

    static String doWork(String input) {
        String result = null;

        ArrayList<String> split = new ArrayList<>(Arrays.asList(input.split("")));
        int indexOf, lastIndexOf;
        for (String s1 : split) {
            indexOf = split.indexOf(s1);
            lastIndexOf = split.lastIndexOf(s1);
            if (indexOf == lastIndexOf) {
                result = s1;
                break;
            }
        }
        return result;
    }

}
