package SingleClassWorks_2;

import java.util.*;

public class FindingAnagrams {
    //this program finds anagrams in already defined list or by a console if you want
    //if you entered anagram - it will add like a value of key\anagram.
    //So below first way with already defined list.

    public static void main(String[] args) {

        HashMap<String, List<String>> mainHashMap = new HashMap<String, List<String>>();

        List<String> mainList = new ArrayList<>();
        mainList.add("ABCD");
        mainList.add("EFGH");
        mainList.add("HGEF");
        mainList.add("JHIU");
        mainList.add("EFHG");
        mainList.add("EFHG");
        mainList.add("fegh");


        String temporary = "";

            boolean indicator = true;

            for (String currentString : mainList) {
                char[] tmp1 = currentString.toLowerCase(Locale.ROOT).toCharArray();
                Arrays.sort(tmp1);

                if (!mainHashMap.isEmpty()) {
                    for (String s : mainHashMap.keySet()) {
                        char[] tmp2 = s.toLowerCase(Locale.ROOT).toCharArray();
                        Arrays.sort(tmp2);
                        if (Arrays.equals(tmp1, tmp2)) {
                            List<String> temporaryList = new ArrayList<>(mainHashMap.get(s));
                            temporaryList.add(currentString);
                            mainHashMap.put(s, temporaryList);
                            indicator = false;
                            break;
                        } else {
                            temporary = currentString;
                            indicator = true;
                        }
                    }
                } else { temporary = currentString; }


                if (indicator) {
                    List<String> blabla = new ArrayList<>();
                    blabla.add(temporary);
                    mainHashMap.put(temporary, blabla);
                }
        }
            System.out.println(mainHashMap);
    }
}

//    and below is another way through console

//    public static void main(String[] args) {
//
//        Scanner scanner = new Scanner(System.in);
//
//        HashMap<String, List<String>> firstMap = new HashMap<String, List<String>>();
//
//        do {
//            System.out.println("Enter some anagram word below.");
//            String byConsole = scanner.nextLine();
//            boolean indicator = true;
//            for (String s : firstMap.keySet()) {
//                char[] tmp1 = byConsole.toLowerCase(Locale.ROOT).toCharArray(), tmp2 = s.toLowerCase(Locale.ROOT).toCharArray();
//                Arrays.sort(tmp1);
//                Arrays.sort(tmp2);
//                if (Arrays.equals(tmp1, tmp2)) {
//                    List<String> temporary = new ArrayList<>(firstMap.get(s));
//                    temporary.add(byConsole);
//                    firstMap.put(s, temporary);
//                    indicator = false;
//                    break;
//                }
//            }
//            if (indicator) {
//                firstMap.put(byConsole, new ArrayList<>());
//            }
//
//            System.out.println(firstMap);
//        } while(true);
//    }
//}