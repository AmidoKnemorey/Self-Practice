package Example;

import java.util.Scanner;

import static java.lang.System.out;

public class Circle {
    public static void main (String[] args) {
        for( ; ; ) {
            out.println("Insert circle's diameter in order to know circle's area and perimeter.");
            Scanner Scan1 = new Scanner(System.in);
            double Diameter = Scan1.nextShort();
            Double Area = (Math.PI * (Math.pow(Diameter, 2))) / 4;
            Double Perimeter = (Math.PI * 2) * (Diameter / 2);
            out.println("Circle's area = " + Area);
            out.println("Circle's perimeter = " + Perimeter);
        }
        //Math.exp(Diameter * Math.log(2));
    }
}
