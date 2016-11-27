package puzzles.moderate.lost_in_translation;

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
        StringBuilder sb = new StringBuilder();
        Map<String, String> codelToCommon = fromCodelToCommon();
        for (char c : input.toCharArray()) {
            if (!Character.isWhitespace(c)) {
                String value = codelToCommon.get(String.valueOf(c));
                sb.append(value);
            } else {
                sb.append(" ");
            }
        }
        return sb.toString();
    }

    static Map<String, String> fromCodelToCommon() {
        String[] codelList = {"rbc vjnmkf kd yxyqci na rbc zjkfoscdd ew rbc ujllmcp", "tc rbkso rbyr ejp mysljylc kd kxveddknmc re jsicpdrysi", "de kr kd eoya kw aej icfkici re zjkr"};
        String[] commonList = {"the public is amazed by the quickness of the juggler", "we think that our language is impossible to understand", "so it is okay if you decided to quit"};

        StringBuilder sbCodel = new StringBuilder();
        StringBuilder sbCommon = new StringBuilder();
        for (String s : codelList) {
            sbCodel.append(s);
        }
        for (String s : commonList) {
            sbCommon.append(s);
        }

        char[] codelChars = sbCodel.toString().replace(" ", "").toCharArray();
        char[] commonChars = sbCommon.toString().replace(" ", "").toCharArray();

        Set<String> set = new HashSet<>();

        for (int i = 0; i < codelChars.length; i++) {
            set.add(codelChars[i] + "=" + commonChars[i]);
        }

        List<String> list = new ArrayList<>(set);
        Collections.sort(list);
//        System.out.println(list);

        int charLenght = 'z' - 'a' + 1;
        char[] allChars = new char[charLenght];

        Map<String, String> items = new HashMap<>();

        char start = 'a';
        for (int i = 0; i < allChars.length; i++) {
            items.put(Character.toString(start), "?");
            allChars[i] = start;
            start++;
        }

        items.put("n", "b");
        items.put("u", "j");
        items.put("g", "v");

        for (String s : list) {
            String[] split = s.split("=");
            String key = split[0];
            String value = split[1];
            items.put(key, value);
        }

        String missingValueKey = "a";

        List<Map.Entry<String, String>> entries = new ArrayList<>(items.entrySet());
        for (int i = 0; i < entries.size(); i++) {
            Map.Entry<String, String> entry = entries.get(i);
            if (entry.getValue().equals("?")) {
                missingValueKey = entry.getKey();
            }
        }

        String notUsingKey = null;
        int missingValueIndex = 0;
        List<String> vals = new ArrayList<>(items.values());
        for (int i = 0; i < allChars.length; i++) {
            if (!vals.contains(Character.toString(allChars[i]))) {
                missingValueIndex = i;
            }
        }

        notUsingKey = Character.toString(allChars[missingValueIndex]);

        items.put(missingValueKey, notUsingKey);

        return items;
    }

}
