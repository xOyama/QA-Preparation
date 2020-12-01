package com.telerikacademy.ConditionalStatements;

import java.util.Scanner;

public class TheBiggestOfFiveNumbers2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        double a = Double.parseDouble(sc.nextLine());
        double b = Double.parseDouble(sc.nextLine());
        double c = Double.parseDouble(sc.nextLine());
        double d = Double.parseDouble(sc.nextLine());
        double e = Double.parseDouble(sc.nextLine());

        if (a >= b && a >= c && a >= d && a >= e) {
            System.out.println(a);
        } else if (b >= a && b >= c && b >= d && b >= e) {
            System.out.println(b);
        } else if (c >= a && c >= b && c >= d && c >= e) {
            System.out.println(c);
        } else if (d >= a && d >= b && d >= c && d >= e) {
            System.out.println(d);
        }else{
            System.out.println(e);
        }



    }
}
