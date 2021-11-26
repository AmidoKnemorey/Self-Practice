package SingleClassWorks_1;
import java.util.Scanner;
import static java.lang.System.out;

public class FizzBuzz {
    public static void main(String[] args) {
        Scanner SomeScanner = new Scanner(System.in);
        out.println("give me a number to play with me FizBuz");
        int Getting = SomeScanner.nextInt();
        for (int i = 1; i <=Getting; i++) {
            if (i%15==0) { out.println(i+" fizbuz"); } // alternatywa (i%3==0 & i%5==0)
            else if (i%3==0) { out.println(i+" fiz"); }
            else if (i%5==0) { out.println(i+ " buz"); }
            else out.println(i);
        }
    }
}