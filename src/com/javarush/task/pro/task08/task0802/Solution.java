package com.javarush.task.pro.task08.task0802;

/* 
Утильный класс: часть 2
*/

public class Solution {

    public static double sqrt(double a) {
        return Math.sqrt(a);
    }

    public static double cbrt(double a) {
        return Math.cbrt(a);
    }

    public static double pow(double number, double power) {
        if (power == 0) {
            return 1;
        }
        double result = Math.pow(number, power);

        return power < 0 ? 1.0 / result : result;
    }
}
