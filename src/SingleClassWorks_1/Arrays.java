package SingleClassWorks_1;

import java.util.Scanner;
import java.util.stream.IntStream;
import static java.lang.System.out;

public class Arrays {
    public static void main(String[] args) {

        int[] Digits = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        // bellow is first way to summarize all numbers of array
        int total = IntStream.of(Digits).sum();
        out.println("Quantity of array's values by IntStream instruction is: "+total);
        // bellow is second way to summarize all numbers of array
//        int sum = 0; //Second way
//        for (int i = 0; i < Digits.length; i++) {
//            int index = Digits[i];
//            sum += index;
//        }
//        out.println("Quantity of array's values by For cycle is: " + sum);

        out.println("Does an array have your number?");

        Scanner yourNumber = new Scanner(System.in);

        int Number = yourNumber.nextInt();
        int check = 0;

        for (int i = 0; i < Digits.length; i++) {
            int Some = Digits[i];
            if (Number == Some) { check++; }
        }

        if (check == 1) { out.println("Array has"); }
        else { out.println("Array has no"); }
    }
}
