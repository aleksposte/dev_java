package com.alexandr.javacore.chapter03;

// продемонстрировать срок действия переменной
public class LifeTime {
    public static void main(String[] args) {
        int x;

        for (x = 0; x < 3; x++) {
            int y = -1; // инициализируется при каждом вхождении в блок кода

            System.out.println("у равно: " + y); // всегда будет значение -1

            y = 100;
            System.out.println("н теперь равен: " + y);
        }
    }
}

