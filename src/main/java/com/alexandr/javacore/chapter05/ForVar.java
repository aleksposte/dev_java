package com.alexandr.javacore.chapter05;

// Отдельные части оператора for могут отсутствовать
public class ForVar {
    public static void main(String[] args) {
        int i;
        boolean done = false;

        i = 0;
        for ( ; !done; ) {
            System.out.println(" i = " + i);
            if (i == 10)
                done = true;
            i++;
        }
    }
}
