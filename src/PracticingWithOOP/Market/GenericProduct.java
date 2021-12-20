package PracticingWithOOP.Market;

import java.time.LocalDate;
import java.util.function.Supplier;

public class GenericProduct implements Product {

    LocalDate isAvailable;

    private PriceSupplier priceSupplier;

    public GenericProduct (Supplier<Double> price) {

    }

    public GenericProduct (PriceSupplier supplier, LocalDate isAvailable) {
        this.priceSupplier = supplier;
        this.isAvailable = isAvailable;
    }

    @Override
    public PriceSupplier getPriceOfTheProduct() {
        return this.priceSupplier;
    }

    @Override
    public LocalDate isProductAvailable(Object object, LocalDate someDate) {
        return this.isAvailable;
    }
}