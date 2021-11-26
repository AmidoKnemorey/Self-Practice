package SingleClassWorks_1;

public class FullChristmasThree {
    public static void main(String[] args) {
        int QuantityOfRows = 5;
        for (int i = 1; i <= QuantityOfRows; i++) {
            for (int j = i; j < QuantityOfRows; j++) {
                System.out.print(" ");
            }
            for (int j = i; j > 1; j--) {
                int t = (int) (Math.random()*10+1);
                if (t>1) { System.out.print("*"); } else System.out.print("o");
            }
            for (int j = 1; j <= i; j++) {
                int t = (int) (Math.random()*10+1);
                if (t>1) { System.out.print("*"); } else System.out.print("o");
            }
            System.out.println();
        }
    }
}