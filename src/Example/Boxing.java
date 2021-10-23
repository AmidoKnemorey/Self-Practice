package Example;

import static java.lang.System.out;

public class Boxing {
    public static void main (String[] args) {
        int Salary = 7_000;
        Integer Salary2 = Integer.valueOf(Salary);
        Integer j = Salary2;
        short Flat = 72;
        Short Flat2 = Short.valueOf(Flat);
        byte Vacation = (byte) 175;
        Byte Vacation2 = Byte.valueOf(Vacation);
        short Vac = (short) Vacation;
        Short Vac2 = Short.valueOf(Vac);
        String Wides = "123";
        int Salary3 = Integer.parseInt(Wides);

        out.println("Your salary is "+Salary+".");
        out.println("You have "+Vac+" days of vacation.");
        out.println("Wides of your flat are "+Wides+".");
        out.println(Salary3);
    }
}
