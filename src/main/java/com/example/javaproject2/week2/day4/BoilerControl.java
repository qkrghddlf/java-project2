package com.example.javaproject2.week2.day4;

public class BoilerControl {
    public static void main(String[] args) {
        int waterTemp = 45;
        int roomTemp = 22;

        boolean check = waterTemp < 50 && roomTemp < 25;
        System.out.println(check);
    }
}
