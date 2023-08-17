package com.alexandr.javacore.chapter03;

public class Light {
    public static void main(String[] args) {
        int lightspeed;
        long days;
        long seconds;
        long distance;

        // скорость света
        lightspeed = 186000;

        // количество дней
        days = 1000;

        // перобразование дней в секунды
        seconds = days * 24 * 60 * 60;

        // вычисление расстояния
        distance = lightspeed * seconds;

        System.out.println("За " + days + " дней свет пройдет примерно " + distance + " миль");
    }
}
