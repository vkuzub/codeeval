package puzzles.ez.calculate_distance;

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
        String split[] = input.split("\\) \\(");
        String x1y1 = split[0];
        String x2y2 = split[1];
        int x1 = Integer.parseInt(x1y1.replace("(","").replace(")","").split(",")[0].trim());
        int y1 = Integer.parseInt(x1y1.replace("(","").replace(")","").split(",")[1].trim());

        int x2 = Integer.parseInt(x2y2.replace("(","").replace(")","").split(",")[0].trim());
        int y2 = Integer.parseInt(x2y2.replace("(","").replace(")","").split(",")[1].trim());

        int result = (int) Math.sqrt((Math.pow(x1-x2,2)+(Math.pow(y2-y1,2))));

        return String.valueOf(result);
    }

}
