package puzzles.ez.bit_positions;

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

    static String doWork(String input) {
        String[] split = input.split(",");
        int val = Integer.parseInt(split[0]);
        int pos1 = Integer.parseInt(split[1]) - 1;
        int pos2 = Integer.parseInt(split[2]) - 1;
        String bits = new StringBuilder(Integer.toBinaryString(val)).reverse().toString();
        if (bits.charAt(pos1) == bits.charAt(pos2)) {
            return "true";
        }
        return "false";
    }

}
