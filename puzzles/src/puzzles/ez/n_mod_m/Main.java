package puzzles.ez.n_mod_m;

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
        int res = 0;
        String[] str = input.split(",");
        int n, m;
        if (str.length >= 2) {
            n = Integer.parseInt(str[0]);
            m = Integer.parseInt(str[1]);

            if (n < m) {
                return n;
            }
            if (n == m) {
                return 0;
            }

            int count = n / m;

            res = n - m * count;
        }
        return res;
    }

}
