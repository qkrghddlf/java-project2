package com.example.javaproject2.week4.day1;

public class makeStar {
    public static void main(String[] args) {
        for (int i = 0; i < 5; i++) {
            "*".repeat(i);
            System.out.printf("*".repeat(i));
            System.out.printf("\n");
        }
    }
}
