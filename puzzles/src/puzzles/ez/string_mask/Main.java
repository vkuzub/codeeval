package puzzles.ez.string_mask;

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
        String[] split = input.split(" ");
        char[] word = split[0].toCharArray();
        char[] mask = split[1].toCharArray();
        for (int i = 0; i < mask.length; i++) {
            if (mask[i] == '1') {
                word[i] = Character.toUpperCase(word[i]);
            }
        }
        return new String(word);
    }

}
