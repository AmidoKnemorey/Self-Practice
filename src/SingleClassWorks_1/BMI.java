package SingleClassWorks_1;

import java.text.DecimalFormat;
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
        float temporary = weight / (temporaryHeight * temporaryHeight);
        // first way to short the float value
        DecimalFormat decimalFormat = new DecimalFormat("#.##");
        String yourBMI = decimalFormat.format(temporary);
        System.out.println("Your BMI value is "+yourBMI);
        //Second simple way below
        //System.out.printf("Your BMI value is "+"%.2f",yourBMI);
    }
}