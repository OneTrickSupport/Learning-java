package Lektion2;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.time.LocalDate;
import java.time.LocalTime;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class TempReader {
    private Path filename;
    private List<Lektion2.Vader> finishedList = new LinkedList<>();

    public TempReader(Path fn) {
        filename = fn;
    }

    public List<Vader> getTemps() {
        List<String> temps = new LinkedList<>();

        try {
            temps = Files.readAllLines(filename);
        } catch (IOException e) {
            System.out.println("An error occured");
        }

        for(String str: temps) {
            Vader tmp = new Vader();
            String[] parts = str.split(";");

            String[] theDate = parts[0].split("-");
            int year = Integer.parseInt(theDate[0]);
            int month = Integer.parseInt(theDate[1]);
            int day = Integer.parseInt(theDate[2]);
            tmp.setDate(LocalDate.of(year, month, day));

            String[] time = parts[1].split(":");
            int hour = Integer.parseInt(time[0]);
            int min = Integer.parseInt(time[1]);
            int sec = Integer.parseInt(time[2]);
            tmp.setTime(LocalTime.of(hour, min, sec));

            tmp.setTemp(Double.parseDouble(parts[2]));
            finishedList.add(tmp);
        }

        return finishedList;
    }
}
