package JavaAdvanced;

import com.sun.jdi.Value;

import java.util.*;
import java.util.stream.Collectors;

public class Storage {
    private final HashMap<String, String> dataBaseImitation;

    public Storage() {
        this.dataBaseImitation = new HashMap<>();
    }

    public void addToStorage(String key, String value) {
        if (this.dataBaseImitation.containsKey(key)) {
            String tmpHere = this.dataBaseImitation.get(key)+" "+value;
            this.dataBaseImitation.put(key, tmpHere);
        } else {
            this.dataBaseImitation.put(key, value);
        }
    }

    public void printValues(String key) {
        System.out.printf("\nAll the values of %s key is %s", key, dataBaseImitation.get(key));
    }

    public void findKeys(String value) {

//        System.out.println(this.dataBaseImitation.entrySet()
//                .stream().filter(elem -> elem.getValue().contains(value))
//                .map(Map.Entry::getKey)
//                .collect(Collectors.toList()));
        List<String> listWithKeys = new ArrayList<>();
        System.out.printf("\nAll the keys of your value \"%s\" are: ", value, listWithKeys);
        for (Map.Entry<String, String> currentPair : this.dataBaseImitation.entrySet()) {
            if (currentPair.getValue().equals(value)) {
                listWithKeys.add(currentPair.getKey());
            }
        }
        System.out.println(listWithKeys);
    }
}