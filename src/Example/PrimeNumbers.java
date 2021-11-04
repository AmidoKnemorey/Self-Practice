package Example;
import java.util.Scanner;

public class PrimeNumbers {
    public static void main(String[] args) {
        Scanner theOnlyOne = new Scanner(System.in);
        System.out.println("Enter an integer below to find out prime numbers:");
        int byKeyboard = theOnlyOne.nextInt();
        calculatingPrimeNumbers(byKeyboard);
        theOnlyOne.close();

    }
    public static void calculatingPrimeNumbers (int byKeyboard){
        boolean checker = true;
        for (int n = 2; n <= byKeyboard; n++) {
            for (int k = 2; k <= (Math.sqrt(n)); k++) {
                if (n % k == 0) {
                    checker = false;
                    break;
                }
            } if (checker) {
                System.out.print(n+" ");
            } else checker = true;
        }
    }
}
