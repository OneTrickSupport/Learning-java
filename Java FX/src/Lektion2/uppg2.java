package Lektion2;

import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class uppg2 {
    public static void main(String[] args) {
        TempReader tr = new TempReader(Paths.get("vader.csv"));
        List<Vader> resultatet = tr.getTemps();

        ArrayList<Vader> arrayListVader  = new ArrayList<>();
        LinkedList<Vader> linkedlistVader = new LinkedList<>();

        StopWatch arraylistTimer = new StopWatch();
        arraylistTimer.start();
        for (Vader v : resultatet
             ) {arrayListVader.add(v);

        } arraylistTimer.stop();

        StopWatch Linkedlisttimer = new StopWatch();
        Linkedlisttimer.start();

        for (Vader v: resultatet
             ) {linkedlistVader.add(v);

        }Linkedlisttimer.stop();
}}

