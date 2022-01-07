package StudyingProcess.Market;

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
    public void increaseQuantity(int amountToIncrease) {
        this.quantity += amountToIncrease;
    }

    @Override
    public void decreaseQuantity(int amountToDecrease, Basket basket) throws LackOfQuantityException {
        if (this.quantity > amountToDecrease) {
            this.quantity -= amountToDecrease;
        } else if (this.quantity == amountToDecrease) {
            basket.removeProduct(this);
        } else { throw new LackOfQuantityException(); }
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
}