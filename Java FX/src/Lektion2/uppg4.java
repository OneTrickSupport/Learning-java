package Lektion2;

import java.nio.file.Paths;
import java.util.*;

public class uppg4 {
    public static void main(String[] args) {
        TempReader tr = new TempReader(Paths.get("vader.csv"));
        List<Vader> resultatet = tr.getTemps();

        StopWatch h = new StopWatch();
        h.start();

        Set<Vader> hash = new HashSet<>(resultatet);
        h.stop();

        StopWatch t = new StopWatch();
        t.start();
        Set<Vader> tree = new TreeSet<>(resultatet);
        t.stop();

        StopWatch l = new StopWatch();
        l.start();
        Set<Vader> list = new LinkedHashSet<>(resultatet);
        l.stop();

        System.out.println("time for hash" + h.timeElapsed() + " nanos for " +hash.size() + "elements");
        //System.out.println("time for tre" + t.timeElapsed() + );

    }
}
