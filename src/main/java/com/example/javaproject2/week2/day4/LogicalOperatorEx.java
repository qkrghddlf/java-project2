package com.example.javaproject2.week2.day4;

public class LogicalOperatorEx {
    public static void main(String[] args) {
        int age = 25;
        boolean isStudent = false;

        if(age >= 18 && !isStudent) {
            System.out.printf("성인이며 학생이 아닙니다\n");
        }
    }
}
