package com.example.javaproject2.week3.day2;

import java.util.Scanner;

public class Factorial {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int answer = 1;

        for (int i = n; i >= 1 ; i--) {
            answer *= i;
        }

        System.out.println(answer);
    }
}
