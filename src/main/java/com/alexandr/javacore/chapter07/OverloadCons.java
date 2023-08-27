package com.alexandr.javacore.chapter07;

class BoxOverloadCons {
    double width;
    double height;
    double depth;

    // конструктор (все размеры)
    BoxOverloadCons(double w, double h, double d) {
        width = w;
        height = h;
        depth = d;
    }

    // конструктор (нет размеров)
    BoxOverloadCons() {
        width = -1;
        height = -1;
        depth = -1;
    }

    // конструктор (куб)
    BoxOverloadCons(double len) {
        width = height = depth = len;
    }

    double volume() {
        return width * height * depth;
    }
}

public class OverloadCons {
    public static void main(String[] args) {
        BoxOverloadCons mybox1 = new BoxOverloadCons(10, 20, 15);
        BoxOverloadCons mybox2 = new BoxOverloadCons();
        BoxOverloadCons mybox3 = new BoxOverloadCons(7);

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
    }
}
