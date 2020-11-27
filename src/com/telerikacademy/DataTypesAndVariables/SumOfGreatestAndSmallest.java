package com.telerikacademy.DataTypesAndVariables;
import java.util.Scanner;
public class SumOfGreatestAndSmallest {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a,b,c;
        a = sc.nextInt();
        b = sc.nextInt();
        c = sc.nextInt();

        int largest = Math.max(a,Math.max(b,c));
        int smallest = Math.min(a,Math.min(b,c));

        int sum = largest + smallest;

        System.out.printf("%d",sum);


    }
}
