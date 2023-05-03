package com.example.javaproject2.codeup;

import java.util.Scanner;

public class Codeup1081 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int aVal = sc.nextInt(), bVal = sc.nextInt();
        for (int i = 1; i <= aVal; i++) {
            for (int j = 1; j <= bVal; j++) {
                System.out.printf("%d %d\n", i, j);
            }
        }
    }
}
