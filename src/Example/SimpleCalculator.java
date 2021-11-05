package Example;
import java.util.Scanner;

public class SimpleCalculator {

    static Scanner theOnlyOne = new Scanner(System.in);

    // I did it as I could, I'll improve this program later most likely.
    // Also, I had many problems with this task, and I spent a lot of time here,
    // so I can't look at it anymore, temporarily.
    // P.S. Use dot between non-integers.

    public static void main(String[] args) {
        double firstNumber = getNumber();
        char action = getAction();
        double secondNumber = getNumber();
        System.out.println(calculation(firstNumber,action, secondNumber));
    }

    public static double getNumber() {
        //Scanner localScanner = new Scanner(System.in);
        System.out.println("Enter an number below.");
        String temporary;
        double outFromMethod = 0;
        if (theOnlyOne.hasNextLine()) {
            temporary = theOnlyOne.nextLine();
            outFromMethod = Double.parseDouble(temporary);
        } else {
            System.out.println("Wrong entering.");
            outFromMethod = getNumber();
        }
        return outFromMethod;
    }

    public static char getAction() {
        //Scanner localScanner = new Scanner(System.in);
        String[] allPossibleOperators = {"+", "-", "*", "/"};
        char forTransferFromMethod = '0';
        boolean justChecker = true;
        do {
            System.out.println("Enter an simple math operation for these numbers below:");
            String finalAction = theOnlyOne.nextLine();
            for (String allPossibleOperator : allPossibleOperators) {
                if (finalAction.equals(allPossibleOperator)) {
                    justChecker = false;
                    forTransferFromMethod = finalAction.charAt(0);
                    break;
                }
            }
        } while (justChecker);
        return forTransferFromMethod;
    }

    public static double calculation(double firstNumber, char action, double secondNumber) {
        double resultOfCalculation;
        switch (action) {
            case '+' -> {
                resultOfCalculation = firstNumber + secondNumber;
                theOnlyOne.close();
            }
            case '-' -> {
                resultOfCalculation = firstNumber - secondNumber;
                theOnlyOne.close();
            }
            case '*' -> {
                resultOfCalculation = firstNumber * secondNumber;
                theOnlyOne.close();
            }
            case '/' -> {
                resultOfCalculation = firstNumber / secondNumber;
                theOnlyOne.close();
            }
            default -> {
                System.out.println("Something went wrong.");
                resultOfCalculation = calculation(firstNumber, action, secondNumber);
            }
        }
        return resultOfCalculation;
    }

}