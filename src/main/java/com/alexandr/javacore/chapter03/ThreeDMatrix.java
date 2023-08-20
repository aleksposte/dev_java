package com.alexandr.javacore.chapter03;

public class ThreeDMatrix {
    public static void main(String[] args) {
        int theeD[][][] = new int[3][4][5];
        int i, j, k;

        for (i = 0; i < 3; i++)
            for (j = 0; j < 4; j++)
                for (k = 0; k < 5; k++)
                    theeD[i][j][k] = i * j * k;

        for (i = 0; i < 3; i++) {
            for (j = 0; j < 4; j++) {
                for (k = 0; k < 5; k++)
                    System.out.print(theeD[i][j][k] + " ");
                System.out.println();
            }
            System.out.println();
        }
    }
}
