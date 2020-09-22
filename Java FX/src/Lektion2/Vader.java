package Lektion2;

import java.io.IOException;
import java.time.LocalDate;
import java.time.LocalTime;
import java.util.Objects;

public class Vader implements Comparable<Vader> {
    LocalDate date;
    LocalTime time;
    Double temp;

    public Vader() {
    }

    public Vader(LocalDate date, LocalTime time, Double temp) {
        this.date = date;
        this.time = time;
        this.temp = temp;
    }

    public LocalDate getDate() {
        return date;
    }

    public void setDate(LocalDate date) {
        this.date = date;
    }

    public LocalTime getTime() {
        return time;
    }

    public void setTime(LocalTime time) {
        this.time = time;
    }

    public Double getTemp() {
        return temp;
    }

    public void setTemp(Double temp) {
        this.temp = temp;
    }

    // Automatic and correct implementations of equals() and hashCode()
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Vader vader = (Vader) o;
        return Objects.equals(date, vader.date) &&
                Objects.equals(time, vader.time) &&
                Objects.equals(temp, vader.temp);
    }

    @Override
    public int hashCode() {
        return Objects.hash(date, time, temp);
    }

    @Override
    public int compareTo(Vader o) {
        return this.getTemp().compareTo(o.getTemp());
    }
}
