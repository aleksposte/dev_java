package com.alexandr.javacore.chapter18;

import java.util.Comparator;
import java.util.TreeSet;

class MyComp implements Comparator<String> {

    @Override
    public int compare(String a, String b) {
        String aStr, bStr;
        aStr = a;
        bStr = b;

        return bStr.compareTo(aStr);
    }
}

public class CompDemo {
    public static void main(String[] args) {
        TreeSet<String> ts = new TreeSet<String>(new MyComp());

        ts.add("C");
        ts.add("A");
        ts.add("B");
        ts.add("E");
        ts.add("F");
        ts.add("D");

        for (String el : ts)
            System.out.print(el + " ");
        System.out.println();
    }
}
