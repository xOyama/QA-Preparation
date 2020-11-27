package com.telerikacademy.DataTypesAndVariables;
import java.util.Scanner;
public class NumberComparer {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double a = Double.parseDouble(sc.nextLine());
        double b = Double.parseDouble(sc.nextLine());
        System.out.println(Math.max(a,b));

    }
}
