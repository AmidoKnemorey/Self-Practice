package FirstMiniProjects.Market;

import java.util.NoSuchElementException;

public class NoSuchProductAvailableInBasket extends RuntimeException {

    public NoSuchProductAvailableInBasket() {
        super("Basket is empty.");
    }

}