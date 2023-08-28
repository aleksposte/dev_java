package com.alexandr.javacore.chapter08;

class Box {
    private double width;
    private double height;
    private double depth;

    // клон объекта
    Box(Box ob) {
        width = ob.width;
        height = ob.height;
        depth = ob.depth;
    }

    // конструктор при указании всех размеров
    Box(double w, double h, double d) {
        width = w;
        height = h;
        depth = d;
    }

    // конструктор без размеров
    Box() {
        width = -1;
        height = -1;
        depth = -1;
    }

    // конструктор куб
    Box(double len) {
        width = height = depth = len;
    }

    double volume() {
        return width * height * depth;
    }

}

// расширение класса Box, добавлен вес
class BoxWeight extends Box {
    double weight;

    // сконструировать клон объекта
    BoxWeight(BoxWeight ob) {
        super(ob);
        weight = ob.weight;
    }

    BoxWeight(double w, double h, double d, double m) {
//        width = w;
//        height = h;
//        depth = d;
        super (w, h, d) ; // вызов конструктора родителя
        weight = m;
    }

    // конструктор без размеров
    BoxWeight() {
        super();
        weight = -1;
    }

    // конструктор куб
    BoxWeight(double len, double m) {
        super(len);
        weight = m;
    }
}

public class DemoBoxWeight {
    public static void main(String[] args) {
        BoxWeight mybox1 = new BoxWeight(10, 20, 15, 34.3);
        BoxWeight mybox2 = new BoxWeight(2, 3, 4, 0.076);
        BoxWeight mybox3 = new BoxWeight();
        BoxWeight mycube = new BoxWeight(3, 2);
        BoxWeight myclone = new BoxWeight(mybox1);
        double vol;

        vol = mybox1.volume();
        System.out.println("объем mybox1 = " + vol);
        System.out.println("вес mybox1 = " + mybox1.weight);
        System.out.println();

        vol = mybox2.volume();
        System.out.println("объем mybox2 = " + vol);
        System.out.println("вес mybox2 = " + mybox2.weight);
        System.out.println();

        vol = mybox3.volume();
        System.out.println("объем mybox3 = " + vol);
        System.out.println("вес mybox3 = " + mybox3.weight);
        System.out.println();

        vol = myclone.volume();
        System.out.println("объем myclone = " + vol);
        System.out.println("вес myclone = " + myclone.weight);
        System.out.println();

        vol = mycube.volume();
        System.out.println("объем mycube = " + vol);
        System.out.println("вес mycube = " + mycube.weight);
        System.out.println();
    }
}
