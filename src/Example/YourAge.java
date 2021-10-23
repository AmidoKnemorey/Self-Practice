package Example;

import java.util.Scanner;

import static java.lang.System.out;

public class YourAge {
    public static void main (String []args) {
        out.println("How old you?");
        Scanner Sc1 = new Scanner (System.in);
        int age = Sc1.nextInt();
        switch (age) {
            case 1,2,3,4,5,6,7,8:
                out.println("You're very small");
                break;
            case 9,10,11,12:
                out.println("You're young boy");
                break;
            case 13,14,15,16,17:
                out.println("You're teenager");
                break;
            case 18,19,20,21,22,23,24,25,26,27,28,29:
                out.println("You're yong man");
                break;
            case 30,31,32,33,34,35,36,37,38,39,40,41,42,43,44,45,46,47,48,49,50,51,52,53,54,55,56,57,58,59,60:
                out.println("You're adult");
                break;
            default:
                out.println("Insert correct years quantity ");
        }
    }
}
