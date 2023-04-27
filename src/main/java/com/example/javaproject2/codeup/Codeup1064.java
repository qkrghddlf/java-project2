package com.example.javaproject2.codeup;

import java.util.Scanner;

public class Codeup1064 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int aInput = sc.nextInt();
        int bInput = sc.nextInt();
        int cInput = sc.nextInt();

        int result = aInput;
        result = aInput < bInput ? aInput : bInput ;
        result = result < cInput ? result : cInput ;

        System.out.println(result);
    }
}
