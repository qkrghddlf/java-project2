package com.example.javaproject2.week2.day5;

import java.util.Scanner;

public class BCompanyHRSystem {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int yEXP = sc.nextInt();
        int nProj = sc.nextInt();

        if (yEXP > 5 || nProj > 10) {
            System.out.printf("팀장 승진 대상\n");
        } else {
            System.out.printf("대상이 아님\n");
        }
    }
}
