package com.example.javaproject2.week4.day1;

public class PyramidStar {
    public static void main(String[] args) {
        int height = 5;
        for (int i = 0; i < height; i++) {
            for (int j = 0; j < height - i - 1; j++) {
                System.out.printf(" ");
            }
            for (int j = 0; j <= i; j++) {
                System.out.printf("*");
            }
            System.out.printf("\n");
        }

    }
}
