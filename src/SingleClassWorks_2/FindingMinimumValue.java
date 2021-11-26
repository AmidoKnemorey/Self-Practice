package SingleClassWorks_2;

import java.util.Scanner;

public class FindingMinimumValue {
    // This program takes several fractional number by you, in order to find minimum of them.
    // I did not do a possibility of handling of entering wrong symbols, for example letters.
    public static void main(String[] args) {
        Scanner theOnlyOne = new Scanner(System.in);
        System.out.println("Enter several different fractional numbers using comma or dot, through space below:");
        String temporary = theOnlyOne.nextLine();
        double[] finalArrayWithFractions = replaceStringToArrayOfDouble(temporary);
        System.out.println("Minimum of entered numbers is "+findingTheMinimumNumberOfArray(finalArrayWithFractions));
        theOnlyOne.close();
    }

    private static double[] replaceStringToArrayOfDouble (String localString) {
        localString = localString.replace(',', '.');
        String[] arrayWithStrings = localString.split(" ");
        double[] arrayWithIntegers = new double[arrayWithStrings.length];
        for (int i = 0; i < arrayWithStrings.length; i++) {
            arrayWithIntegers[i] = Double.parseDouble(arrayWithStrings[i]);
        } return arrayWithIntegers;
    }

    private static double findingTheMinimumNumberOfArray (double[] acceptedArray) {
        double tmp = acceptedArray[0];
        for (double currentArrayIndex : acceptedArray) {
            if (currentArrayIndex < tmp) {
                tmp = currentArrayIndex;
            }
        }
        return tmp;
    }

}
