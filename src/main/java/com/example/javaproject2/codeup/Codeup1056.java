package com.example.javaproject2.codeup;

import java.util.Scanner;

public class Codeup1056 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        boolean result = sc.nextInt() != sc.nextInt();
        System.out.printf("%d\n", result ? 1 : 0);

    }
}
