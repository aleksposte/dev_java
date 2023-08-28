package com.alexandr.javacore.chapter08;

abstract class A {
    abstract void callme();

    // также могут содержать и конкретные (не абстрактые методы)
    void callmetoo() {
        System.out.println("конкретный метод");
    }
}

class B extends A {
    void callme() {
        System.out.println(" реализация метода callme() из класса В");
    }
}

public class AЬstractDemo {
    public static void main(String[] args) {
        B b = new B();

        b.callme();
        b.callmetoo();
    }
}
