package StudyingProcess.StreamPractice;

import org.w3c.dom.ls.LSOutput;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.math.BigInteger;
import java.security.SecureRandom;
import java.sql.Wrapper;
import java.util.*;
import java.util.function.Function;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class MethodsTesting {
    public static void main(String[] args) {

        int[] arrayOfNumbers = new int[]{89, 34, 46, 86, 90, 9, 7, 6, 74, 62, 7, 83, 91, 12, 88, 53, 72, 88, 17, 47};
        String[] randomWords = new String[]{"Quiana", "Holly", "Danica", "Nora", "Siena", "Talia", "Faith", "Nathalia", "Blessing", "Jenna", "Tahlia", "Naomi", "Urszula", "Amy", "Itzel", "Wren", "Pamela", "Cynthia", "Tayla"};
/*        // 17.2.3 rangeClosed and range testing
        System.out.printf("17.2.3%nThe sum of the numbers from 1 to 10 by rangeClosed is: %d, by range is %d%n",
                IntStream.rangeClosed(1, 10).sum(), IntStream.range(1, 10).sum());

        // 17.3 lambda testing
        System.out.printf("%n17.3%nSum of paired numbers from 1 to 20 is: %d%n",
                IntStream.rangeClosed(1, 10)
                        .map((int x) -> {
                            return x * 2;
                        })
                        .sum());

        // 17.3.3 distinct testing
        List<Integer> afterDistinct = new ArrayList<>(arrayOfNumbers.length);
        Arrays.stream(arrayOfNumbers).distinct().forEach(afterDistinct::add);
        System.out.println("\nAfter distinct method\n" + afterDistinct);

        // 17.3.3 limit testing
        List<Integer> afterLimitMethod = new ArrayList<>(arrayOfNumbers.length);
        Arrays.stream(arrayOfNumbers).limit(7).forEach(afterLimitMethod::add);
        System.out.println("\nafter limit method\n" + afterLimitMethod);

        // 17.3.3 map testing
        List<Integer> afterMapMethod = new ArrayList<>(arrayOfNumbers.length);
        Arrays.stream(arrayOfNumbers)
                .map((int i) -> { return (int) Math.pow(i, 2); })
                .forEach(afterMapMethod::add);
        System.out.println("\nafter map method\n" + afterMapMethod);


        //17.3.3 sorted testing
        List<String> afterSortMethod = new ArrayList<>(randomWords.length);
        Arrays.stream(randomWords).sorted().forEach(afterSortMethod::add);
        System.out.println("\nafter sort method\n" + afterSortMethod);

        //17.3.3 reduce testing
        String afterReducing = Arrays.stream(randomWords).reduce("", (accumulator, value) -> accumulator + value.toUpperCase());
        System.out.printf("%n%nafter reduce method%n" + afterReducing);


        // 17.5 Step by step stream working
        System.out.println("\n\nStep by step stream working below:\n");
            IntStream.rangeClosed(1, 10)
                    .filter(
                            x -> {
                                System.out.println("filter is working on element: "+x);
                                return x % 2 == 0;
                            })
                    .map(
                            x -> {
                                System.out.println("map is working on element: " + x);
                                        return x * 3;
                            })
                    .sum();

            // 17.6
        SecureRandom secureRandom = new SecureRandom();
        String numbers = secureRandom
                        .ints(10,1,10)
                        .mapToObj(String::valueOf)
                        .collect(Collectors.joining(" "));
        System.out.printf("%nRandom numbers included in one line:%n%s", numbers);

        //17.7 testing IntStream methods
        System.out.println("Original array: "+
                IntStream.of(arrayOfNumbers)
                        .mapToObj(String::valueOf)
                        .collect(Collectors.joining(" ")));

        System.out.printf("%nAmount of values in original array by 'count()' method is: "+
                IntStream.of(arrayOfNumbers).count());

        System.out.printf("%nMinimum value of original array by 'min.getAsInt()' method is: "+
                IntStream.of(arrayOfNumbers).min().orElseThrow(NoSuchElementException::new));


        System.out.printf("%nMaximum value of original array by 'max.getAsInt()' method is: "+
                IntStream.of(arrayOfNumbers).max().getAsInt());

        System.out.printf("%nSum of values of original array by 'sum()' method is: "+
                IntStream.of(arrayOfNumbers).sum());

        System.out.printf("%nThe arithmetic mean of original array by 'average().getAsDouble()' method is: %.3f",
                IntStream.of(arrayOfNumbers).average().getAsDouble());

        System.out.printf("%nSum of values of original array by 'reduce()' method is: %d",
                IntStream.of(arrayOfNumbers).reduce(0, (a, b) ->  a + b));

        System.out.printf("%nProduct of all numbers from array is: %d",
                IntStream.of(arrayOfNumbers).reduce((a, b) -> a * b).getAsInt());

        System.out.printf("%nSum of the square of all numbers in array is: %d",
                IntStream.of(arrayOfNumbers).map((x) -> (x * x)).sum());

        System.out.printf("%nAll values after sorting: %s",
                IntStream.of(arrayOfNumbers)
                        .sorted()
                        .mapToObj(String::valueOf)
                        .collect(Collectors.joining(" ")));
*/
        IntSummaryStatistics intSummaryStatistics = IntStream.of(arrayOfNumbers).summaryStatistics();
        System.out.printf("\nSummaryStatistics method below:\n%s\n",intSummaryStatistics.toString());

        System.out.printf("%s\n", IntStream.of(arrayOfNumbers)
                .mapToObj(BigInteger::valueOf)
                .reduce(BigInteger.valueOf(1), BigInteger::multiply));

        System.out.printf("\n%s", Arrays.stream(randomWords).sorted(Collections.reverseOrder()).toList());

        new Thread(()-> {System.out.println("New thread created");}).start();

        Function<Integer, Boolean> test = integer -> integer <= 10;

        System.out.println(test.apply(11));



    }
}