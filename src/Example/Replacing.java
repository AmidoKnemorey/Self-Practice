package Example;
import javax.crypto.spec.PSource;

public class Replacing {

    public static void main(String[] args) { // zamiana piewszego na ostatni index

        int [] someArray = {0,1,2,3,4,5,6,7,8,9};
        int [] someArray2 = {10,20,30,40,50,60,70};
        int [] someArray3 = {100,200,300,400,500};

        ChangingFistLastElements(someArray);
        System.out.println(java.util.Arrays.toString(someArray));

        ChangingFistLastElements(someArray2);
        System.out.println(java.util.Arrays.toString(someArray2));

        ChangingFistLastElements(someArray3);
        System.out.println(java.util.Arrays.toString(someArray3));

    }

    static int[] ChangingFistLastElements(int[] array) {

        int valueFromLastNumber = array.length - 1;
        int helper = array[valueFromLastNumber];
        array[valueFromLastNumber] = array[0];
        array[0] = helper;
        return array;

    }
}
