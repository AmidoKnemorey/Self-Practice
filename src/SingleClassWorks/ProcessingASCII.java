package SingleClassWorks;

import java.util.Scanner;

public class ProcessingASCII {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        do {
            System.out.println("Enter first small latin letter.");
            String temporaryFirstChar = scanner.nextLine();
            System.out.println("Enter second small latin letter.");
            String temporarySecondChar = scanner.nextLine();
            if (temporaryFirstChar.length() == 1 & temporarySecondChar.length() == 1) {
                    char firstChar = temporaryFirstChar.charAt(0);
                    char secondChar = temporarySecondChar.charAt(0);
                    if (firstChar >= 97 & firstChar <= 122 & secondChar >= 97 & secondChar <= 122) {
                        processingOfTwoLetters(firstChar, secondChar);
                        scanner.close();
                        break;
                    } else System.out.println("Wrong enter.");
                } else System.out.println("Wrong enter.");
        } while (true);
    }

    private static void processingOfTwoLetters (char firstCharacter, char secondCharacter) {
        System.out.println("Your letters are ["+firstCharacter+"] and ["+secondCharacter+"]");
        if (firstCharacter - secondCharacter > 0) {
            System.out.println("Amount of letters between your two letters in alphabet is " + (firstCharacter - secondCharacter));
        } else if (firstCharacter - secondCharacter < 0) {
            System.out.println("Amount of letters between your two letters in alphabet is " + (secondCharacter - firstCharacter));
        } else {
            System.out.println("Amount of letters between your two letters in alphabet is 0");
        }
    }
}