package com.example.javaproject2.codeup;

import java.util.Scanner;

public class Codeup1085 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        long h, b, c, s;
        h = sc.nextInt();
        b = sc.nextInt();
        c = sc.nextInt();
        s = sc.nextInt();
        long bit = h * b * c * s;
        float result = bit / 1024.0f / 1024.0f / 8.0f;

        System.out.printf("%.1f MB\n", result);
    }
}
