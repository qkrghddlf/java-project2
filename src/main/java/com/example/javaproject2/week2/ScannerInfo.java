package com.example.javaproject2.week2;

import java.util.Scanner;

public class ScannerInfo {
    static void ScannerInfo() {
        Scanner sc = new Scanner(System.in);
        System.out.println("두개의 숫자를 입력하세요.");
        System.out.println("첫번째 숫자는" + sc.nextInt() + "입니다");
        System.out.println("두번째 숫자는" + sc.nextInt() + "입니다");

    }
}
