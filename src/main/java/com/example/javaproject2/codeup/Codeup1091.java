package com.example.javaproject2.codeup;

import java.util.Scanner;

public class Codeup1090 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int aInput = sc.nextInt();
        int bInput = sc.nextInt();
        int cInput = sc.nextInt() - 1;
        int xVal = aInput;
        for (int i = 1; i <= cInput; i++) {
            xVal *= bInput;
        }

        System.out.println(xVal);
    }
}
