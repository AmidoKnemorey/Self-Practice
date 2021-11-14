package SingleClassWorks;

import java.text.DecimalFormat;
import java.util.Scanner;

public class SortingAllSymbols {
    // this program counts amount of spaces and symbols of entered text.
    public static void main(String[] args) {

        Scanner oneScanner = new Scanner(System.in);
        DecimalFormat decimalFormat = new DecimalFormat("#.##");
        System.out.println("Enter some arbitrary text below.");
        String sourceOfText = oneScanner.nextLine();
        oneScanner.close();

        char[] fromStringAbove = sourceOfText.toCharArray();

        double spacesCounter = 0;
        double symbolsCounter = 0;

        for (char eachSymbol : fromStringAbove) {
            if (eachSymbol == ' ') {
                spacesCounter++;
            } else { symbolsCounter ++; }
        }

        double percentageOfSpaces = spacesCounter / fromStringAbove.length * 100;
        double percentageOfSymbols = symbolsCounter / fromStringAbove.length * 100;

        System.out.println("Percentage of spaces of entered text is "+decimalFormat.format(percentageOfSpaces));
        System.out.println("Percentage of symbols of entered text is "+decimalFormat.format(percentageOfSymbols));
    }
}