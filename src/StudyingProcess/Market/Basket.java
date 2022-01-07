package StudyingProcess.Market;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class Basket {

    private final List<Product> allProducts = new ArrayList<Product>();

    public void addProductToBasket(Product produkt) {
        allProducts.add(produkt);
    }

    public void removeProduct (Product product) {
        allProducts.remove(product);
    }

    public void cleanTheBasket() {
        allProducts.clear();
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