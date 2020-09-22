package Lektion2;

import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Random;

public class uppg3 {
    public static void main(String[] args) {
        TempReader tr = new TempReader(Paths.get("vader.csv"));
        List<Vader> resultatet = tr.getTemps();

        ArrayList<Vader> arraylistvader = new ArrayList<>(resultatet);
        LinkedList<Vader> linkedlistvader = new LinkedList<>(resultatet);

        int[] pos = new int[10000];
        Random rnd = new Random();

        for (int i = 0; i < 10000 ; i++) {
            pos[i] = rnd.nextInt(resultatet.size());

        }

        StopWatch al = new StopWatch();
        al.start();

        for (int i = 0; i < pos.length ; i++) {
            arraylistvader.get(pos[i]);
        }

        al.stop();
        StopWatch ll = new StopWatch();
        ll.start();

        for (int i = 0; i <10000 ; i++) {
            linkedlistvader.get(pos[i]);
        }

        ll.stop();

        System.out.println("tid array " + al.timeElapsed());
        System.out.println("tid linked " + ll.timeElapsed());
    }
}
