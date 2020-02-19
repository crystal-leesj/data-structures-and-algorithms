package code401challenges.RepeatedWord;

import java.util.*;

public class RepeatedWord {

    public static String getFirstRepeatedWord(String inputString) {

        String toLowercase = inputString.toLowerCase();
        String removedPunctuation = toLowercase.replace(",", "").replace(".", "");
        String[] splitted = removedPunctuation.split(" ");

        Map<String, Integer> table = new Hashtable<>();

        String result = "";
        for (String s : splitted) {
            System.out.println("splitted[i] = " + s);
            if (!table.containsKey(s)) {
                table.put(s, 1);
            } else {
                result = s;
                break;
            }
        }
        return result;
    }

    public static String getMostRepeatedWord(String inputString) {

        String toLowercase = inputString.toLowerCase();
        String removedPunctuation = toLowercase.replace(",", "").replace(".", "");
        String[] splitted = removedPunctuation.split(" ");

        Map<String, Integer> table = new Hashtable<>();

        for (String s : splitted) {
//            System.out.println("splitted[i] = " + s);
            if (!table.containsKey(s)) {
                table.put(s, 1);
            } else {
                table.put(s, table.get(s) + 1);
            }
        }

        // print new mapping using forEcah()
        table.forEach((k, v) -> System.out.println("Key : " + k + ", Value : " + v));


        // RESOURCE :: https://stackoverflow.com/questions/10005053/key-for-maximum-value-in-hashtable
        ArrayList<String> maxKeys= new ArrayList<String>();
        Integer maxValue = Integer.MIN_VALUE;
        for (Map.Entry<String, Integer> entry : table.entrySet()) {
            if (entry.getValue() > maxValue) {
                maxKeys.clear(); /* New max remove all current keys */
                maxKeys.add(entry.getKey());
                maxValue = entry.getValue();
            }
            // when there is more than 1 key for the max value
            else if(entry.getValue() == maxValue)
            {
                maxKeys.add(entry.getKey());
            }
        }

        String result;
        if (maxKeys.size() == 1) {
            result = maxKeys.get(0);
        } else {
            result = maxKeys.get(maxKeys.size()-1);
        }

        return result;
    }
}
