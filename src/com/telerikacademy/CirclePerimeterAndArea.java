package com.telerikacademy;
import java.util.Scanner;

public class CirclePerimeterAndArea {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        double r = Double.parseDouble(sc.nextLine());
        double perimeter = 2 * Math.PI * r;
        double area = Math.PI * Math.pow(r,2);
        System.out.printf("Perimeter: %.2f%n",perimeter);
        System.out.printf("Area: %.2f", area);

    }
}
