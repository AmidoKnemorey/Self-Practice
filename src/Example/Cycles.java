package Example;

import static java.lang.System.out;

public class Cycles { //House work by WorkBook (SDA)
    public static void main(String[] args) {
        for (int i = -20; i <= 20; i++) { out.print(i+" "); } out.println();
        for (int i = -20; i<= -15; i++) { out.print(i+" "); } out.println();
        for (int i = 15; i <= 20; i++) { out.print(i+" "); } out.println(); //int i = -20, count = 0;
        for ( int i = -20; i<=20; i++) { if (i % 2 == 0) { out.print(i + " "); } } out.println();
        for (int i = -20; i<=20; i++) { if (i==5) { i=5; } else out.print(i+" "); } out.println();
        for (int i = -20; i<=20; i++) { if (i==8) break; else out.print(i+" "); } out.println();
        for (int i = -20; i<=20; i++) { if (i%3==0) if (i==0){i++;} else {out.print(i+" ");} } out.println();
        int count = 0; for (short i = -20; i<=20; i++) { count = count+i; } out.println(count);
        for (int i = -20; i <=20; i++) { if (i >=4) { count = count + i;} } out.println(count);
        for (int i = 1; i <=20; i++) { out.print(i+"^2 = "+i*i+"| "); } out.println();
        for (int i = 1; i<=20; i++) { out.print(i+"%10 = "+i%10+"| "); }
    }
}
