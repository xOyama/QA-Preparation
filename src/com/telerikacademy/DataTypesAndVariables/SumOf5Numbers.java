package com.telerikacademy.DataTypesAndVariables;

import java.util.Scanner;

public class SumOf5Numbers {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double num1 = Double.parseDouble(sc.nextLine());
        double num2 = Double.parseDouble(sc.nextLine());
        double num3 = Double.parseDouble(sc.nextLine());
        double num4 = Double.parseDouble(sc.nextLine());
        double num5 = Double.parseDouble(sc.nextLine());

        double sum = num1 + num2 + num3 + num4 + num5;
        System.out.println(sum);

    }
}
