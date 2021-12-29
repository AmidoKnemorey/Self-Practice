package Market;

import java.time.LocalDate;
import java.util.function.Function;
import java.util.function.Supplier;

public class GenericProduct implements Produkt {

    Supplier <Double> priceSupplier;
    Function <LocalDate, Boolean> availabilityFunction;

    public GenericProduct (final Supplier<Double> priceSupplier,final Function <LocalDate, Boolean> availabilityFunction) {
        this.priceSupplier = priceSupplier;
        this.availabilityFunction = availabilityFunction;
    }

    @Override
    public Boolean isProductAvailable (LocalDate localDate) {
        return availabilityFunction.apply(localDate);
    }

    @Override
    public Double getPriceOfProduct() {
        return priceSupplier.get();
    }

    @Override
    public String toString () {
        return String.format("Price of the product %f, availability is %b", this.priceSupplier.get(), this.availabilityFunction);
    }
}