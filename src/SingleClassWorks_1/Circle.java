package SingleClassWorks_1;

import java.util.Scanner;
import static java.lang.System.out;

public class Circle {

    public static void main (String[] args) {

        do {
            out.println("Insert circle's diameter in order to know circle's area, circumference and perimeter.");
            Scanner Scan1 = new Scanner(System.in);
            float diameter = Scan1.nextFloat();
            float area = (float) (Math.PI * (Math.pow(diameter, 2))) / 4;
            float perimeter = (float) ((Math.PI * 2) * (diameter / 2));
            float circumference = (float) (Math.PI * diameter);
            // L = πD = 2πr
            out.println("Circle's area = " + area);
            out.println("Circle's perimeter = " + perimeter);
            out.println("Cirlce's circumference = " + circumference);
        } while (true);
    }
}