package com.alexandr.javacore.chapter03;
// нельзя объвить одинаковые переменные во внутренней и внешней области действия
public class ScopeErr {
    public static void main(String[] args) {
        int bar = 1;

        {
            int bar = 2; // будет ошибка компиляции
        }
    }
}
