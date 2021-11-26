package SingleClassWorks_1;
import java.util.Scanner;

public class QuadraticEquation {
    //This program is solving quadratic equations.
    public static void main(String[] args) {

        Scanner mainScanner = new Scanner(System.in);
        System.out.println("Input three integers 'a', 'b' and 'c' through the coma.");
        String temporaryVariable = mainScanner.nextLine();
        String[] temporaryStorage = temporaryVariable.split(",");
        int a = Integer.parseInt(temporaryStorage[0]);
        int b = Integer.parseInt(temporaryStorage[1]);
        int c = Integer.parseInt(temporaryStorage[2]);

        solvingQuadraticEquation(a, b, c);
    }

    public static void solvingQuadraticEquation (int a, int b, int c) {
        // discriminant = b2 − 4ac
        double discriminant = Math.pow(b, 2) - (4 * a * c);
        if (discriminant < 0) {
            System.out.println("The equation hasn't roots.Discriminant is "+discriminant);
        }
        else if (discriminant == 0) {
            System.out.println("The equation has 1 root.Discriminant is "+discriminant);
            double x = (b + (Math.sqrt(discriminant))) / (2 * a);
            System.out.println("x = "+x);
        }
        else if (discriminant > 0) {
            System.out.println("The equation has 2 roots. Discriminant is "+discriminant);
            int x1 = (int) ((-b + (Math.sqrt(discriminant))) / (2 * a));
            int x2 = (int) (-b - (Math.sqrt(discriminant))) / (2 * a);
            System.out.println("x1 = "+x1+"; x2 = "+x2+";");
        }
    }
}