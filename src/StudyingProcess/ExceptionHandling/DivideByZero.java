package StudyingProcess.ExceptionHandling;

import java.util.InputMismatchException;
import java.util.Scanner;

public class DivideByZero {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        boolean switcher = true;

        do {
            try {
                System.out.println("enter numerator as integer ");
                int numerator = scanner.nextInt();
                System.out.println("enter denominator as integer ");
                int denominator = scanner.nextInt();

                int result = quotient(numerator, denominator);
                System.out.printf("%nResult: %d / %d = %d%n", numerator, denominator, result);
                switcher = false;
                scanner.close();
            }
            catch (InputMismatchException inputMismatchException) {
                System.err.printf("%nLook at this! An exception: %s%n", inputMismatchException);
                scanner.nextLine();
                System.out.printf("you must enter only an integer, try again%n%n");
            } catch (ArithmeticException arithmeticException) {
                System.err.printf("Look at this! An exception: %s%n", arithmeticException);
                System.out.printf("Zero can't be as denominator. Try again.%n%n");
            }
        } while (switcher);
    }
    public static int quotient (int numerator, int denominator) throws ArithmeticException {
        return numerator / denominator;
    }
}