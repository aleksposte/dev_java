package com.alexandr.javacore.chapter05;
import java.io.IOException;

public class Menu {
    public static void main(String[] args) {
        char choice;
        try {
            do {
                System.out.println("справка по оператору:");
                System.out.println("1. if");
                System.out.println("2. switch");
                System.out.println("3. while");
                System.out.println("4. do-while");
                System.out.println("5. for \n");
                System.out.println("выберите нужный пункт");
                choice = (char) System.in.read();
            } while ( choice < '1' || choice > '5');
            System.out.println("\n");

            switch (choice) {
                case '1':
                    System.out.println("if:\n");
                    System.out.println("if(ycлoвиe) оператор;");
                    System.out.println("else оператор;");
                    break;
                case '2':
                    System.out.println("switch:\n");
                    System.out.println("switch(выpaжeниe) {");
                    System.out.println(" саsе константа:");
                    System.out.println(" последовательность операторов");
                    System.out.println(" break;");
                    System.out.println(" //...");
                    System.out.println("}");
                    break;
                case '3':
                    System.out.println("while :\n");
                    System.out.println("while(ycлoвиe) оператор;");
                    break;
                case '4':
                    System.out.println("do-while:\n");
                    System.out.println("do {");
                    System.out.println(" оператор;");
                    System.out.println("} while (условие);");
                    break;
                case '5':
                    System.out.println("for:\n");
                    System.out.println("for (инициaлиэaция; условие; итерация)");
                    System.out.println(" оператор");
                    break;
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
