package Example;

public class Array3 {
    public static void main(String[] args) {

                int[] firstArray = {1,2,3,4};
                int newInt = 100;

                int[] secondArray = addToArray(firstArray, newInt);
            }


            static int[] addToArray(int[] input, int newInt){

                int inputArrayLength = input.length;
                int[] newArray = new int[inputArrayLength + 1];

                for (int i = 0; i < inputArrayLength; i++) {
                    newArray[i] = input[i];
                }

                int lastIndexOfNewArray = newArray.length - 1;
                newArray[lastIndexOfNewArray] = newInt;

                return newArray;
            }

        }