package FirstMiniProjects.BankSystem;

import java.math.BigDecimal;

public interface DispenserInterface<Client> {

    void putCard();

    void isPinCorrect(Client client);

    BigDecimal getTotalAmountOfClient(Client client);

    void setTotalAmountOfClient(Client client, BigDecimal newAmount);

    String actionList ();

    String getAddressOfDispenser();

    BigDecimal getTotalAmount();

    void setTotalAmount(BigDecimal changedValue);

    void mainMenu(int pin, DispenserInterface<Client> dispenser, Client currentClient);

    int inputHandler();
}