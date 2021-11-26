package SingleClassWorks_1;

import java.util.Scanner;
import static java.lang.Character.toLowerCase;
import static java.lang.Character.toUpperCase;

public class BigSmallLetters {

    public static void main(String[] args) {
        Scanner ScannerMain = new Scanner(System.in);
        System.out.println("insert a word");
        String messageToMethod = ScannerMain.nextLine();
        System.out.println(ReplaceLetters(messageToMethod));
    }


    public static String ReplaceLetters(String messageToMethod) {
        char [] TemporaryArray = messageToMethod.toCharArray();
        for (int i = 0; i <= (TemporaryArray.length-1); i++) {
            TemporaryArray[i] = toUpperCase(TemporaryArray[i]);
            if (i == (TemporaryArray.length-1)) {
                break;
            }
            i++;
            TemporaryArray[i] = toLowerCase(TemporaryArray[i]);
        }
        return messageToMethod = String.valueOf(TemporaryArray);
    }
}