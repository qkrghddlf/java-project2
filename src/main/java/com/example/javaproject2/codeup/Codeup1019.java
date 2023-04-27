package com.example.javaproject2.codeup;

import java.util.Scanner;

public class Codeup1019 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String input = sc.next();
        String[] inputArray = input.split("\\.");
        System.out.printf("%04d.%02d.%02d", Integer.parseInt(inputArray[0]), Integer.parseInt(inputArray[1]), Integer.parseInt(inputArray[2]));
    }
}
