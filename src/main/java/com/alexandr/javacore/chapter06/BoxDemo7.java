package com.alexandr.javacore.chapter06;

// добавлен параметры в конструктор
class Box7 {
    double width;
    double height;
    double depth;

    // конструктор
    Box7(double w, double h, double d) {
        width = w;
        height = h;
        depth = d;
    }

    double volume() {
        return width * height * depth;
    }
}

public class BoxDemo7 {
    public static void main(String[] args) {
        Box7 mybox1 = new Box7(10, 20, 15);
        Box7 mybox2 = new Box7(3, 6, 9);

        System.out.println("объем равен: " + mybox1.volume());
        System.out.println("объем равен: " + mybox2.volume());
    }
}
