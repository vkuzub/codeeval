package puzzles.ez.rightmost_char;

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

                System.out.println(doWork(line));
            }

            scanner.close();
        } catch (IOException e) {
        }
    }

    static int doWork(String input) {
        if (input == null || input.equals("")) {
            return 0;
        }
        String text = input.split(",")[0];
        String find = input.split(",")[1];
        return text.indexOf(find);
    }

}
