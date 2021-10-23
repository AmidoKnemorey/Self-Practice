package Example;
import java.util.Arrays;
import static java.lang.System.out;

public class TablicaSDA {
    public static void main(String[] args) {

        /*int[][] Array2d = {
                {1,2,3}, // 0
                {4,5,6}, // 1
                {7,8,9}  // 2
        };

        Array2d[0][2] = 100;

        for (int i = 0; i < Array2d.length; i++) {
            for (int j = 0; j < Array2d[i].length; j++) {
                out.print("["+Array2d[i][j]+"]");
            }
            out.println();
        }

        /*int [] array = {2,3,5,5,10,100};
        int i = 0;
        for (int j = 0; j < array.length; j++) {
            if (array[j]%2==0) {
                i += array[j];
            }
        }
        out.println();*/
        

        /*int[] myFirstArray = new int[5];
        myFirstArray[0] = 10;
        myFirstArray[1] = 20;
        myFirstArray[2] = 30;
        myFirstArray[3] = 40;
        myFirstArray[4] = 50;
        System.out.println(myFirstArray[4]);*/

        /*int [] array = {1,2,3,4,5,6,7};
        int length = array.length;
        for (int i = 0; i < length; i++) {
            int element = array[i];
            array[i]=element*10; //array[i] *=10; krotka wersja
        }
        for (int i = 0; i < array.length; i++) {
            System.out.println(array[i]);
        }*/

        int someArray[] = {1,2,3,4,5,6,7,8,9};

        int lastNumber = someArray.length-1;
        int temporary = someArray[lastNumber];

        someArray[lastNumber] = someArray[0];
        someArray[0] = temporary;

        out.println(Arrays.toString(someArray));


        //boolean[] myFirstBoolean = new boolean[100];
        //int firstElement = myFirstArray[0];
        //System.out.println(String.valueOf(firstElement));
        /*String[] MyFirstStringArray = new String[1000];
        System.out.println(MyFirstStringArray.length);
        String lastElement = MyFirstStringArray[999];
        System.out.println(lastElement);*/
    }
}
