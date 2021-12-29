package Market;

import java.time.LocalDate;

public interface Produkt {

    Boolean isProductAvailable(LocalDate localDate);

    Double getPriceOfProduct();
}
