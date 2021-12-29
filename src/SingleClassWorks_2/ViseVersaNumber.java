package SingleClassWorks_2;

import java.util.Scanner;

public class ViseVersaNumber {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("enter some number below end press enter button");
        int number = scanner.nextInt();
        int reversNumber = 0;

        while (number != 0) {
            reversNumber *= 10;
            reversNumber += number % 10;
            number = number / 10;
        }
        System.out.println(reversNumber);
        scanner.close();
    }
}