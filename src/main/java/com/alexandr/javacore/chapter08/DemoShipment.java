package com.alexandr.javacore.chapter08;


class BoxDemoShipment {
    private double width;
    private double height;
    private double depth;

    // клон объекта
    BoxDemoShipment(BoxDemoShipment ob) {
        width = ob.width;
        height = ob.height;
        depth = ob.depth;
    }

    // конструктор при указании всех размеров
    BoxDemoShipment(double w, double h, double d) {
        width = w;
        height = h;
        depth = d;
    }

    // конструктор без размеров
    BoxDemoShipment() {
        width = -1;
        height = -1;
        depth = -1;
    }

    // конструктор куб
    BoxDemoShipment(double len) {
        width = height = depth = len;
    }

    double volume() {
        return width * height * depth;
    }

}

// расширение класса BoxDemoShipment, добавлен вес
class BoxDemoShipmentWeight extends BoxDemoShipment {
    double weight;

    // сконструировать клон объекта
    BoxDemoShipmentWeight(BoxDemoShipmentWeight ob) {
        super(ob);
        weight = ob.weight;
    }

    BoxDemoShipmentWeight(double w, double h, double d, double m) {
        super (w, h, d) ; // вызов конструктора родителя
        weight = m;
    }

    // конструктор без размеров
    BoxDemoShipmentWeight() {
        super();
        weight = -1;
    }

    // конструктор куб
    BoxDemoShipmentWeight(double len, double m) {
        super(len);
        weight = m;
    }
}

// поле стоимости доставки
class Shipment extends BoxDemoShipmentWeight {
    double cost;

    Shipment(Shipment ob) {
        super(ob);
        cost = ob.cost;
    }

    Shipment(double w, double h, double d, double m, double c) {
        super (w, h, d, m) ; // вызов конструктора родителя
        cost = c;
    }

    // конструктор без размеров
    Shipment() {
        super();
        cost = -1;
    }

    // конструктор куб
    Shipment(double len, double m, double c) {
        super(len, m);
        cost = c;
    }
}

public class DemoShipment {
    public static void main(String[] args) {
        Shipment shipment1 = new Shipment(10, 20, 15, 10, 3.14);
        Shipment shipment2 = new Shipment(2, 3, 4, 0.76, 1.28);
        double vol;

        vol = shipment1.volume();
        System.out.println("объем shipment1 = " + vol);
        System.out.println("вес shipment1 = " + shipment1.weight);
        System.out.println("стоимость доставки $ = " + shipment1.cost);
        System.out.println();

        vol = shipment2.volume();
        System.out.println("объем shipment2 = " + vol);
        System.out.println("вес shipment2 = " + shipment2.weight);
        System.out.println("стоимость доставки $ = " + shipment2.cost);
        System.out.println();
    }
}
