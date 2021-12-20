package PracticingWithOOP.Market;

import java.time.LocalDate;
import java.util.function.Function;

public class AvailabilityFunction implements Function <LocalDate, Boolean>  {

    @Override
    public Boolean apply(LocalDate localDate) {

        return false;
    }
}
