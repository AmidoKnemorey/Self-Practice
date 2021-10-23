package Example;

import static java.lang.System.out;

public class ForLoopSDA {
    /*public static void main(String[] args) {

        for (int i = 1; i <= 10; i++) {
            out.print(String.format("%4s", i));
        }

        out.println("\n   =====================================");

        for (int i = 1; i <=10 ; i++) {
            out.print(String.format("%4s", i+ "|"));

            for (int j = 1; j <= 10 ; j++) {
                int result = i * j;
                out.print(String.format("%4s", result));
            }
            out.println();
        }
    }
}*/
    public static void main(String[] args) {

        for (int i = 0; i <= 10; i++) {
            System.out.print(String.format("%4s", i));
        }

        System.out.println("\n====================================================");
        for (int i = 1; i <= 10; i++) {
            System.out.print(String.format("%4s", i) + "|");
            for (int j = 1; j <= 10; j++) {
                int result = i * j;
                System.out.print(String.format("%4s", result));
            }
            System.out.println();
        }
    }
}



