package com.example.javaproject2.codeup;

import java.util.Scanner;

public class Codeup1020 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String KId = sc.next();
        String date = KId.substring(0, 6);
        String code = KId.substring(7);
        System.out.printf("%s%s", date, code);
    }
}
