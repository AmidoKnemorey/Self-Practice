package FirstMiniProjects.BicyclesRentalAnalysis;

import java.time.Duration;
import java.util.*;

public class CalculatingBoy {       // Period, Duration, ChronoUnit

    public void averageLeaseDuration(List<TheTrip> allTripsAreHere) {
        long accumulator = 0;
        for (TheTrip theTrip : allTripsAreHere) {
            Duration mainDuration = Duration.between(theTrip.getStartOfTrip(), theTrip.getEndOfTrip());
            accumulator += mainDuration.toMinutes();
        }
        int averageBicycleUsingTime = (int) accumulator / allTripsAreHere.size();
        System.out.println("Average bicycle's lease duration is " + averageBicycleUsingTime + " minutes.");
    }

    public void mostOftenUsedBicycle(List<TheTrip> allTripsAreHere) {
        HashMap<Integer, Integer> allUsedBicycles = new HashMap<>();
        for (TheTrip theTrip : allTripsAreHere) {
            allUsedBicycles.merge(theTrip.getIdOfBicycle(), 1, Integer::sum);
        }
        Integer maxQuantityOfUsing = Collections.max(allUsedBicycles.values());
//        Set<Integer> mostUsedBicycle = allUsedBicycles.entrySet()
//            .stream().filter(entry -> Objects.equals(entry.getValue(), maxQuantityOfUsing))
//            .map(Map.Entry::getKey).collect(Collectors.toSet());
//        System.out.println("Most often used bicycle is "+mostUsedBicycle+". It was used for "+maxQuantityOfUsing+" times.");
//        getKeyByValue(allUsedBicycles,maxQuantityOfUsing);
//        }


        for (Map.Entry<Integer, Integer> entry : allUsedBicycles.entrySet()) {
            if (Objects.equals(maxQuantityOfUsing, entry.getValue())) {
                System.out.println("Most often used bicycle is " + entry.getKey() + ". It was used for " + maxQuantityOfUsing + " times.");
            }
        }
    }


}

//            It doesn't matter. Just in case, for me:
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