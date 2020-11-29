package com.telerikacademy.ConditionalStatements;

import java.util.Scanner;

public class Sort3NumbersWithNestedIfs {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        Double n1 = Double.parseDouble(sc.nextLine());
        Double n2 = Double.parseDouble(sc.nextLine());
        Double n3 = Double.parseDouble(sc.nextLine());

        if (n1 >= n2) {
            if (n1 >= n3) {
                if (n2 >= n3) {
                    System.out.printf("%s, %s, %s", n1, n2, n3);
                } else {
                    System.out.printf("%s, %s, %s", n1, n3, n2);
                }
            } else {
                if (n2 >= n3) {
                    System.out.printf("%s, %s, %s", n2, n3, n1);
                } else {
                    System.out.printf("%s, %s, %s", n3, n1, n2);
                }
            }
        } else {
            if (n1 >= n3) {
                if (n2 >= n3) {
                    System.out.printf("%s, %s, %s", n2, n1, n3);
                } else {
                    System.out.printf("%s, %s, %s", n3, n2, n1);
                }
            } else {
                if (n2 >= n3) {
                    System.out.printf("%s, %s, %s", n2, n3, n1);
                } else {
                    System.out.printf("%s, %s, %s", n3, n2, n1);
                }
            }
        }
    }
}
