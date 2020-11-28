package com.telerikacademy.ConditionalStatements;
import java.util.Scanner;
public class ExchangeIfGreater {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        double a = Double.parseDouble(sc.nextLine());
        double b = Double.parseDouble(sc.nextLine());

        if ( a > b){
            System.out.printf("%s %s" , b , a);

        }else{
            System.out.printf("%s %s" , a , b);
        }



    }
}
