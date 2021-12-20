package PracticingWithOOP.Market;

import java.time.LocalDate;

public interface Product {

    PriceSupplier getPriceOfTheProduct();

    LocalDate isProductAvailable(Object object, LocalDate someDate);

}