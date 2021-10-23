package Example;

import java.util.Scanner;

import static java.lang.System.out;

public class Rectangle {
    public static void main(String[] args) {
        out.println("Give me a length of the first rectangle's side...");
        Scanner Scan1 = new Scanner(System.in);
        short Bok1 = Scan1.nextShort();
        out.println("Now give me a length of the second rectangle's side...");
        short Bok2 = Scan1.nextShort();
        out.println("Now what do you want to know, perimeter, or area?");
        for ( ; ; ) {
            Scanner Scan3 = new Scanner(System.in);
            String Q = Scan3.nextLine();
            if (Q.equals("Perimeter") | Q.equals("perimeter")) {
                out.println("Perimeter of the rectangle = "+((Bok1*2)+(Bok2*2))+" sm.");
            } else if (Q.equals("Area") | Q.equals("area")) {
                out.println("Area of the rectangle = "+(Bok1*Bok2)+" sm.");
            } else if (Q != "Perimeter" & Q != "perimeter" & Q != "Area" & Q != "area");
            {
                out.println("Wrong request, try again! Perimeter or area?");
            }
        }
    }
}
