package puzzles.ez.trick_or_treat;

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
        int result = 0;
        String[] split = input.split(", ");
        int vamp = Integer.parseInt(split[0].split(": ")[1]);
        int zomb = Integer.parseInt(split[1].split(": ")[1]);
        int with = Integer.parseInt(split[2].split(": ")[1]);
        int hous = Integer.parseInt(split[3].split(": ")[1]);
        int all = vamp + zomb + with;

        result = (vamp * 3 + zomb * 4 + with * 5) * hous / all;
        return result;
    }

}
