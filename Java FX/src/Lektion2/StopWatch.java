package Lektion2;

import java.text.DecimalFormat;
import java.time.Duration;
import java.time.Instant;

public class StopWatch {
    private Instant start;
    private Instant stop;

    public StopWatch() {
    }

    public void start() {
        start = Instant.now();
    }

    public void stop() {
        stop = Instant.now();
    }

    public String timeElapsed() {
        DecimalFormat df = new DecimalFormat("#");

        if(!(start == null || stop == null)) {
            Duration time = Duration.between(start, stop);
            return df.format(time.toNanos());
        } else {
            return "Not a number";
        }
    }

    public String timeElapsedMillis() {
        DecimalFormat df = new DecimalFormat("#");

        if(!(start == null || stop == null)) {
            Duration time = Duration.between(start, stop);
            return df.format(time.toMillis());
        } else {
            return "Not a number";
        }
    }
}
