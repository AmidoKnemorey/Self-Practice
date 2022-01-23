package FirstMiniProjects.BankSystem;

import java.math.BigDecimal;
import java.util.*;

class BankServer {

    private static final BankServer INSTANCE = new BankServer();
    private final List<Client> allTheClients = new ArrayList<>();
    private BigDecimal totalBankAmountOfMoney = new BigDecimal(0);

    private BankServer() {
    }

    public synchronized void updateTotalMoney(BigDecimal moneyInNewDispenser) {
        totalBankAmountOfMoney = totalBankAmountOfMoney.add(moneyInNewDispenser);
    }

    public synchronized static BankServer getInstance() {
        // synchronized just because let's imagine several bank workers doing something at the same time
        return INSTANCE;
    }

    public int getPinNumber(Client client) {
        return Objects.requireNonNull(allTheClients.stream()
                .filter(client::equals)
                .findAny()
                .orElse(null))
                .getPinNumber();
    }

    public void setPinNumber(Client client, int newPin) {
        Objects.requireNonNull(allTheClients.stream()
                .filter(client::equals)
                .findAny()
                .orElse(null))
                .setPinNumber(newPin);
    }

    public synchronized void addClientToTheDataBase(Client client) {
        // synchronized just because let's imagine several bank workers are adding new client at the same time
        allTheClients.add(client);
    }

    public synchronized Optional<Client> isClientOfBank (int accountNumber) {
        // synchronized just because let's imagine several users are using different dispensers at the same time
        return allTheClients.stream()
                .filter(cl -> accountNumber == cl.getAccountNumber())
                .findAny();
    }

    public synchronized boolean isPinCorrect(Client client, int userPinInput) {
        // synchronized just because let's imagine several users are using different dispensers at the same time
        return allTheClients.stream()
                .filter(cl -> Objects.equals(cl, client))
                .anyMatch(cl -> cl.getPinNumber() == userPinInput);
    }

    public synchronized BigDecimal getTotalMoneyOfClient(Client client) {
        return Objects.requireNonNull(allTheClients.stream()
                .filter(client::equals)
                .findAny()
                .orElse(null))
                .getAccountState();
    }

    public void setTotalAmountOfClient(Client client, BigDecimal newAmount) {
        Objects.requireNonNull(allTheClients.stream()
                .filter(client::equals)
                .findAny()
                .orElse(null))
                .setAccountState(newAmount);
    }
}