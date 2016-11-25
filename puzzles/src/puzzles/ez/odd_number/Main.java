package puzzles.ez.odd_number;

/**
 * Created by Vyacheslav on 17.11.2016.
 */
public class Main {
    public static void main(String args[]) {
        doWork(100);
    }

    static void doWork(int writeTo) {
        for (int i = 1; i < writeTo; i++) {
            if (i % 2 != 0) {
                System.out.println(i);
            }
        }
    }

}
