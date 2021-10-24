package Example;

import java.time.DayOfWeek;
import java.time.LocalDate;
import java.time.LocalTime;

import static java.lang.System.out;

public class testLocalDateTime {
    public static void main (String[] args) {
        LocalTime now1 = LocalTime.now();
        LocalDate now2 = LocalDate.now();
        DayOfWeek wd = now2.getDayOfWeek();
        int md = now2.getDayOfMonth(), mn = now2.getMonthValue(), dow = 0, hr = now1.getHour();
        // md(MonthDay) mn(MonthNumber) dow(DayOfWeek) hr(Hours) pd(PayDay)
        String m = " morning ", b = " before noon ", a = " after noon ", e = " evening ", n = " night ";
        switch (wd) {
            case MONDAY: dow = 1; break;
            case TUESDAY: dow = 2; break;
            case WEDNESDAY: dow = 3; break;
            case THURSDAY: dow = 4; break;
            case FRIDAY: dow = 5; break;
            case SATURDAY: dow = 6; break;
            case SUNDAY: dow = 7; break;
            default: throw new IllegalStateException("Unexpected value: " + wd); }

        if (dow >= 1 & dow <=5) {
            out.println("work day #"+dow+";");
        } else if (dow == 5) {
            out.println("day off;");
        } else out.println("holiday");

        switch (mn) {
            case 9,10,11: out.println("autumn;"); break;
            case 12,1,2: out.println("winter;"); break;
            case 3,4,5: out.println("spring;"); break;
            case 6,7,8: out.println("summer;"); break;
        }
        String pd = (md >=10) ? "after payment;" : "before payment";
        out.println("You're "+pd);

        switch (hr) {
            case 4,5,6,7,8: out.println("morning;"); break;
            case 9,10,11: out.println("before noon;"); break;
            case 12,13,14,15,16: out.println("afternoon;"); break;
            case 17,18,19,20,21: out.println("evening;"); break;
            case 22,23,24,1,2,3: out.println("night;"); break;
        }
    }
}
