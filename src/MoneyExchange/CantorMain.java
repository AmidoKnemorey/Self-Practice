package MoneyExchange;
import java.math.BigDecimal;

public class CantorMain {

    public static void main(String[] args) {

        CashStorage cashStorageMain = new CashStorage(new BigDecimal("3000.0"),new BigDecimal("4000.0"),new BigDecimal("5000.0"));
        System.out.println(cashStorageMain.quantityOfStorage());
        System.out.println("choose option");

    }
}

/*

            GBP - PLN - EUR
            GBP - PLN - USD
            USD - PLN - GBP
            EUR - PLN - GBP
            USD - PLN - EUR
            EUR - PLN - USD
            USD - PLN
            EUR - PLN
            GBP - PLN
            PLN - GBP
            PLN - USD
            PLN - EUR


*/
