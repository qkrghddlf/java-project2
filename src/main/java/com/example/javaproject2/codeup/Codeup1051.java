package com.example.javaproject2.codeup;

import java.util.Scanner;

public class Codeup1051 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String[] tVal = sc.nextLine().split(" ");
        System.out.println(Integer.parseInt(tVal[1]) >= Integer.parseInt(tVal[0]) ? 1: 0);

    }
}
