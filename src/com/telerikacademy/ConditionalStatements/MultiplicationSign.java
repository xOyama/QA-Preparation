package com.telerikacademy.ConditionalStatements;

import java.util.Scanner;

public class MultiplicationSign {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        double a = Double.parseDouble(sc.nextLine());
        double b = Double.parseDouble(sc.nextLine());
        double c = Double.parseDouble(sc.nextLine());

        //String result = "";

        if (a < 0 && b < 0 && c < 0) {
            System.out.println("-");
        } else if (a > 0 && b > 0 && c > 0) {
            System.out.println("+");
        } else if (a < 0 && b < 0 && c > 0) {
            System.out.println("+");
        } else if (a < 0 && b > 0 && c < 0) {
            System.out.println("+");
        } else if (a > 0 && b < 0 && c < 0) {
            System.out.println("+");
        } else if (a < 0 && b > 0 && c > 0) {
            System.out.println("-");
        } else if (a > 0 && b < 0 && c > 0) {
            System.out.println("-");
        } else if (a > 0 && b > 0 && c < 0) {
            System.out.println("-");
        }else{
            System.out.println(0);
        }


    }
}
