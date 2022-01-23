package FirstMiniProjects.BankSystem;

import java.math.BigDecimal;
import java.util.*;

public class CashDispenser implements DispenserInterface<Client> {

    private BigDecimal totalAmount;
    private final String address;
    private final int id;

    public CashDispenser(BigDecimal totalAmount, String address, int id) {
        this.totalAmount = totalAmount;
        this.address = address;
        this.id = id;
        BankServer.getInstance().updateTotalMoney(totalAmount);
    }

    @Override
    public void putCard() {
        System.out.println("Welcome, please insert your card.");
        try {
            Client foundClient = BankServer.getInstance().isClientOfBank(inputHandler()).orElseThrow(NoSuchElementException::new);
            System.out.println("Good to see you the owner of card #" + foundClient.getOwnerName());
            isPinCorrect(foundClient);
        } catch (NoSuchElementException noSuchElementException) {
            System.err.println("You are not a client of this bank.");
            System.exit(0);

        }
    }

    @Override
    public void isPinCorrect(Client client) {
    System.out.println("Please insert password of your card.\n");
        int PIN = inputHandler();
        if (BankServer.getInstance().isPinCorrect(client, PIN)) {
            System.out.println("Password accepted dear "+client.getOwnerName()+".");
            mainMenu(PIN, this, client);
        } else {
            System.out.println("Incorrect PIN.");
            System.exit(0);
        }
    }

    @Override
    public BigDecimal getTotalAmountOfClient(Client client) {
        return BankServer.getInstance().getTotalMoneyOfClient(client);
    }

    @Override
    public void setTotalAmountOfClient(Client client, BigDecimal newAmount) {
        BankServer.getInstance().setTotalAmountOfClient(client, newAmount);
    }

    @Override
    public void setTotalAmount(BigDecimal changedValue) {
        this.totalAmount = changedValue;
    }

    @Override
    public String getAddressOfDispenser() {
        return address;
    }

    @Override
    public BigDecimal getTotalAmount() {
        return new BigDecimal(String.valueOf(totalAmount));
    }

    @Override
    public int inputHandler() {
        try {
            Scanner scanner = new Scanner(System.in);
            return Integer.parseInt(scanner.nextLine());
        } catch (NumberFormatException numberFormatException) {
            System.err.println("Incorrect inputted symbols. Must be only digits.");
            return this.inputHandler();
        }
    }

    @Override
    public void mainMenu(int pin, DispenserInterface<Client> dispenser, Client currentClient) {
        System.out.println("You have " + dispenser.getTotalAmountOfClient(currentClient) + " dollars in your account.");
        do {
            System.out.println(dispenser.actionList());
            switch (dispenser.inputHandler()) {
                case 1:
                    System.out.println("How many dollars to withdrawal?");
                    BigDecimal temporary = BigDecimal.valueOf(inputHandler());
                    if (dispenser.getTotalAmount().compareTo(temporary) < 0) {
                        System.out.println("It's not enough money in dispenser.");
                    } else if (BankServer.getInstance().getTotalMoneyOfClient(currentClient).compareTo(temporary) < 0) {
                        System.out.println("It's not enough money on account.");
                    } else {
                        setTotalAmountOfClient(currentClient, dispenser.getTotalAmountOfClient(currentClient).subtract(temporary));
                        dispenser.setTotalAmount(dispenser.getTotalAmountOfClient(currentClient).subtract(temporary));
                        System.out.println("Please take your money from the receiver below." +
                                "\n-----------------------------------------------" +
                                "\nYou have " +currentClient.getAccountState()+ "$ left in your account.");
                    } break;

                case 2:
                    System.out.println("How many dollars to put?");
                    BigDecimal byUserInput = BigDecimal.valueOf(inputHandler());
                    BankServer.getInstance().setTotalAmountOfClient(currentClient, BankServer.getInstance().getTotalMoneyOfClient(currentClient).add(byUserInput));
                    setTotalAmount(dispenser.getTotalAmount().add(byUserInput));
                    System.out.println("Processing.....\n" +
                            "You have $" + currentClient.getAccountState() + " left in your account.");
                    break;

                case 3:
                        System.out.println("Insert your current PIN number.");
                        if (inputHandler() == BankServer.getInstance().getPinNumber(currentClient)) {
                            System.out.println("Insert new PIN number.");
                            BankServer.getInstance().setPinNumber(currentClient, inputHandler());
                            System.out.println("Done. Your PIN number had changed.");
                        } else {
                            System.out.println("Incorrect password. You must reauthorize.");
                            System.exit(0);
                        } break;

                case 4:
                    System.out.println("Police will be here in 5 minutes and kick his ass. Also, your card deactivated.");
                    System.exit(0);

                case 5:
                    System.out.println("Good bye. Have a good time spending.\n-----------------------------------");
                    System.exit(0);

                case 6:
                    System.out.printf("ATM #%d on %s%n", id, getAddressOfDispenser());
                default:
            }
        } while (true);
    }

    @Override
    public String actionList () {
        return ("""
                ------------------------------
                Choose one of the items below.
                ------------------------------
                Press [1] to cash withdrawal.
                Press [2] to put your money in your account.
                Press [3] to change your password.
                Press [4] if some asshole behind you with the gun.
                Press [5] to quit.
                Press [6] to get dispenser's address.""");
    }
}