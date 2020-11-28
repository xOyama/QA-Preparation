package com.telerikacademy.ConditionalStatements;
import java.util.Scanner;
public class TheBiggestOf3Numbers {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        double a = Double.parseDouble(sc.nextLine());
        double b = Double.parseDouble(sc.nextLine());
        double c = Double.parseDouble(sc.nextLine());

        if (a >= b && a >= c){
            System.out.println(a);
        }else if (b >= a && b >= c){
            System.out.println(b);
        }else{
            System.out.println(c);
        }


    }
}
