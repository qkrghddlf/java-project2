package com.example.javaproject2.codeup;

import java.util.Scanner;

public class Codeup1083 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        for (int i = 1; i <= sc.nextInt(); i++) {
            if (i % 3 == 0) {
                System.out.printf("X ");
            } else {
                System.out.printf("%d ", i);
            }
        }
    }
}
