package com.example.javaproject2.weel1.Day4;

public class UserTest {
    public static void main(String[] args) {
        User hongil = new User();
        hongil.name = "박홍일";
        hongil.phoneNum = "010-1234-5678";
        hongil.age = 25;

        System.out.printf("%s 님은 성인입니까? %s\n", hongil.name, hongil.isAdult());
    }
}
