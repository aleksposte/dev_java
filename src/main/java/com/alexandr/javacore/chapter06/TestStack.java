package com.alexandr.javacore.chapter06;

class Stack {
    int stck[] = new int[10];
    int tos;

    // инициализация вершины стека
    Stack() {
        tos = -1;
    }

    // размещение эл в стек
    void push(int item) {
        if (tos == 9) {
            System.out.println("стек заполнен");
        } else {
            stck[++tos] = item;
        }
    }

    // извлечение эл из стека
    int pop () {
        if (tos < 0) {
            System.out.println("стек не загружен");
            return 0;
        } else {
            return stck[tos--];
        }
    }
}

public class TestStack {
    public static void main(String[] args) {
        Stack mystack1 = new Stack();
        Stack mystack2 = new Stack();

        // добавляем в стек
        for (int i = 0; i < 10; i++)  mystack1.push(i);
        for (int i = 10; i < 20; i++)  mystack2.push(i);

        // извлекаем из стека
        System.out.println("содержимое mystack1: ");
        for (int i = 0; i < 10; i++)
            System.out.println(mystack1.pop());

        System.out.println("содержимое mystack2: ");
        for (int i = 0; i < 10; i++)
            System.out.println(mystack2.pop());
    }
}
