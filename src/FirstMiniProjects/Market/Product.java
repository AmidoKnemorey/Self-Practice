package FirstMiniProjects.Market;

import java.time.LocalDate;

public interface Product {

    String getTitle();

    boolean isProductAvailable(LocalDate localDate);

    double getPriceOfProduct();

    public int getQuantity();

    void increaseQuantity(int amount, Basket basket);

    void decreaseQuantity(int amount, Basket basket) throws NoSuchProductAvailableInBasket;
}
