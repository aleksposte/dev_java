package com.alexandr.javacore.chapter07;
 // вызов по ссылке (объекты)
 class TestPassObjRe {
     int a, b;

     TestPassObjRe(int i, int j) {
         a = i;
         b = j;
     }

     void meth(TestPassObjRe o) {
         o.a *= 2;
         o.b /= 2;
     }
 }

public class PassObjRe {
    public static void main(String[] args) {
        TestPassObjRe ob = new TestPassObjRe(15, 20);

        System.out.println("ob.a & ob.b до вызова: " + ob.a + " " + ob.b);

        ob.meth(ob);
        System.out.println("ob.a & ob.b после вызова: " + ob.a + " " + ob.b);
    }
}
