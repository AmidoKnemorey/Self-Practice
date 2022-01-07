package StudyingProcess.ExceptionHandling;

import java.util.InputMismatchException;
import java.util.Scanner;

public class TestingHandling {
    public static void main(String[] args) {
        mainTestMethod();
    }

    private static void mainTestMethod() {
        try {
            Scanner input = new Scanner(System.in);
            System.out.println("Enter some one digit.");
            int digit = input.nextInt();
            if (!(digit >= 0 & digit <= 9)) {
                throw new IllegalArgumentException();
            } else {
                input.close();
                System.out.println("Congratulation, you did it!");
            }
        } catch (IllegalArgumentException illegalArgumentException) {
            System.err.println("Attention user! IllegalArgumentException!");
            System.out.println("You should have inputted only a digit.");
            mainTestMethod();
        } catch (InputMismatchException inputMismatchException) {
            System.err.println("Attention user! InputMismatchException!");
            System.out.println("You should have inputted only a digit, not some other symbol.");
            mainTestMethod();
        } finally {
            System.out.println("This is the end of the try/catch block within finally block.");
        }
        /*
        Multi catch block for instance below:
        catch (ArithmeticException | IndexOutOfBoundsException |IllegalArgumentException exception)
         */
        }
}