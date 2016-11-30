package puzzles.ez.find_the_highest_score;

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

                System.out.println(doWork(line));
            }

            scanner.close();
        } catch (IOException e) {
        }
    }

    static String doWork(String input) {
        List<String> rating = new ArrayList<>(Arrays.asList(input.split(" \\| ")));
        int categories = rating.get(0).split(" ").length;
        List<List<Integer>> items = new ArrayList<>();

        for (int i = 0; i < categories; i++) {
            items.add(new ArrayList<>());
        }


        for (String item : rating) {
            String[] split = item.split(" ");
            for (int i = 0; i < split.length; i++) {
                String s = split[i];
                List<Integer> list = items.get(i);
                list.add(Integer.parseInt(s));
//                items.remove(i);
//                items.add(i, list);
            }
        }

        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < categories; i++) {
            Collections.sort(items.get(i), new Comparator<Integer>() {
                @Override
                public int compare(Integer o1, Integer o2) {
                    if (o1 > o2) {
                        return -1;
                    }
                    if (o2 > o1) {
                        return 1;
                    }
                    return 0;
                }
            });
            sb.append(items.get(i).get(0)).append(" ");
        }

        return sb.toString().trim();
    }

}
