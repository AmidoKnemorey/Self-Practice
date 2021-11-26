package SingleClassWorks_1;

import java.util.Scanner;

public class GalToLit {     //program nie dokończony ale działa.
    public static void main(String[] args) {
        System.out.println(actionList());
        Scanner ScannerMain = new Scanner(System.in);

        switch (ScannerMain.nextByte()) {
            case 1:
                System.out.println("How many gallons do you want to convert?");
                double gallons = ScannerMain.nextDouble();
                double liters = gallons * 3.754;
                System.out.println(gallons+" gallons = "+liters+"liters.");
                    case 2:
                        System.out.println("How many liters do you want to convert?");
                        double liters2 = ScannerMain.nextDouble();
                        double gallons2 = liters2 / 3.754;
                        System.out.println(liters2+" litters = "+gallons2+"gallons.");
            default:
        }
    }

    public static String actionList () {
        return ("What do you want to convert?" +
                "Press [1] to convert gallons to liters." +
                "Press [2] to onvert liters to gallons");
    }
}


