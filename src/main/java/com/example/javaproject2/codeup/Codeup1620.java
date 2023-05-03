package com.example.javaproject2.codeup;

import java.util.Scanner;

public class Codeup1620 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int input = sc.nextInt();
        int ans1 = 0;
        int n = 11;
        while (n > 10) {

            while (input > 0) {
                ans1 += input % 10;
                input /= 10;
            }
            input = ans1;
            n = input;
        }
        System.out.println(ans1);
    }
}
