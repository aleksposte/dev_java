package com.alexandr.javacore.chapter07;

class TestAccessTest {
    int a; // default
    public int b; // public
    private int c; // private

    // set и get для приватного члена класса c
    void setc(int i) {
        c = i;
    }

    int getc() {
        return c;
    }
}

public class AccessTest {
    public static void main(String[] args) {
        TestAccessTest ob = new TestAccessTest();

        ob.a = 10;
        ob.b = 10;

        // ob.c = 100; // нет доступа

        ob.setc(100); // ok

        System.out.println(" a, b, c: " + ob.a + " " + ob.b + " " + ob.getc());
    }
}
