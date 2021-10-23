package Example;
import java.util.Arrays;
import java.util.Scanner;
//import java.util.StringTokenizer;
//import java.util.regex.Matcher;
//import java.util.regex.Pattern;
//import static java.util.regex.Pattern.*;

public class Censorship {
    public static void main(String[] args) {
        String[] arrayOfBadWords = {"shit", "idiot", "fool", "stupid", "asshole","fuck"};
        Scanner scannerMain = new Scanner(System.in);
        System.out.println("give me a random word please");
        String sentence = scannerMain.nextLine();
        sentence = sentence.replaceAll("'","");

        String[] arrayOfUsersWords = sentence.split("\\W+");
        for (int i = 0; i < arrayOfUsersWords.length; i++) {
            for (int j = 0; j < arrayOfBadWords.length; j++) {
                if (arrayOfUsersWords[i].equals(arrayOfBadWords[j])) {
                    arrayOfUsersWords[i] = arrayOfUsersWords[i].replace(arrayOfUsersWords[i], "BEEP");
                }
            }
        }           //try this phrase -> You are stupid idiot, what the fuck are you doing asshole?

        System.out.println(Arrays.toString(arrayOfUsersWords));
        System.out.println(arrayOfUsersWords.length);


//        String[] values = {"AB","BC","CD","AE"};
//        boolean contains = Arrays.stream(values).anyMatch("BC"::equals);
//        System.out.println(contains);


    }
}