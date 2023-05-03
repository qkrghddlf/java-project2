package com.example.javaproject2.codeup;

import java.util.Scanner;

public class Codeup1071 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int input = sc.nextInt();
        for(int i = input; i != 0;) {
            System.out.printf("%d\n", i);
            i = sc.nextInt();
        }
    }
}
