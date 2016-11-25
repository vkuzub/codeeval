package puzzles.moderate.decode_numbers;

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

                System.out.println(doWork(line.toLowerCase()));
            }

            scanner.close();
        } catch (IOException e) {
        }
    }

    static int doWork(String input) {
        int amount = 1;
        for (int i : getArray()) {
            if (input.contains(String.valueOf(i))) {
                amount++;
            }
        }
        return amount;
    }

    static int[] getArray() {
        //from 9 to 26
        int[] arr = new int[17];
        int start = 10;
        for (int i = 0; i < arr.length; i++) {
            arr[i] = start;
            start++;
        }
        return arr;
    }

}
