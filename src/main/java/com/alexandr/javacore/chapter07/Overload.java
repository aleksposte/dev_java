package com.alexandr.javacore.chapter07;

class OverloadDemo {
    void test() {
        System.out.println("параметры отсутствуют");
    }

    void test(int a) {
        System.out.println("a: " + a);
    }

    void test(int a, int b) {
        System.out.println("a: " + a + " " + "b: " + b);
    }

    double test(double a) {
        System.out.println("double a: " + a);
        return a * a;
    }
}

public class Overload {
    public static void main(String[] args) {
        OverloadDemo ob = new OverloadDemo();
        double result;

        ob.test();
        ob.test(10);
        ob.test(10, 20);

        result = ob.test(123.25);
        System.out.println("ob.test(123.25) = " + result);
    }
}
