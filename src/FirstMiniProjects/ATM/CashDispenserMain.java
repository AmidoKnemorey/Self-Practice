package FirstMiniProjects.ATM;

import java.util.Scanner;

public class CashDispenserMain {

//  this simple program from my Home tasks
//  just simulates real FirstMiniProjects.ATM. Just run it and use information of
//  cliets bellow, in console after running the program.
//  I did it first time and all this program is one of my first codes in Java.
//  Someday I'll expand this study program if I have no other tasks :P
//  I'm newbee 31.10.2021. I left my own comments on Polish and Russian language in code.

    public static void main(String[] args) {
        Scanner ScannerString = new Scanner(System.in);
        Scanner ScannerInt = new Scanner(System.in);
        // bellow: name/cardnumber/pin/moneyOfClient
        Client client1 = new Client("John Smith","123", "4353", 129);
        Client client2 = new Client("Janush Kaminski","124", "4354", 500);
        Client client3 = new Client("Wilhelm Schneider","125", "4355", 800);
        Client client4 = new Client("Vladimir Gromov","127","4444",2150);

        Client[] allClients = {client1, client2, client3, client4}; // массив клиентов;

        CashDispenser HardMoney = new CashDispenser(1000, allClients); // создал банк;

        System.out.println("Welcome, please insert your card.");

                                                //Ustalenie użytkownika
        String userInput = ScannerString.nextLine();
        Client CurrentClient = HardMoney.putCard(userInput);
        if (CurrentClient == null) {
            System.out.println("Incorrect card number.");
            System.exit(0);
        } else { System.out.println("Good to see you the owner of card #"+CurrentClient);
                 System.out.println("Your index is "+CurrentClient.getIdOfClient()+"."); }

                                                //Autoryzajca PINem
        System.out.println("Please insert password of your card.");
        String Password = ScannerString.nextLine();
        boolean isPinCorrect = HardMoney.isPinCorrect(CurrentClient,Password);
        for(int i = 0; i < 10; i++){System.out.println();}
            if (isPinCorrect) {
                System.out.println("Password accepted dear "+CurrentClient.getOwnerName()+".");
            } else {
                System.out.println("Incorrect password.");
                System.exit(0);
            }


        System.out.println("You have "+CurrentClient.getAccountState()+" dollars in your account.");

        do {
            System.out.println(HardMoney.actionList());
            switch (ScannerInt.nextByte()) {
                case 1:
                    System.out.println("How many dollars to withdrawal?");
                    double temporary = ScannerInt.nextDouble();
                    double temporaryAccountState = CurrentClient.getAccountState();
                    double atmTotalAmount = HardMoney.getTotalAmount(); //остановился на вычислении оставшихся
                    temporary = temporaryAccountState - temporary;      //средств в банкомате
                    atmTotalAmount = atmTotalAmount - temporary;
                        if (temporary >= 0 && atmTotalAmount >= 0) {
                            CurrentClient.setAccountState(temporary);
                            System.out.println("Please take your money from the receiver");
                            System.out.println("You have $" + CurrentClient.getAccountState() + " left in your account.");
                            break; }  else  {
                            System.out.println("It's not enough money in account."); break; }
                case 2:
                    System.out.println("How many dollars to put?");
                    double temporary2 = ScannerInt.nextDouble();
                    double temporaryAccountState2 = CurrentClient.getAccountState();
                    temporary2 = temporaryAccountState2 + temporary2;
                    CurrentClient.setAccountState(temporary2);
                    System.out.println("Processing.....");
                    System.out.println("You have $" + CurrentClient.getAccountState() + " left in your account.");
                    break;
                case 3:
                    System.out.println("Good bye. Have a nice mood.");
                    System.exit(0);
                case 4:
                    System.out.println("Police will be here in 5 minutes and kick his ass. Also, your card deactivated.");
                    System.exit(0);
                case 5:
                    Scanner ScannerOnlyCase5 = new Scanner(System.in);
                    System.out.println("Insert your current password.");
                    String currentPassword = ScannerOnlyCase5.nextLine();
                    if (currentPassword.equals(CurrentClient.getPinNumber())) {
                        System.out.println("Insert new password.");
                        String newPassword = ScannerOnlyCase5.nextLine();
                        CurrentClient.setPinNumber(newPassword);
                        System.out.println("Done. Your new password is " + CurrentClient.getPinNumber() + ".");
                    } else {
                        System.out.println("Incorrect password.");
                        System.exit(0);
                    }
                default:
            }
        } while (true);
    }
}