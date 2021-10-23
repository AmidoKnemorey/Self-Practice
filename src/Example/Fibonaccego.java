package Example;
public class Fibonaccego {
    public static void main(String[] args) { // -> 1,1,2,3,5,8,13,21
    Fibo();
    }

   public static void Fibo () {
        int a = 1, b = 0, c = 1;
       while (c < 1000) {
           System.out.println(c = a + b);
           System.out.println(a = b + c);
           System.out.println(b = a + c);
       }
    }
}