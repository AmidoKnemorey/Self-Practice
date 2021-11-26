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
        out.print(Dec2result);
    }
}
