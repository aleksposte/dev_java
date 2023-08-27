package com.alexandr.javacore.chapter07;

class TestRetOb {
    int a;

    TestRetOb(int i) {
        a = i;
    }

    TestRetOb incrByTen() {
        TestRetOb temp = new TestRetOb(a + 10);
        return temp;
    }
}

public class RetOb {
    public static void main(String[] args) {
        TestRetOb ob1 = new TestRetOb(2);
        TestRetOb ob2;

        ob2 = ob1.incrByTen();
        System.out.println("ob1.a: " + ob1.a);
        System.out.println("ob2.a: " + ob2.a);

        ob2 = ob2.incrByTen();
        System.out.println("ob2.a после второго увеличения +10: " + ob2.a);
    }
}
