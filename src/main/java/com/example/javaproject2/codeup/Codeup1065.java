package com.example.javaproject2.codeup;

import java.util.Scanner;

public class Codeup1065 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int aInput = sc.nextInt();
        int bInput = sc.nextInt();
        int cInput = sc.nextInt();
        if (aInput % 2 == 0) {
            System.out.println(aInput);
        }
        if (bInput % 2 == 0) {
            System.out.println(bInput);
        }
        if (cInput % 2 == 0) {
            System.out.println(cInput);
        }
    }
}
