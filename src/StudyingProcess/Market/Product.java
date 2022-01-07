package StudyingProcess.Market;

import java.time.LocalDate;

public interface Product {

    String getTitle();

    boolean isProductAvailable(LocalDate localDate);

    double getPriceOfProduct();

    public int getQuantity();

    void increaseQuantity(int amount);

    void decreaseQuantity(int amount, Basket basket) throws LackOfQuantityException;
}
