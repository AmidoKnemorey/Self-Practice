package FirstMiniProjects.ATM;

public class Client {

    private static int idCounter = 0;

    private int idOfClient = 0;
    private final String ownerName;
    private final String accountNumber;
    private String pinNumber;
    private double accountState;

    public Client(String ownerName, String accountNumber, String pinNumber, double accountState) { //kontruktor
        this.ownerName = ownerName;
        this.accountNumber = accountNumber;
        this.pinNumber = pinNumber;
        this.accountState = accountState;
        this.idOfClient = ++idCounter;
    }


    public int getIdOfClient() { return idOfClient; }

    public String getOwnerName() { return ownerName; }

    public String getAccountNumber() {
        return accountNumber;
    }

    public String getPinNumber() {
        return pinNumber;
    }

    public void setPinNumber(String pinNumber) {
        this.pinNumber = pinNumber;
    }

    public double getAccountState() {
        return accountState;
    }

    public void setAccountState(double accountState) {
        this.accountState = accountState;
    }

    public String toString () {
        return String.format("%s", accountNumber);
    }
}