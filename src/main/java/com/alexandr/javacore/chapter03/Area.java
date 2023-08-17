package com.alexandr.javacore.chapter03;

public class Area {
    public static void main(String[] args) {
        double pi, r, a;

        // радиус окружности
        r = 10.8;
        pi = 3.1416;
        // вычисление площади круга
        a = pi * r  * r;
        System.out.println("Площадь круга равна: " + a);
    }
}
