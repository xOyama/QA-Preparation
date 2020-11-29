package com.telerikacademy.ConditionalStatements;

import java.util.Scanner;

public class PlayWithIntDoubleString {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);


        System.out.print("Please choose a type:\n" +
                "1 --> int\n" +
                "2 --> double\n" +
                "3 --> string\n");
        String type = sc.nextLine();

        switch (type){
            case "1":
                System.out.println("Please enter an int:");
                double n1 = Double.parseDouble(sc.nextLine());
                System.out.printf("%s", n1+1);
                break;
            case "2":
                System.out.println("Please enter a double:");
                double n2 = Double.parseDouble(sc.nextLine());
                System.out.printf("%s", n2+1);
                break;
            case "3":
                System.out.println("Please enter a string:");
                String word = sc.nextLine();
                System.out.println(word+"*");
                break;

        }


    }
}
