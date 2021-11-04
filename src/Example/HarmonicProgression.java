package Example;

public class HarmonicProgression {
    public static void main(String[] args) {

        long nominator = 1;
        long denominator = 17; //change it in order to get other result if you want. Only integers.

        long resultIntegerOfFractionalNumber;
        long resultNominator = 1;
        long resultDenominator = 1;
        System.out.println(resultNominator+"/"+resultDenominator);
        for (int i = 1; i <= denominator; i++) {
            long temporaryNom1 = resultNominator * (leastCommonMultiple(resultDenominator, i) / resultDenominator);
            long temporaryNom2 = nominator * (leastCommonMultiple(resultDenominator, i) / i);
            resultNominator = temporaryNom1 + temporaryNom2;
            resultDenominator = leastCommonMultiple(resultDenominator, i);
            System.out.println(resultNominator+"/"+resultDenominator);
        }
        if ( resultNominator > resultDenominator) {
            resultIntegerOfFractionalNumber = resultNominator / resultDenominator;
            resultNominator = resultNominator % resultDenominator;
            System.out.println("-----------------");
            System.out.print(resultIntegerOfFractionalNumber+" whole parts and ");
            System.out.println(resultNominator+"/"+resultDenominator);
        }
    }

    public static long greatestCommonDivisor(long a, long b) {
                               // ищем наибольший общий делитель двух чисел
                                        // первый вариант поиска ниже:
       while ( a != b) {
           if (a > b) {
               a = a - b;
           } else b = b - a;
       } return a;
                                        // второй вариант поиска ниже:
//        long temporary;
//        while(a!=0 && b!=0)
//        {
//            a = a % b;
//            temporary = a;
//            a = b;
//            b = temporary;
//        }
//        return a+b;

    }

    public static long leastCommonMultiple(long a, long b) {

                                    // looking for least common multiple below
        //return a / greatestCommonDivisor (a, b) * b;  //<<< first variant
        return a * b / greatestCommonDivisor(a, b);     //<<< second variant
    }

}