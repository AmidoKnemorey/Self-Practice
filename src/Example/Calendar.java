package Example;

import java.time.LocalDate;
import java.util.Arrays;

import static java.lang.System.out;

public class Calendar {
    public static void main(String[] args) {

        LocalDate temporaryDay = LocalDate.now();
        int day = temporaryDay.getDayOfMonth();

        String[] weekDays = {"MO", "TU", "WD", "TH", "FR", "ST", "SU"};
        out.println(String.format("%3s", Arrays.toString(weekDays)));
        int temporary = (int) (Math.random() * 6 + 1);
        String spaces = "    ";
        for (int i = 1; i <= temporary; i++) {
            out.print(spaces);
        }
        for (int j = 1; j <= 31; j++) {
            if (j == day) {
                out.print(String.format("%4s", "[" + j + "]"));
            } else
                out.print(String.format("%4s", j + " "));
            temporary++;
            if (temporary == 7) {
                out.println();
                temporary = 0;
            }
        }
    }
}
