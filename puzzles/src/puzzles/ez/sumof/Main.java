package puzzles.ez.sumof;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;

/**
 * Created by Vyacheslav on 17.11.2016.
 */
public class Main {
    public static void main(String args[]) {
        File file = new File(args[0]);
        ArrayList<Integer> items = new ArrayList<>();
        try {
            Scanner scanner = new Scanner(file);
            while (scanner.hasNextLine()) {
                String line = scanner.nextLine();
                if (line.equals(""))
                    continue;

                items.add(Integer.parseInt(line));
            }

            System.out.println(doWork(items));

            scanner.close();
        } catch (IOException e) {
        }
    }

    static int doWork(ArrayList<Integer> items) {
        int result = 0;
        for (Integer item : items) {
            result += item;
        }
        return result;
    }
}
