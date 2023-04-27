package com.example.javaproject2.codeup;

import java.util.Scanner;

public class Codeup1050 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String[] tVal = sc.nextLine().split(" ");
        System.out.println(Integer.parseInt(tVal[0]) == Integer.parseInt(tVal[1]) ? 1: 0);

    }
}
