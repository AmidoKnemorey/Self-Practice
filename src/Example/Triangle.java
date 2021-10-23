package Example;

import java.util.Scanner;

import static java.lang.System.out;

public class Triangle {
    public static void main(String[] args) {
        Scanner Sc1 = new Scanner(System.in);
        out.println("Insert a length of longest side.");
        double Lside = Sc1.nextDouble();
        out.println("Insert a length of second side.");
        double Side1 = Sc1.nextDouble();
        out.println("Insert a length of third side");
        double Side2 = Sc1.nextDouble();
        if (Math.pow(Lside, 2)==(Math.pow(Side1, 2))+(Math.pow(Side2, 2))) {
            out.println("right triangle");
        } else if (Math.pow(Lside, 2)<(Math.pow(Side1, 2))+(Math.pow(Side2, 2))) {
            out.println("acute-angled triangle");
        } else if (Math.pow(Lside, 2)>(Math.pow(Side1, 2))+(Math.pow(Side2, 2))) {
            out.println("Obtuse-angled triangle");
        } else out.println("its over cus mistake");
    }
}
