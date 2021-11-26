package SingleClassWorks_2;

import java.util.HashMap;

public class SortingNumbers {
    public static void main(String[] args) {
        //this program is counting repeated numbers
        int[] arrayOfNumbers = {15, 48, 98, 64, 76, 82, 34, 91, 64, 48, 73, 64, 64, 48, 98, 91};

        HashMap<Integer, Integer> repeatedValues = new HashMap<>();

        byte temporary = 0;

        for (int i = 0; i < arrayOfNumbers.length; i++) {
            for (int j = i + 1; j < arrayOfNumbers.length; j++) {
                if (arrayOfNumbers[i] == arrayOfNumbers[j]) {
                    temporary++;
                }
            }
            if (temporary != 0 & !repeatedValues.containsKey(arrayOfNumbers[i])) {
                repeatedValues.put(arrayOfNumbers[i], (temporary+1));
            } temporary = 0;
        }
        for (Integer it : repeatedValues.keySet()) {
            String key = it.toString();
            String value = repeatedValues.get(it).toString();
            System.out.println("The number "+key+" was repeated "+value+" times in a list.");
        }
    }
}