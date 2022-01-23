package JavaAdvanced;

import java.util.*;
import java.util.List;
import java.util.stream.Collectors;

public class Task1 {
    public static void main(String[] args) {


        Joiner<Integer> joiner = new Joiner<>("|");

        System.out.println(joiner.join(1, 2, 3, 4, 5, 6, 7));



















//    List<String> randomNames = List.of("Quiana", "Holly", "Danica", "Nora", "Siena", "Talia", "Faith", "Nathalia", "Blessing", "Jenna", "Tahlia", "Naomi", "Urszula", "Amy", "Itzel", "Wren", "Pamela", "Cynthia", "Tayla");
//    List<String> randomNamesDifferentFirstLetters = List.of("Quiana", "holly", "Danica", "Nora", "siena", "Talia", "Faith", "nathalia", "Blessing", "jenna", "tahlia", "Naomi", "urszula", "Amy", "Itzel", "Wren", "Pamela", "cynthia", "Tayla");
//    HashMap<String, Integer> stringIntegerHashMap = new HashMap<>();
//    stringIntegerHashMap.put("Java", 18);
//    stringIntegerHashMap.put("Python", 1);
//    stringIntegerHashMap.put("PHP", 0);

//        task1(randomNames);
//        System.out.println(task2(randomNamesDifferentFirstLetters));
//        task3(stringIntegerHashMap);

//        Storage storage = new Storage();
//        storage.addToStorage("1", "firstValue");
//        storage.addToStorage("2", "firstValue");
//        storage.addToStorage("3", "firstValue");
//        storage.addToStorage("4", "firstValue");
//        storage.addToStorage("5", "otherValue");
//
//        storage.addToStorage("5", "otherValue2");
//        storage.addToStorage("1", "secondValue");
//        storage.addToStorage("1", "thirdValue");
//        storage.addToStorage("1", "firstValue");
//
//        storage.printValues("firstKey");
//        storage.findKeys("otherValue otherValue2");


//        Circle circle = new Circle(new Point2D(4.5, 6.7), new Point2D(8.8, 7.7));
//        for (Point2D point : circle.getSlicePoint()) {
//            System.out.println(point);
//        }

    }

    public static List<String> task1 (List<String> randomWords) {
        return randomWords.stream().sorted(Collections.reverseOrder()).collect(Collectors.toList());
    }

    public static List<String> task2 (List<String> randomWords) {
        return randomWords.stream().sorted(new CustomComparator().reversed()).collect(Collectors.toList());
    }

    public static void task3 (HashMap<String, Integer> hashMap) {
        Iterator<Map.Entry<String, Integer>> iterator = hashMap.entrySet().iterator();
        while (iterator.hasNext()) {
            Map.Entry<String, Integer> currentPair = iterator.next();
                System.out.printf("Key: %s, it's value is: \"%d\"%s\n", currentPair.getKey(), currentPair.getValue(),iterator.hasNext() ?  "," : ".");
        }
    }


}