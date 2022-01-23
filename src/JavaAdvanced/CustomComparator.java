package JavaAdvanced;

import java.util.Comparator;

public class CustomComparator implements Comparator<String> {

    @Override
    public int compare(String o1, String o2) {
        return o2.compareToIgnoreCase(o1);
    }
}