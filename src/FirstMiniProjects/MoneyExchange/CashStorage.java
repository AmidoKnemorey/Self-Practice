package FirstMiniProjects.MoneyExchange;
import java.math.BigDecimal;

public class CashStorage {
    private BigDecimal USD;
    private BigDecimal EUR;
    private BigDecimal PLN;

    public CashStorage (BigDecimal USD, BigDecimal EUR, BigDecimal PLN) {
        this.USD = USD;
        this.EUR = EUR;
        this.PLN = PLN;
    }

    public BigDecimal getUSD () {
        return USD;
    }

    public void setUSD (BigDecimal USD) {
        this.USD = USD;
    }

    public BigDecimal getEUR () {
        return EUR;
    }

    public void setEUR(BigDecimal EUR) {
        this.EUR = EUR;
    }

    public BigDecimal getPLN () {
        return PLN;
    }

    public void setPLN (BigDecimal PLN) {
        this.PLN = PLN;
    }

    public String actionList () {
        return ("");
    }

    public String quantityOfStorage () {
        return String.format("%s %s %s", this.USD, this.EUR, this.PLN);
    }
}
