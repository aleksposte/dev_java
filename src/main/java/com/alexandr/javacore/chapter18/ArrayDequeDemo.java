package com.alexandr.javacore.chapter18;

import java.util.*;

public class ArrayDequeDemo {
    public static void main(String[] args) {
        ArrayDeque<String> adq = new ArrayDeque<String>();

        adq.push("A");
        adq.push("B");
        adq.push("D");
        adq.push("E");
        adq.push("F");

        System.out.println("get el from stack: ");

        while (adq.peek() != null)
            System.out.print(adq.pop() + " ");
        System.out.println();
    }
}
