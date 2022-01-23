package FirstMiniProjects.BankSystem;

import java.math.BigDecimal;

public class Client {

    private final String ownerName;
    private final int accountNumber;
    private int pinNumber;
    private BigDecimal accountState;

    public Client(String ownerName, int accountNumber, int pinNumber, BigDecimal accountState) {
        this.ownerName = ownerName;
        this.accountNumber = accountNumber;
        this.pinNumber = pinNumber;
        this.accountState = accountState;
    }

    public String getOwnerName() { return ownerName; }

    public int getAccountNumber() {
        return accountNumber;
    }

    public int getPinNumber() {
        return pinNumber;
    }

    public void setPinNumber(int pinNumber) {
        this.pinNumber = pinNumber;
    }

    public BigDecimal getAccountState() {
        return new BigDecimal(String.valueOf(accountState));
    }

    public void setAccountState(BigDecimal accountState) {
        this.accountState = accountState;
    }

    public String toString () {
        return String.format("%s", accountNumber);
    }
}