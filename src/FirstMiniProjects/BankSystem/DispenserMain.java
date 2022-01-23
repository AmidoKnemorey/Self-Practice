package FirstMiniProjects.BankSystem;

import java.io.IOException;
import java.math.BigDecimal;


public class DispenserMain {
    public static void main(String[] args) throws IOException, InterruptedException {

        // creating several clients
        BankServer.getInstance().addClientToTheDataBase(new Client("John Smith", 123, 4353, new BigDecimal(129)));
        BankServer.getInstance().addClientToTheDataBase(new Client("Janusz Kaminski", 124, 4354, new BigDecimal(500)));
        BankServer.getInstance().addClientToTheDataBase(new Client("Wilhelm Schneider", 125, 4355, new BigDecimal(800)));
        BankServer.getInstance().addClientToTheDataBase(new Client("Vladimir Gromov", 126, 4444, new BigDecimal(2150)));
        BankServer.getInstance().addClientToTheDataBase(new Client("Janusz Kowalski", 127, 4445, new BigDecimal(3440)));

        // creating several dispensers
        DispenserInterface<Client> dispenser = new CashDispenser(new BigDecimal("50"), "Saint Istvan st.", 1);
        DispenserInterface<Client> dispenser2 = new CashDispenser(new BigDecimal("3000"), "Nostradamus st.", 2);
        DispenserInterface<Client> dispenser3 = new CashDispenser(new BigDecimal("2500"), "Gagarin Yuri st.", 3);

        // putting the card and start program
        dispenser.putCard();

    }
}