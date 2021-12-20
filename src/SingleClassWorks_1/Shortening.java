package SingleClassWorks_1;
import java.math.BigDecimal;
import java.text.DecimalFormat;
import static java.lang.System.out;

public class Shortening {

    public static void main(String[] args) {

        BigDecimal Dec1 = new BigDecimal(Math.PI);
        out.println(Dec1);
        BigDecimal Dec2 = Dec1.add(BigDecimal.valueOf(1));
        DecimalFormat df = new DecimalFormat("#.##");
        String Dec2result = df.format(Dec2);
        out.println(Dec2result);

        System.out.println(Math.abs(-32454.34534436536));
        System.out.println(abs(-32454.34534436536));
        double d = -4.3432;
        System.out.println(d*=-1);
    }
    public static double abs(double value) {
        return Double.longBitsToDouble(
                Double.doubleToRawLongBits(value) & 0x7fffffffffffffffL);
    }

//    public static double abs(double value) {
//        if (value < 0) {
//            return -value;
//        }
//        return value;
//    }
}
