package com.alexandr.javacore.chapter07;

class OverloadDemo2 {
    void test() {
        System.out.println("параметры отсутствуют");
    }

    void test(int a, int b) {
        System.out.println("a: " + a + " " + "b: " + b);
    }

    // автоматическое преобразование
    void test(double a) {
        System.out.println("внутренне преобразование test(double a): " + a);
    }
}

public class Overload2 {
    public static void main(String[] args) {
        OverloadDemo2 ob = new OverloadDemo2();
        int i = 88;

        ob.test();
        ob.test(10, 20);

        ob.test(i); // int -> double
        ob.test(123.2); // double
    }
}
