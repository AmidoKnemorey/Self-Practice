package SingleClassWorks_1;

import static java.lang.System.out;

public class Boxing {

    //Here I first got meet with type conversion.

    public static void main (String[] args) {
        int value = 7_000; // -2147483648 / 2147483647
        Integer valueAfterConversion = Integer.valueOf(value);

        short value2 = 72; // -32768 / 32767
        Short value2AfterConversion = Short.valueOf(value2);

        byte value3 = (byte) 127; // -128 / 127
        Byte value3AfterConversion = Byte.valueOf(value3);

        short value4 = (short) 170; // -32768 / 32767
        Short value4AfterConversion = Short.valueOf(value4);

        String value5 = "123"; // only symbols
        int value5AfterConversion = Integer.parseInt(value5);

        out.println(valueAfterConversion);
        out.println(value2AfterConversion);
        out.println(value3AfterConversion);
        out.println(value4AfterConversion);
        out.println(value5AfterConversion);
    }
}
