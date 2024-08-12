package easy.gigasecond;

// Link: https://exercism.org/tracks/java/exercises/gigasecond

import java.time.LocalDate;
import java.time.LocalDateTime;

public class Gigasecond {

    private final LocalDateTime localDateTime;

    public Gigasecond(LocalDate moment) {
        this.localDateTime =  moment.atStartOfDay();
    }

    public Gigasecond(LocalDateTime moment) {
        this.localDateTime = moment;
    }

    public LocalDateTime getDateTime() {
        return localDateTime.plusSeconds(1_000_000_000);
    }
}
