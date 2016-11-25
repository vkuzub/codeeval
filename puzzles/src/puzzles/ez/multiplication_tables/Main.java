package puzzles.ez.multiplication_tables;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Vyacheslav on 17.11.2016.
 */
public class Main {

    public static void main(String args[]) {
        int end = 12;
        int n = 1;
        while (n <= end) {
            System.out.println(doWork(n));
            n++;
        }
    }

    static String doWork(int val) {
        StringBuilder sb = new StringBuilder();
        int width = 4;
        int[] arr = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12};
        List<String> list = new ArrayList<>();
        for (int i = 0; i < arr.length; i++) {
            int valN = arr[i];
            list.add(String.valueOf(valN * val));
        }
        for (String s : list) {
            if (s.length() == 1) {
                sb.append("   ");
            }
            if (s.length() == 2) {
                sb.append("  ");
            }
            if (s.length() == 3) {
                sb.append(" ");
            }
            sb.append(s);
        }

        return sb.toString();
    }

}
