package puzzles.ez.real_fake;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
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

                if (doWork(line)) {
                    System.out.println("Real");
                } else {
                    System.out.println("Fake");
                }
            }

            scanner.close();
        } catch (IOException e) {
        }
    }

    static boolean doWork(String input) {
        List<String> list = new ArrayList<>(Arrays.asList(input.replaceAll(" ", "").split("")));
        int tmp = 0;
        for (int i = 0; i < list.size(); i++) {
            if (i % 2 != 0) {
                tmp += Integer.parseInt(list.get(i)) * 2;
            }
            tmp += Integer.parseInt(list.get(i));
        }
        if (tmp % 10 == 0 && tmp > 0) {
            return true;
        }
        return false;
    }

}
