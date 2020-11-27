package com.telerikacademy.DataTypesAndVariables;

import java.util.Scanner;

public class QuadraticEquation {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        double a = Double.parseDouble(sc.nextLine());
        double b = Double.parseDouble(sc.nextLine());
        double c = Double.parseDouble(sc.nextLine());

        double d = Math.pow(b,2) - 4*a*c;
        //System.out.println(d);
        double x1 = ((-b - Math.sqrt(d)) / (2*a));
        double x2 = ((-b + Math.sqrt(d)) / (2*a));
        System.out.printf("x1=%s%nx2=%s",x1,x2);
    }
}
