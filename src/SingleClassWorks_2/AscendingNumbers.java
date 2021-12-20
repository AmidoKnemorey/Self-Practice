package SingleClassWorks_2;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class AscendingNumbers {
    public static void main(String[] args) {
        int[] chaoticNumbers = new int[]{5, 8, 4, 6, 7, 8, 9, 10, 11, 12, 13,  1, 2, 3, 4, 5, 7, 5,};
        int counter = 0;
        List<Integer> bla = new ArrayList<Integer>();

        for (int i = 0; i < chaoticNumbers.length-1; i++) {
                if (chaoticNumbers[i+1] > chaoticNumbers[i]) {
                    counter++;
                } else {  bla.add(counter+1); counter = 0; }
        }
        System.out.println("Maximum of queue of ascending numbers is "+Collections.max(bla));
    }
}