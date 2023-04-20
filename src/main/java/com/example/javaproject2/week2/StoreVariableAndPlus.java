package com.example.javaproject2.week2;

import java.util.Scanner;

public class StoreVariableAndPlus {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int Val1 ;
        Val1 = sc.nextInt();
        int Val2 ;
        Val2 = sc.nextInt();
        System.out.printf("%d + %d = %d", Val1, Val2, Val1 + Val2);
    }
}
