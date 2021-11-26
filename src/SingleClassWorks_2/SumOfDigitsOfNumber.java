package SingleClassWorks_2;

import java.util.Scanner;

public class SumOfDigitsOfNumber {

    // this program adds up between each other all the digits of a given number

    public static void main(String[] args) {
        Scanner theOnlyOne = new Scanner(System.in);
        long numberForProcessing = theOnlyOne.nextLong();
        parsing(numberForProcessing);
        theOnlyOne.close();
    }

    private static void parsing (long submittedNumber) {
        boolean switcher = true;
        long counter = 0;
        do {
            counter += submittedNumber % 10;
        submittedNumber = submittedNumber / 10;
            if (submittedNumber <= 10) {
                counter += submittedNumber;
                System.out.println("Sum of the number's digits is: "+counter);
                switcher = false;
            }
        } while (switcher);
    }

}
