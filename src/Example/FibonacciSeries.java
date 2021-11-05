package Example;

import java.math.BigInteger;
import java.util.Scanner;

public class FibonacciSeries {
    public static void main(String[] args) {
        Scanner theOnlyOne = new Scanner(System.in);
        System.out.println("Please enter an integer below:");
        int byKeyboard = theOnlyOne.nextInt() - 2;
        Fibonacci(byKeyboard);
    }


   public static void Fibonacci (int byKeyboard) {
       //int a = 0, b = 1, c = 0;
       BigInteger a = BigInteger.valueOf(0);
       BigInteger b = BigInteger.valueOf(1);
       BigInteger c = BigInteger.valueOf(0);
       System.out.print("| "+a+" | "+b+" | ");
       for (int i = 0; i < byKeyboard; i++) {
           c = a.add(b);
           a = b;
           b = c;
           System.out.print(c+" | ");
       }
    }
}