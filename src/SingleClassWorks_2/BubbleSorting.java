package SingleClassWorks_2;

import java.util.*;

public class BubbleSorting {

    public static void main(String[] args) {

        // 15 numbers for instance: 27 20 9 97 85 42,4 98 64.7 26 1,43 54 39 87 99 80

        double [] differentNumbers = {0};

        try (Scanner input = new Scanner(System.in)) {
            System.out.printf("What length of a list do you want?%n");
             differentNumbers = new double [input.nextInt()]; input.nextLine();
            System.out.printf("Input the same amount of different numbers through the space below.%n%n");
            String nonProcessedNumbers = input.nextLine().replace(',', '.');
            String [] temporaryStorageOfNumbers = nonProcessedNumbers.split(" ");

            for (int i = 0; i < temporaryStorageOfNumbers.length; i++) {
                differentNumbers[i] = Double.parseDouble(temporaryStorageOfNumbers[i]);
            }

            System.out.printf("An array before sorting.%n"+Arrays.toString(differentNumbers)+"%n");

            boolean isSorted;

            do {
                isSorted = false;
                for (int i = 0; i < differentNumbers.length - 1; i++) {
                    if (differentNumbers[i] > differentNumbers[i + 1]) {
                        double auxiliaryVariable = differentNumbers[i + 1];
                        differentNumbers[i + 1] = differentNumbers[i];
                        differentNumbers[i] = auxiliaryVariable;
                        isSorted = true;
                    }
                }
            } while (isSorted);

            System.out.printf("An array after sorting.%n"+Arrays.toString(differentNumbers));

        } catch (InputMismatchException | NumberFormatException exception) {
            System.err.println("You've written something wrong during the inputting.");
        } catch (ArrayIndexOutOfBoundsException exception) {
            System.err.println("You've inputted more numbers than array's capacity you've declared before.");
        } finally {
            findAverageValue(differentNumbers);
        }
    }
    private static void findAverageValue (double[] processingArray) {
        OptionalDouble averageValueOdArray = Arrays.stream(processingArray).average();
        if (averageValueOdArray.isPresent()) {
            System.out.printf("%n%nAverage value of an array is %.3f %n", averageValueOdArray.getAsDouble());
        }
    }
}