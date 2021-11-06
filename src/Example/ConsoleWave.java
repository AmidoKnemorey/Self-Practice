
package Example;

public class ConsoleWave {
    // I did it with some help. Probably I'll implement it again, using other, own way to do it.
    public static void main(String[] args) {

        int amountOfStars = 100;
        int amountOfLines = 5;
        int auxiliaryVariable = amountOfLines - 1;


        for (int i = 0; i < amountOfLines; i++) {
            for (int j = 0; j < amountOfStars; j++) {
                if (j % (amountOfLines * 2) == auxiliaryVariable) {
                    System.out.print("*");
                } else if (j % (amountOfLines * 2) == amountOfLines + i) {
                    System.out.print("*");
                } else {
                    System.out.print(" ");
                }
            }
            auxiliaryVariable--;
            System.out.println();
        }
    }
}