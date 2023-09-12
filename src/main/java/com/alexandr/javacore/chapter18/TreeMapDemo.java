package com.alexandr.javacore.chapter18;

import java.util.Map;
import java.util.Set;
import java.util.TreeMap;

public class TreeMapDemo {
    public static void main(String[] args) {
        TreeMap<String, Double> tm = new TreeMap<String, Double>();

        tm.put("John Doe", 3434.34);
        tm.put("Tom Schmidt", 123.23);
        tm.put("John Doe J", 34.4);
        tm.put("Tom Schmidt P", 3.3);

        Set<Map.Entry<String, Double>> set = tm.entrySet();

        for (Map.Entry<String, Double> me : set) {
            System.out.println(me.getKey() + ": " + me.getValue());
        }

        // add balance
        double balance = tm.get("John Doe");
        tm.put("John Doe", balance + 1000);
        System.out.println("New balance John Doe: " + tm.get("John Doe"));
    }
}
