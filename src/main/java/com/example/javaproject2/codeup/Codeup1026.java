package com.example.javaproject2.codeup;

import java.util.Scanner;

public class Codeup1026 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String[] time = sc.nextLine().split("[:]");
        System.out.println(Integer.parseInt(time[1]));

    }
}
