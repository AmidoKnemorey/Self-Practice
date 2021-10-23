package Example;

public class MetodaSDA {
//    public static void main(String[] args) {
//
//
//        int iWillBeMultiplyedByTwo = 25;
//        int res = multiplyByTwo(iWillBeMultiplyedByTwo);
//        System.out.println(res);
//    }
//
//    //2 -> 4
//    //6 -> 12
//    static int multiplyByTwo(int input) {
//        int result = input *2;
//        return result;
//    }
public static void main(String[] args) {
    int n = 5;
    for (int i = 1; i <= n; i++) {
        for (int j = i; j < n; j++) {
            System.out.print(" ");
        }
        for (int j = i; j > 1; j--) {
            System.out.print(j);
        }
        for (int j = 1; j <= i; j++) {
            System.out.print(j);
        }
        System.out.println();
    }
}



}
