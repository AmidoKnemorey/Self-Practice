package SingleClassWorks_2;


import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class SortingWords {

    // This simple program takes few words through the console, and then shows you most long of them.

    public static void main(String[] args) {

        Scanner mainScanner = new Scanner (System.in);
        List<String> listWithStings = new ArrayList<>();

        System.out.println("Enter a few different length words separated the [Enter] button below.");
        System.out.println("To stop entering, write 'enough' instead of regular word:");
        while (mainScanner.hasNextLine()) {
            String bufferBeforeList = mainScanner.nextLine();
            if ((bufferBeforeList.contains("enough") || bufferBeforeList.contains("Enough")) & listWithStings.size() >= 1) {
                mainScanner.close();
                break;
            } else if ((bufferBeforeList.contains("enough") || bufferBeforeList.contains("Enough")) & listWithStings.size() < 1) {
                System.out.println("You didn't enter no one string.");
                break;
            }
            listWithStings.add(bufferBeforeList);
        }
        findingMostLongString(listWithStings);
    }
    private static void findingMostLongString(List<String> listWithStrings) {
        String temporaryWithinSorting = listWithStrings.get(0);
        for (int i = 1; i < listWithStrings.size(); i++) {
            if (temporaryWithinSorting.length() < listWithStrings.get(i).length()) {
                temporaryWithinSorting = listWithStrings.get(i);
            }
        }
        System.out.println("Most long word of entered by you is: " + temporaryWithinSorting);
    }
}