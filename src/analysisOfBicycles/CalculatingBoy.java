package analysisOfBicycles;
import java.time.Duration;
import java.time.LocalDateTime;
import java.time.Period;
import java.time.chrono.ChronoLocalDate;
import java.time.temporal.ChronoUnit;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.TimeUnit;

public class CalculatingBoy {       // Period, Duration, ChronoUnit

    public void averageLeaseDuration (List<TheTrip> allTripsAreHere) {
        long accumulator = 0;
        for (TheTrip theTrip : allTripsAreHere) {
            Duration mainDuration = Duration.between(theTrip.getStartOfTrip(), theTrip.getEndOfTrip());
            accumulator += mainDuration.toMinutes();
        }
            int averageBicycleUsingTime = (int) accumulator / allTripsAreHere.size();
            //System.out.println(accumulator);
            System.out.println("Average bicycle's lease duration is "+averageBicycleUsingTime+" minutes.");
    }

    public void mostOftenUsedBicycle (List<TheTrip> allTripsAreHere) {
        ArrayList<Integer> Inty = new ArrayList<>();
        for (TheTrip theTrip : allTripsAreHere) {
            int changer = 0;
            Inty.add(theTrip.getIdOfBicycle());
            ++changer;
        }
        //System.out.println(Inty);
    }
}










//            LocalDateTime startOfTrip = LocalDateTime.from(theTrip.getStartOfTrip());
//            LocalDateTime finishOfTrip = LocalDateTime.from(theTrip.getEndOfTrip());
//            byte yearsBetweenStartAndFinishTheTrip = (byte) startOfTrip.until(finishOfTrip, ChronoUnit.YEARS);
//            byte monthBetweenStartAndFinishTheTrip = (byte) startOfTrip.until(finishOfTrip, ChronoUnit.MONTHS);
//            int daysBetweenStartAndFinishTheTrip = (int) startOfTrip.until(finishOfTrip, ChronoUnit.DAYS);
//            long hoursBetweenStartAndFinishTheTrip = startOfTrip.until(finishOfTrip, ChronoUnit.HOURS);
//            long minutesBetweenStartAndFinishTheTrip = startOfTrip.until(finishOfTrip, ChronoUnit.MINUTES);
//            long secondsBetweenStartAndFinishTheTrip = startOfTrip.until(finishOfTrip, ChronoUnit.SECONDS);
//            System.out.println(minutesBetweenStartAndFinishTheTrip);
//            System.out.println(yearsBetweenStartAndFinishTheTrip+"|"+monthBetweenStartAndFinishTheTrip+"|"+daysBetweenStartAndFinishTheTrip+"|"+hoursBetweenStartAndFinishTheTrip+"|"+minutesBetweenStartAndFinishTheTrip+"|"+secondsBetweenStartAndFinishTheTrip);