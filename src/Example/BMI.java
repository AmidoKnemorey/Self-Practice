package Example;

import java.util.Scanner;

public class BMI {
    public static void main(String[] args) {
        Scanner mainScanner = new Scanner(System.in);

        System.out.println("insert weight as kilograms");
        float weight = mainScanner.nextFloat();

        System.out.println("insert height as santimeters");
        int height = mainScanner.nextInt();


        whatTheBMI(weight, height);
    }




    public static void whatTheBMI (float weight, int height) {
        float temporaryHeight1 = (float) height;
        float temporaryHeight = (temporaryHeight1 / 100);
        temporaryHeight = temporaryHeight * temporaryHeight;
        float yourBMI = weight / (temporaryHeight * temporaryHeight);
        System.out.println(yourBMI);
        //return;
    }




}
