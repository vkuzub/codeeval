package puzzles.hard.longest_common_subsequence;

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
            StringBuilder sb = new StringBuilder();
            while (scanner.hasNextLine()) {
                String line = scanner.nextLine();
                if (line.equals(""))
                    continue;

                System.out.println(doWork(line));
//                sb.append(doWork(line));
            }

//            System.out.println(sb);
            scanner.close();
        } catch (IOException e) {
        }
    }

    static String doWork(String input) {
        if (input == null || input.length() == 0) {
            return "";
        }


        return "";
    }

}
