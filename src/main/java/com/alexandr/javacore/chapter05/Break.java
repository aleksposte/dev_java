package com.alexandr.javacore.chapter05;
// break -> go to
public class Break {
    public static void main(String[] args) {
        boolean t = true;

        first: {
            second: {
                third: {
                    System.out.println("предшествует break");
                    if (t) break second;
                        System.out.println("этот оператор не будет выполняться");
                }
                System.out.println("этот оператор не будет выполняться");
            }
            System.out.println("этот оператор идет за second");
        }
    }
}
