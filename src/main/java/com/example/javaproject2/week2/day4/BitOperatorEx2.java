package com.example.javaproject2.week2.day4;

public class BitOperatorEx2 {
    public static void main(String[] args) {
        int val1 = 1;

        System.out.println(val1 << 1); // val1 값을 1회 shift
        System.out.println(val1 << 2); // val1 값을 2회 shift

        int val2 = 32;
        System.out.println(val2 >> 1);
        System.out.println(val2 >> 2); // 반대방향 shift (나눗셈)
    }
}
