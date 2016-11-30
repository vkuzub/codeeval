package puzzles.ez.longest_word;

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

                System.out.println(doWork(line));
            }

            scanner.close();
        } catch (IOException e) {
        }
    }

    static String doWork(String input) {
        ArrayList<String> list = new ArrayList<>(Arrays.asList(input.split(" ")));
        ArrayList<Integer> lenght = new ArrayList<>();
        for (String s : list) {
            lenght.add(s.length());
        }

        int longestIndex = 0;
        for (int i = 0; i < lenght.size(); i++) {
            if (lenght.get(longestIndex) < lenght.get(i)) {
                longestIndex = i;
            }
        }

        return list.get(longestIndex);
    }

}
