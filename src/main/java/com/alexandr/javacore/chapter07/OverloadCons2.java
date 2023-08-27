package com.alexandr.javacore.chapter07;

class BoxOverloadCons2 {
    double width;
    double height;
    double depth;

    // конструктор - в качестве параметра используется объект BoxOverloadCons2!
    BoxOverloadCons2(BoxOverloadCons2 ob) {
        width = ob.width;
        height = ob.height;
        depth = ob.depth;
    }

    // конструктор (есть все размеры)
    BoxOverloadCons2(double w, double h, double d) {
        width = w;
        height = h;
        depth = d;
    }

    // конструктор (нет размеров)
    BoxOverloadCons2() {
        width = -1;
        height = -1;
        depth = -1;
    }

    // конструктор (куб)
    BoxOverloadCons2(double len) {
        width = height = depth = len;
    }

    double volume() {
        return width * height * depth;
    }
}

public class OverloadCons2 {
    public static void main(String[] args) {
        BoxOverloadCons2 mybox1 = new BoxOverloadCons2(10, 20, 15);
        BoxOverloadCons2 mybox2 = new BoxOverloadCons2();
        BoxOverloadCons2 mybox3 = new BoxOverloadCons2(7);

        // передача объекта
        BoxOverloadCons2 myclone = new BoxOverloadCons2(mybox1);

        double vol;

        // 1 объем
        vol = mybox1.volume();
        System.out.println("объем mybox1 = " + vol);

        // 2 объем
        vol = mybox2.volume();
        System.out.println("объем mybox2 = " + vol);

        // 3 объем
        vol = mybox3.volume();
        System.out.println("объем mybox3 = " + vol);

        // объем клона объекта
        vol = myclone.volume();
        System.out.println("объем myclone = " + vol);

    }
}
