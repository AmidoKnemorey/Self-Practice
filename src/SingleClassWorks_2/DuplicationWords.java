package SingleClassWorks_2;

import java.util.Scanner;

public class DuplicationWords {
    // this program duplicates all words in entered phrase
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter some phrase below:");
        String phraseByConsole = scanner.nextLine();
        duplicationWords(phraseByConsole);
        scanner.close();
    }
    public static void duplicationWords (String passedToMethod) {
        String[] splitPhrase = passedToMethod.split(" ");
        String[] processedPhrase = new String[splitPhrase.length * 2];
        String delimiter = " ";
        byte switcherOfIndex = 0;
        for (int i = 0; i < processedPhrase.length; i += 2) {
            processedPhrase[i] = splitPhrase[switcherOfIndex];
            processedPhrase[i + 1] = splitPhrase[switcherOfIndex];
            switcherOfIndex++;
        }
        System.out.println(String.join(delimiter, processedPhrase));
    }
}