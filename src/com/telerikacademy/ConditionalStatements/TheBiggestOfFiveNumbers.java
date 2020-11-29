package com.telerikacademy.ConditionalStatements;

import java.util.Scanner;

public class TheBiggestOfFiveNumbers {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        double a = Double.parseDouble(sc.nextLine());
        double b = Double.parseDouble(sc.nextLine());
        double c = Double.parseDouble(sc.nextLine());
        double d = Double.parseDouble(sc.nextLine());
        double e = Double.parseDouble(sc.nextLine());

        double sum = a + b + c +d + e ;

        System.out.println(sum);



    }
}
