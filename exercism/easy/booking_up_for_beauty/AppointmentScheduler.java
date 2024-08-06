package easy.booking_up_for_beauty;

// Link: https://exercism.org/tracks/java/exercises/karls-languages

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Locale;

public class AppointmentScheduler {

    public static void main(String[] args) {
        AppointmentScheduler scheduler = new AppointmentScheduler();
        System.out.println(scheduler.schedule("7/25/2019 13:45:00"));
        System.out.println(scheduler.getDescription(LocalDateTime.of(2019, 03, 29, 15, 0, 0)));
    }

    public LocalDateTime schedule(String appointmentDateDescription) {
        DateTimeFormatter parser = DateTimeFormatter.ofPattern("M/d/yyyy H:mm:ss");
        return LocalDateTime.parse(appointmentDateDescription, parser);
    }

    public boolean hasPassed(LocalDateTime appointmentDate) {
        return appointmentDate.isBefore(LocalDateTime.now());
    }

    public boolean isAfternoonAppointment(LocalDateTime appointmentDate) {
        int hour = appointmentDate.getHour();
        return hour >= 12 && hour < 18;
    }

    public String getDescription(LocalDateTime appointmentDate) {
        DateTimeFormatter printer = DateTimeFormatter.ofPattern("EEEE, MMMM d, yyyy, 'at' h:mm a.", Locale.ENGLISH);
        return "You have an appointment on " + printer.format(appointmentDate);

    }

    public LocalDate getAnniversaryDate() {
        return LocalDate.of(LocalDate.now().getYear(), 9, 15);
    }
}
