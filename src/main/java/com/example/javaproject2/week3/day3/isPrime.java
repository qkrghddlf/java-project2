package com.example.javaproject2.week3.day3;

import java.util.Scanner;

public class isPrime {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int input = sc.nextInt();
        int isPrime = 0;
        for (int i = 1; i <= input; i++) {
            if (input % i == 0) isPrime++;
        }
        if (isPrime == 2) System.out.printf("%d 는 소수입니다.\n", input);
        else System.out.printf("%d 는 소수가 아닙니다.\n", input);
    }
}
