package com.example.javaproject2.week2.day5;

public class IfComparisonOperation {
    public static void main(String[] args) {
        int age = 25;
        boolean isAdult = age > 18;
        if (isAdult) {
            System.out.printf("성인입니다\n");
        }
        if (age <= 18) {
            System.out.printf("성인이 아닙니다\n");
        }
    }
}
