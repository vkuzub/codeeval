package puzzles.ez.one_zero_two_zero;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
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
        String[] split = input.split(" ");
        int zeroAmount = Integer.parseInt(split[0]);
        int calcTo = Integer.parseInt(split[1]);

        if (zeroAmount == 0 || calcTo == 0 || calcTo == 1 || (zeroAmount >= calcTo)) {
            return 0;
        }

        List<String> item = new ArrayList<>();

        for (int i = 1; i <= calcTo; i++) {
            item.add(Integer.toBinaryString(i));
//            System.out.println(Integer.toBinaryString(i));
        }


        StringBuilder sb = new StringBuilder();

        for (int i = 1; i <= zeroAmount; i++) {
            sb.append("0");
        }

//        System.out.println("===res===");

        for (String s : item) {
//            ArrayList<String> list = new ArrayList<>(Arrays.asList(s.split("1")));
//            if (list.contains(sb.toString()) && (list.indexOf(sb.toString()) == list.lastIndexOf(sb.toString()))) {
//                result++;
//                System.out.println(s);
//            }

            if (s.replace("1", "").length() == zeroAmount) {
                result++;
//                System.out.println(s);
            }


        }
//            if (s.replace("1", "").contains(sb.toString()) && s.lastIndexOf(sb.toString()) == s.indexOf(sb.toString())) {
//                result++;
//                System.out.println(s);
//            }


        return result;
    }

}
