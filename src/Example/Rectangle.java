package Example;

import java.util.Scanner;

import static java.lang.System.out;

public class Rectangle {
    public static void main(String[] args) {

        Scanner scannerForNumbers = new Scanner(System.in);
        Scanner scannerForString = new Scanner(System.in);

        out.println("Give me a length of the first rectangle's side...");
        short firstSide = scannerForNumbers.nextShort();

        out.println("Now give me a length of the second rectangle's side...");
        short secondSide = scannerForNumbers.nextShort();

        out.println("Now what do you want to know, perimeter, or area?");

        do {
            String requestByUser = scannerForString.nextLine();
            if (requestByUser.equals("Perimeter") | requestByUser.equals("perimeter")) {
                out.println("Perimeter of the rectangle = "+((firstSide*2)+(secondSide*2))+" sm."); break;
            } else if (requestByUser.equals("Area") | requestByUser.equals("area")) {
                out.println("Area of the rectangle = "+(firstSide*secondSide)+" sm."); break;
            } else { out.println("Wrong request, try again! Perimeter or area?"); }
        } while (true);


    }
}
