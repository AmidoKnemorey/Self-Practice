package Market;

import java.util.ArrayList;
import java.util.List;

public class Basket {

    private final List<Produkt> allProducts = new ArrayList<Produkt>();

    public void addProductToBasket(Produkt produkt) {
        allProducts.add(produkt);
    }

    public void removeProduct (Produkt product) {
        allProducts.remove(product);
    }

    public void cleanTheBasket() {
        allProducts.clear();
    }

    public List<Produkt> getAllProducts() {
        return new ArrayList<>(this.allProducts);
    }
}