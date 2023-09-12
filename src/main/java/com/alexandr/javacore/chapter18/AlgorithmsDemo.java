package com.alexandr.javacore.chapter18;

import java.util.*;

public class AlgorithmsDemo {
    public static void main(String[] args) {
        LinkedList<Integer> ll = new LinkedList<Integer>();
        ll.add (-8);
        ll.add (20);
        ll.add (-20);
        ll.add (8);

        // Comparator end -> start
        Comparator<Integer> r = Collections.reverseOrder() ;
        Collections.sort(ll, r);

        System.out.println("List sorted end -> start");
        for (int i : ll)
            System.out.print(i + " ");
        System.out.println();

        // shuffle
        Collections. shuffle(ll) ;

        System.out.println("List shuffle");
        for (int i : ll)
            System.out.print(i + " ");
        System.out.println();

        System.out.println("min: " + Collections.min(ll));
        System.out.println("max: " + Collections.max(ll));
    }
}
