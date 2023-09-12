package com.alexandr.javacore.chapter18;

import java.util.*;

public class TreeSetDemo {
    public static void main(String[] args) {
        Set<String> ts = new TreeSet();

        ts.add("D");
        ts.add("E");
        ts.add("B");
        ts.add("F");
        ts.add("Z");
        ts.add("A");
        System.out.println("ts: " + ts);
    }
}
