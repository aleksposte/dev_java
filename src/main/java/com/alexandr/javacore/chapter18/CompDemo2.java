package com.alexandr.javacore.chapter18;

import java.util.Comparator;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;

class CompLastNames implements Comparator<String> {

    @Override
    public int compare(String aStr, String bStr) {
        int i, j;

        i = aStr.lastIndexOf(' ');
        j = bStr.lastIndexOf(' ');

        return aStr.substring(i).compareToIgnoreCase(bStr.substring(j));
    }
}

class CompThenByFirstName implements Comparator<String> {

    @Override
    public int compare(String aStr, String bStr) {
        int i, j;

        return aStr.compareToIgnoreCase(bStr);
    }
}

public class CompDemo2 {
    public static void main(String[] args) {
        CompLastNames compLN = new CompLastNames();
        Comparator<String> compLastThenFirst = compLN.thenComparing(new CompThenByFirstName());

        TreeMap<String, Double> tm = new TreeMap<String, Double>(compLastThenFirst);

        tm.put("John Doe", 3434.34);
        tm.put("Tom Schmidt", 123.23);
        tm.put("John Doe J", 34.4);
        tm.put("Tom Schmidt P", 3.3);

        Set<Map.Entry<String, Double>> set = tm.entrySet();

        for (Map.Entry<String, Double> me : set) {
            System.out.println(me.getKey() + ": " + me.getValue());
        }

        double balance = tm.get("John Doe");
        tm.put("John Doe", balance + 1000);
        System.out.println("New balance John Doe: " + tm.get("John Doe"));
    }
}
