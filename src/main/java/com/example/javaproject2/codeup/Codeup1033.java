package com.example.javaproject2.codeup;

import java.util.Scanner;

public class Codeup1033 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int val1 = sc.nextInt();
        String hexademical = Integer.toHexString(val1);
        System.out.printf("%S", hexademical);
    }
}
