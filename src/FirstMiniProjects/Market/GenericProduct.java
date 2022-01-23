package FirstMiniProjects.Market;

import java.time.LocalDate;
import java.util.function.Function;
import java.util.function.Supplier;

public class GenericProduct implements Product {

    private final Supplier<Double> priceSupplier;
    private final Function<LocalDate, Boolean> isProductAvailable;
    private int quantity = 1;
    String title;

    public GenericProduct(Supplier<Double> price, Function<LocalDate, Boolean> isProductAvailable, String title) {
        this.priceSupplier = price;
        this.isProductAvailable = isProductAvailable;
        this.title = title;
    }

    @Override
    public void increaseQuantity(int amountToIncrease, Basket basket) {
        if (!basket.isProductInBasket(this)) {
            basket.addProductToBasket(this);
            this.quantity += amountToIncrease;
        }
        basket.currentCapacity += amountToIncrease;
    }

    @Override
    public void decreaseQuantity(int amountToDecrease, Basket basket) throws NoSuchProductAvailableInBasket {
        if (this.quantity > amountToDecrease) {
            this.quantity -= amountToDecrease;
            basket.currentCapacity -= amountToDecrease;
        } else if (this.quantity == amountToDecrease) {
            basket.removeProduct(this);
            basket.currentCapacity -= amountToDecrease;
        } else {
            System.out.printf("\nThere is only %d pcs of %s.\n", this.quantity, this.title);
        }
    }

    public int getQuantity() {
        return this.quantity;
    }

    @Override
    public String getTitle() {
        return this.title;
    }

    @Override
    public boolean isProductAvailable(LocalDate localDate) {
        return this.isProductAvailable.apply(localDate);
    }

    @Override
    public double getPriceOfProduct() {
        return this.priceSupplier.get();
    }

    @Override
    public String toString() {
        return  String.format("\nProduct %s, %d pcs. which costs %f, and it's availability: %s.", getTitle(), getQuantity(),
                getPriceOfProduct(), isProductAvailable(LocalDate.of(2022,1,3)));
    }
}