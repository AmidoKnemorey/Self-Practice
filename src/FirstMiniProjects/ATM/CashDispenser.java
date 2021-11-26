package FirstMiniProjects.ATM;

public class CashDispenser {

    private final double totalAmount;     // money
    private final Client[] clients;       // array with clients

    public CashDispenser(double totalAmount, Client[] clients) {
        this.totalAmount = totalAmount;
        this.clients = clients;
    } //конструктор банкомата


    public double getTotalAmount() {
        return totalAmount;
    }

    public Client putCard(String accountNumber) {
        for (Client client : this.clients) {
            if (client.getAccountNumber().equals(accountNumber)) {
                return client;
            }
        }
        return null;
        //MandatoryExercise4 ti wsjazówka
        //this.client <- tablica do przeszukania
        //Sposród wszystkich klientów wybierz tego, który ma taki numer konta jak `accountNumber` z parametru.
    }   //поиск клиента

    public boolean isPinCorrect(Client client, String userPinInput) { //client // password
            if (client.getPinNumber().equals(userPinInput)) {
                return true;
            } else {
                return false;
            }
            //sprawdz, czy klient podal poprawny pin.
            //return false;
            //Client client1 = new Client("123", "4353", 129);
    }

    public String actionList () {
        return ("Choose one of the items below.\n" +
                "Press [1] to cash withdrawal.\n" +
                "Press [2] to put your money in your account.\n" +
                "Press [3] to quit\n" +
                "Press [4] if some asshole behind you with the gun.\n" +
                "Press [5] to change your password.");
    }

}