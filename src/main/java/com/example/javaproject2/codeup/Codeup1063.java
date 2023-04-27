package com.example.javaproject2.codeup;

import java.util.Scanner;

public class Codeup1063 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int aInput = sc.nextInt();
        int bInput = sc.nextInt();
        System.out.printf("%d\n", aInput > bInput ? aInput : bInput );
    }
}
