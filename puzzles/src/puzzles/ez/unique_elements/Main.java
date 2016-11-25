package puzzles.ez.unique_elements;

import java.io.File;
import java.io.IOException;
import java.util.*;

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

                System.out.println(getConcatString(doWork(line)));
            }

            scanner.close();
        } catch (IOException e) {
        }
    }

    static Collection<Integer> doWork(String input) {
        ArrayList<String> inputList = new ArrayList<>(new TreeSet<>(Arrays.asList(input.split(","))));
        ArrayList<Integer> res = new ArrayList<>();
        for (String s : inputList) {
            res.add(Integer.parseInt(s));
        }
        Collections.sort(res);
        return res;
    }

    static String getConcatString(Collection<Integer> input) {
        StringBuilder sb = new StringBuilder();

        for (Integer s : input) {
            sb.append(s).append(",");
        }
        return sb.substring(0, sb.length() - 1);

    }

}
