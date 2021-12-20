package PracticingWithOOP.Market;

import java.util.ArrayList;
import java.util.List;

public class Basket {

    protected  List<Product> allBuyingProducts = new ArrayList<Product>();

    public void addProductToBasket(Product object) {
        allBuyingProducts.add(object);
    }

    public void deleteExactlyProduct(Object object) {
        allBuyingProducts.remove(object);
    }

    public void getAndBuyAllProducts() {
        allBuyingProducts.clear();
        System.out.println("You bought all the products from your basket, and basket is empty.");
    }

    @Override
    public String toString() {
        return allBuyingProducts.toString();
    }
}
