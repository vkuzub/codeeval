package puzzles.ez.fibonacci;

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

    public static int doWork(String input) {
        int inputVal = Integer.parseInt(input);

        if (inputVal == 0 || inputVal == 1) {
            return inputVal;
        }
        int res = doWork(String.valueOf(inputVal - 1)) + doWork(String.valueOf(inputVal - 2));
        return res;
    }

}
