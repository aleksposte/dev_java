package com.alexandr.javacore.chapter07;
// вызов по значение
class TestCallByValue {
    void meth(int i, int j) {
        i *= 2;
        j /= 2;

        System.out.println("a & b в методе: " + i + " " + j);
    }
}

public class CallByValue {
    public static void main(String[] args) {
        TestCallByValue ob = new TestCallByValue();
        int a = 15, b = 20;

        System.out.println("a & b до вызова: " + a + " " + b);

        ob.meth(a, b);
        System.out.println("a & b после вызова: " + a + " " + b);
    }
}
