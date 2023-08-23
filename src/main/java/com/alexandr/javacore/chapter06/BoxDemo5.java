package com.alexandr.javacore.chapter06;

// добавлен сеттер
class Box5 {
    double width;
    double height;
    double depth;

    double volume() {
        return width * height * depth;
    }

    void setDim(double w, double h, double d) {
        width = w;
        height = h;
        depth = d;
    }
}

public class BoxDemo5 {
    public static void main(String[] args) {
        Box5 mybox1 = new Box5();
        Box5 mybox2 = new Box5();

        mybox1.width = 10;
        mybox1.height = 20;
        mybox1.depth = 15;

        mybox2.width = 3;
        mybox2.height = 6;
        mybox2.depth = 9;

        System.out.println("объем равен: " + mybox1.volume());
        System.out.println("объем равен: " + mybox2.volume());
    }
}
