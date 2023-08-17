package com.alexandr.javacore.chapter02;

    public class ForTest {
    public static void main(String[] args) {
        int x;

        // for (x = 0; x < 10; x = x + 1) // не удобная запись, в современном виде используется операция инкремента
        for (x = 0; x < 10; x++)
            System.out.println("Значение x: " + x);
    }
}
