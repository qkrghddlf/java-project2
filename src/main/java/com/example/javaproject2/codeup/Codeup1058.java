package com.example.javaproject2.codeup;

import java.util.Scanner;

public class Codeup1058 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        boolean result1 = sc.nextInt() == 0;
        boolean result2 = sc.nextInt() == 0;
        boolean result = result1 && result2;
        System.out.printf("%d\n", result ? 1 : 0);

    }
}
