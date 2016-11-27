package puzzles.moderate.the_ministry_of_truth;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

/**
 * Created by Vyacheslav on 17.11.2016.
 */
public class Main {

    public static final String CONST = "I cannot fix history";

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
        String[] split = input.split(";");
        if (split.length < 2) {
            return CONST;
        }
        String value = split[0].trim();
        String scan = split[1].trim();
        List<String> values = new ArrayList<>();
        for (String s : value.split(" ")) {
            if (!s.equals(""))
                values.add(s.trim());
        }
        List<String> scans = null;
        if (scan.contains(" ")) {
            scans = new ArrayList<>(Arrays.asList(scan.split(" ")));
        } else {
            scans = new ArrayList<>(Arrays.asList(scan));
        }

        if (values.size() == 0 || scans.size() == 0) {
            return CONST;
        }

        if (values.size() < scans.size()) {
            return CONST;
        }

        int matchesCount = getMatchesCount(values, scans);
        int startIndex = 0;
        StringBuilder res = new StringBuilder();

        if (matchesCount < scans.size()) {
            return CONST;
        }
//
//        //remove and replaces items before first matched item
//        if (matchesCount != scans.size()) {
//            startIndex = findFirstMatchIndex(values, scans);
//            for (int i = 0; i < startIndex; i++) {
//                res.append(values.get(i).replaceAll(".", "_")).append(" ");
//            }
//            for (int i = 0; i < startIndex + 1; i++) {
//                values.remove(0);
//            }
//        }
//
//        //realign length of scans
//        if (values.size() > scans.size()) {
//            for (int i = 0; i < values.size() - scans.size(); i++) {
//                scans.add("");
//            }
//        }

        scans = realignLenght(values, scans);

        for (int i = 0; i < values.size(); i++) {
            String valueTmp = values.get(i);
            String scanTmp = scans.get(i);
            if (scanTmp.equals("")) {
                res.append(valueTmp.replaceAll(".", "_")).append(" ");
                continue;
            }
            if (valueTmp.equals(scanTmp)) {
                res.append(valueTmp).append(" ");
                continue;
            }
            if (!valueTmp.contains(scanTmp)) {
                res.append(valueTmp.replaceAll(".", "_")).append(" ");
                continue;
            }
            int index = valueTmp.indexOf(scanTmp);
            String before = valueTmp.substring(0, index).replaceAll(".", "_");
            String after = valueTmp.substring(index + scanTmp.length() - 1, valueTmp.length() - 1).replaceAll(".", "_");
            res.append(before).append(scanTmp).append(after).append(" ");
        }

        return res.toString().trim();
    }

    static int getMatchesCount(List<String> values, List<String> scans) {
        if (values.size() < scans.size()) {
            throw new IllegalArgumentException("Arg1 length can't be less than Arg2 length");
        }
        int count = 0;
        int scannedIndex = 0;
        for (int i = 0; i < values.size(); i++) {
            String val = values.get(i);
            String scn = scans.get(scannedIndex);
            if (val.contains(scn)) {
                count++;
                if (scans.size() == scannedIndex + 1) {
                    break;
                }
                scannedIndex++;
            }
        }

        return count;
    }

    static int findFirstMatchIndex(List<String> values, List<String> scans) {
        if (values.size() < scans.size()) {
            throw new IllegalArgumentException("Arg1 length can't be less than Arg2 length");
        }
        int index = 0;
        int scannedIndex = 0;
        for (int i = 0; i < values.size(); i++) {
            String val = values.get(i);
            String scn = scans.get(scannedIndex);
            if (val.contains(scn)) {
                index = i;
                break;
            }
        }

        return index;
    }

    static List<String> realignLenght(List<String> values, List<String> scans) {
        if (values.size() == scans.size()) {
            return scans;
        }
        List<String> result = new ArrayList<>();

        int scanAmount = scans.size();
        int containsAmount = 0;

        int scansIndex = 0;
        for (int i = 0; i < values.size(); i++) {
            if (!values.get(i).contains(scans.get(scansIndex))) {
                result.add("");
            } else {
                if (containsAmount == scanAmount) {
                    result.add("");
                    continue;
                }
                result.add(scans.get(scansIndex));
                containsAmount++;
                if (scans.size() - 1 > scansIndex) {
                    scansIndex++;
                }
            }
        }


        return result;
    }

}
