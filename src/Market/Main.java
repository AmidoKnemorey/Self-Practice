package Market;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {

        Basket mainBasket = new Basket();

        Produkt pen = new GenericProduct(() -> 15.5, (LocalDate) -> LocalDate.isAfter(java.time.LocalDate.of(2002,12,30)));
        Produkt nuts = new GenericProduct(() -> 12.03, (LocalDate) -> LocalDate.isBefore(java.time.LocalDate.now()));
        Produkt water = new GenericProduct(() -> 17.89, (LocalDate) -> LocalDate.isEqual(java.time.LocalDate.now()));

        mainBasket.addProductToBasket(pen);
        mainBasket.addProductToBasket(nuts);
        mainBasket.addProductToBasket(water);

        List<Produkt> products = new ArrayList<>(mainBasket.getAllProducts());

        System.out.println(pen.isProductAvailable(LocalDate.of(2001,5,17)));
        System.out.println(nuts.isProductAvailable(LocalDate.of(2001,5,17)));
        System.out.println(water.isProductAvailable(LocalDate.of(2021,12,22)));

        System.out.println(pen.getPriceOfProduct());
    }
}