package Example;
import static java.lang.System.out;

public class DoubleArrays {
    public static void main(String[] args) {
        int[][] MultiTable = new int [10] [10];

        for (int i = 1; i <= 10; i++) {
            for (int j = 1; j <= 10 ; j++) {
                int temporary = i * j;
                MultiTable [i-1][j-1] = temporary;
            }
        }
        for (int i = 0; i <= MultiTable.length-1 ; i++) {
            for (int j = 0; j < MultiTable[i].length; j++) {
                out.print(String.format("%4s",MultiTable[i][j]));
            }
            out.println();
        }
    }
}