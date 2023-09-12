package com.alexandr.javacore.chapter18;

import java.util.ArrayList;

public class ArrayListDemo {
    public static void main(String[] args) {
        ArrayList<String> al = new ArrayList<String>();
        System.out.println("al size: " + al.size());

        // add el
        al.add("C");
        al.add("A");
        al.add("E");
        al.add("B");
        al.add("D");
        al.add("F");
        al.add(1, "A2");

        System.out.println("al size after add el: " + al.size());
        System.out.println("al: " + al);

        // remove el
        al.remove("F");
        al.remove(2);

        System.out.println("al size after remove el: " + al.size());
        System.out.println("al after remove el: " + al);
    }
}
