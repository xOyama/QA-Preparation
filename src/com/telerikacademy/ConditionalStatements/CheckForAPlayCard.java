package com.telerikacademy.ConditionalStatements;
import java.util.Scanner;
public class CheckForAPlayCard {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String cardFace = sc.nextLine();

        switch (cardFace){
            case "2":
            case "3":
            case "4":
            case "5":
            case "6":
            case "7":
            case "8":
            case "9":
            case "10":
            case "J":
            case "Q":
            case "K":
            case "A":
                System.out.println("yes");
                break;
            default:
                System.out.println("no");

        }


    }
}
