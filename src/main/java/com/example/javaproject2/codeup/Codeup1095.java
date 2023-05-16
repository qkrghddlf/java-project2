package com.example.javaproject2.codeup;

import java.util.Scanner;

public class Codeup1094 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int[] line = new int[sc.nextInt()];
        for(int i = 0; i < line.length; i++) {
            line[line.length - 1 - i] = sc.nextInt();
        }

        for (int j = 0; j < line.length; j++) {
            System.out.printf("%d ", line[j]);
        }

    }
}
