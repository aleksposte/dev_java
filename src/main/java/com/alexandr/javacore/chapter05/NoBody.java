package com.alexandr.javacore.chapter05;

// целевая часть тела цикла может быть пустой
public class NoBody {
    public static void main(String[] args) {
        int i, j;
        i = 100;
        j = 200;

        // расчет среднего значения
        while (++i < --j);
        System.out.println("Среднее значение равно " + i);
    }
}
