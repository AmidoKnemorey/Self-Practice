package Example;
import java.math.BigInteger;
import java.util.Scanner;

public class Factorial {
    public static void main(String[] args) { //Factorial of number through method and nope

        System.out.println("So, now we'll count the factorial of your number.\nInsert your number:");
        Scanner Scaner = new Scanner(System.in);
        int keyValue = Scaner.nextInt();
        System.out.println("The factorial of your number is: "+Counting(keyValue));

    }

    private static BigInteger Counting (Integer ints) {
        BigInteger result = new BigInteger(String.valueOf(1));
        for (int i = 2; i <= ints; i++) {
            BigInteger g = new BigInteger(String.valueOf(i));
            result = result.multiply(g);
        }
        return result;
    }
}