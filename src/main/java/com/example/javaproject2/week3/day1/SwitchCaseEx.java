package com.example.javaproject2.week3.day1;

public class SwitchCaseEx {
    public static void main(String[] args) {
        int month = 11;
        switch (month) {
            case 12, 1, 2 -> System.out.printf("겨울\n");
            case 3, 4, 5 -> System.out.printf("봄\n");
            case 6, 7, 8 -> System.out.printf("여름\n");
            case 9, 10, 11 -> System.out.printf("가을\n");

        }
    }
}
