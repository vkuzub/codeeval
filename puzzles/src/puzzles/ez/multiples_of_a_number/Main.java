package puzzles.ez.multiples_of_a_number;

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

    //division and abs forbidden
    static int doWork(String input) {
        int result = 0;
        int x, n;
        String[] arr = input.split(",");
        x = Integer.parseInt(arr[0]);
        n = Integer.parseInt(arr[1]);

        if (x % n == 0) {
            result = x;
        } else {
            while (x % n != 0) {
                x++;
            }
            result = x;
        }

        return result;
    }

}
