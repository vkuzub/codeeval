package puzzles.ez.panacea;

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

                String res = String.valueOf(doWork(line));
                res = res.substring(0, 1).toUpperCase() + res.substring(1);
                System.out.println(res);
            }

            scanner.close();
        } catch (IOException e) {
        }
    }

    static boolean doWork(String input) {
        String[] items = input.split(" \\| ");
        if (items.length >= 2) {
            ArrayList<String> str1 = new ArrayList<>(Arrays.asList(items[0].split(" ")));
            ArrayList<String> str2 = new ArrayList<>(Arrays.asList(items[1].split(" ")));
            int vir = 0;
            int anti = 0;
            for (String s : str1) {
                vir += fromHex(s);
            }
            for (String s : str2) {
                anti += fromBin(s);
            }
            if (anti >= vir) {
                return true;
            }
        }
        return false;
    }

    static int fromHex(String val) {
        return Integer.parseInt(val, 16);
    }

    static int fromBin(String val) {
        return Integer.parseInt(val, 2);
    }


}
