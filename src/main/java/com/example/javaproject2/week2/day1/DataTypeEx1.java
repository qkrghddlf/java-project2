package com.example.javaproject2.week2.day1;

public class DataTypeEx1 {
    public static void main(String[] args) {
        String val1 = "1.5";
        String val2 = "2.5";
        System.out.println(val1 + val2);

        float result = Float.parseFloat(val1) + Float.parseFloat(val2);
        System.out.println(result);

        String val3 = "1.11111111";
        String val4 = "2.11111111";

        float result1 = Float.parseFloat(val3) + Float.parseFloat(val4);
        System.out.println(result1);

        double result2 = Double.parseDouble(val3) + Double.parseDouble(val4);
        System.out.println(result2);
    }
}
