package FirstMiniProjects.Market;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class Basket {

    private final List<Product> allProducts = new ArrayList<Product>();
    public int maxCapacity = 10;
    public int currentCapacity = 0;


    public void addProductToBasket(Product product) {
        allProducts.add(product);
        currentCapacity += product.getQuantity();
    }

    public int getCurrentCapacity() {
        return currentCapacity;
    }

    public void removeProduct (Product product) {
        allProducts.remove(product);
    }

    public boolean isProductInBasket(Product product) {
        return allProducts.contains(product);
    }

    public void cleanTheBasket() {
        allProducts.clear();
        currentCapacity = 0;
    }

//    public List<Product> getAllProducts() {
//        return new ArrayList<Product>(this.allProducts);
//    }

    public HashMap <Product, Integer> getAllProducts() {
       HashMap <Product, Integer> hashMap = new HashMap<>();
        this.allProducts.forEach(product -> hashMap.put(product, product.getQuantity()));
        return hashMap;
    }
}