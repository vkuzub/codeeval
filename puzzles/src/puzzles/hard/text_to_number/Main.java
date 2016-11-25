package puzzles.hard.text_to_number;

import java.io.File;
import java.io.IOException;
import java.util.*;

/**
 * Created by Vyacheslav on 17.11.2016.
 */
public class Main {

    private final static long hundred = 100;
    private final static long thousand = 1000;
    private final static long million = 1000000;

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
        boolean containsMinus = input.contains("negative");
        ArrayList<String> raw = new ArrayList<>(Arrays.asList(input.split(" ")));
        if (containsMinus) {
            raw.remove(0);
        }
        List<Long> digits = toDigits(raw);

        long tmp = 0;

        long millions = 0;
        long thousands = 0;
        if (digits.contains(million)) {
            int indexmillions = digits.indexOf(million);
            millions = getBellow1k(digits.subList(0, indexmillions));
            for (int i = 0; i < indexmillions + 1; i++) {
                digits.remove(0);
            }
        }
        if (digits.contains(thousand)) {
            int indexThousand = digits.indexOf(thousand);
            thousands = getBellow1k(digits.subList(0, indexThousand));
            for (int i = 0; i < indexThousand + 1; i++) {
                digits.remove(0);
            }
        }

        long bellowThousand = getBellow1k(digits);

        tmp = millions * million + thousands * thousand + bellowThousand;

        if (containsMinus) {
            return String.valueOf("-" + tmp);
        }
        return String.valueOf(tmp);
    }

    static List<Long> toDigits(List<String> input) {
        List<Long> result = new ArrayList<>();
        Map<String, String> map = getHashMap();
        for (String s : input) {
            result.add(Long.parseLong(map.get(s)));
        }
        return result;
    }

    static long getBellow1k(List<Long> items) {
        List<String> ops = new ArrayList<>();
        long tmp = 0;
        for (Long s : items) {
            if (s != null) {
                if (s >= 100) {
                    ops.add("*");
                } else {
                    ops.add("+");
                }
            }
        }


        for (int i = 0; i < ops.size(); i++) {
            String op = ops.get(i);
            if (op.equals("*")) {
                tmp *= items.get(i);
            } else {
                tmp += items.get(i);
            }
        }

        return tmp;
    }


    static Map<String, String> getHashMap() {
        Map<String, String> vals = new HashMap<>();
        vals.put("negative", "-");
        vals.put("zero", "0");
        vals.put("one", "1");
        vals.put("two", "2");
        vals.put("three", "3");
        vals.put("four", "4");
        vals.put("five", "5");
        vals.put("six", "6");
        vals.put("seven", "7");
        vals.put("eight", "8");
        vals.put("nine", "9");
        vals.put("ten", "10");
        vals.put("eleven", "11");
        vals.put("twelve", "12");
        vals.put("thirteen", "13");
        vals.put("fourteen", "14");
        vals.put("fifteen", "15");
        vals.put("sixteen", "16");
        vals.put("seventeen", "17");
        vals.put("eighteen", "18");
        vals.put("nineteen", "19");
        vals.put("twenty", "20");
        vals.put("thirty", "30");
        vals.put("forty", "40");
        vals.put("fifty", "50");
        vals.put("sixty", "60");
        vals.put("seventy", "70");
        vals.put("eighty", "80");
        vals.put("ninety", "90");
        vals.put("hundred", "100");
        vals.put("thousand", "1000");
        vals.put("million", "1000000");
        return vals;
    }


}
