package com.example.javaproject2.codeup;

import java.util.Scanner;

public class Codeup1031 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int val1 = sc.nextInt();
        String octal = Integer.toOctalString(val1);
        System.out.println(octal);
    }
}
