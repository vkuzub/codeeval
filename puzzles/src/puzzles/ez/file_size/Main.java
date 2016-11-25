package puzzles.ez.file_size;

import java.io.File;

/**
 * Created by Vyacheslav on 17.11.2016.
 */
public class Main {
    public static void main(String args[]) {
        System.out.println(doWork(args[0]));
    }

    static long doWork(String path) {
        File file = new File(path);
        return file.length();
    }

}
