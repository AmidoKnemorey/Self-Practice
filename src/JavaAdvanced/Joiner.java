package JavaAdvanced;

import java.util.Arrays;
import java.util.Iterator;

public class Joiner <T> {

    String separator;

    public Joiner (String separator) {
        this.separator = separator;
    }

    @SafeVarargs
    public final String join(T... t) {
        StringBuilder exit = new StringBuilder();
        Iterator<T> iterator = Arrays.stream(t).iterator();
        while (iterator.hasNext()) {
            exit.append(iterator.next().toString().concat(iterator.hasNext() ? separator : ""));
        } return exit.toString();
    }
}