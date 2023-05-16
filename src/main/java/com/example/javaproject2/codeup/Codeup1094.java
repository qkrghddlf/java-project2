package com.example.javaproject2.codeup;

import java.util.Scanner;

public class Codeup1093 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int time = sc.nextInt();
        int[] line = new int[23];
        for(int i = 0; i<time; i++) {
            line[sc.nextInt() - 1]++;
        }

        for (int j = 0; j < line.length; j++) {
            System.out.printf("%d ", line[j]);
        }

    }
}
