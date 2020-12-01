package com.telerikacademy.ConditionalStatements;

import java.util.Scanner;

public class DigitAsWord {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String output = "";
        int number = Integer.parseInt(sc.nextLine());
        int units = number % 10;
        int tens = (number / 10) % 10;
        int hundreds = (number / 100) % 10;


        String unitsWord = "";
        String tensWord = "";
        String hundredsWord = "";

        if (number < 0 || number > 999) {
            output = "error";
            System.out.println(output);
        }

        if (number == 0){
            output = "zero";
            System.out.println(output);
            return;
        }

        switch (units) {
            case 1:
                unitsWord = "one";
                break;
            case 2:
                unitsWord = "two";
                break;
            case 3:
                unitsWord = "three";
                break;
            case 4:
                unitsWord = "four";
                break;
            case 5:
                unitsWord = "five";
                break;
            case 6:
                unitsWord = "six";
                break;
            case 7:
                unitsWord = "seven";
                break;
            case 8:
                unitsWord = "eight";
                break;
            case 9:
                unitsWord = "nine";
                break;
            default:
                unitsWord = "";

        }

        switch (tens) {
            case 1:
                tensWord = "ten ";
                break;
            case 2:
                tensWord = "twenty ";
                break;
            case 3:
                tensWord = "thirty ";
                break;
            case 4:
                tensWord = "forty ";
                break;
            case 5:
                tensWord = "fifty ";
                break;
            case 6:
                tensWord = "sixty ";
                break;
            case 7:
                tensWord = "seventy ";
                break;
            case 8:
                tensWord = "eighty ";
                break;
            case 9:
                tensWord = "ninety ";
                break;
            default:
                tensWord = "";

        }

        switch (hundreds){
            case 1:
                hundredsWord = "One hundred and ";
                break;
            case 2:
                hundredsWord = "Two hundred and ";
                break;
            case 3:
                hundredsWord = "Three hundred and ";
                break;
            case 4:
                hundredsWord = "Four hundred and ";
                break;
            case 5:
                hundredsWord = "Five hundred and ";
                break;
            case 6:
                hundredsWord = "Six hundred and ";
                break;
            case 7:
                hundredsWord = "Seven hundred and ";
                break;
            case 8:
                hundredsWord = "Eight hundred and ";
                break;
            case 9:
                hundredsWord = "Nine hundred and ";
                break;
            default:
                hundredsWord = "";
        }

        if (tens == 1 ){
            switch (units){
                case 1:
                    tensWord = "eleven ";
                    unitsWord = "";
                    break;
                case 2:
                    tensWord = "twelve";
                    unitsWord = "";
                    break;
                case 3:
                    tensWord = "thirteen";
                    unitsWord = "";
                    break;
                case 4:
                    tensWord = "fourteen";
                    unitsWord = "";
                    break;
                case 5:
                    tensWord = "fifteen";
                    unitsWord = "";
                    break;
                case 6:
                    tensWord = "sixteen";
                    unitsWord = "";
                    break;
                case 7:
                    tensWord = "seventeen";
                    unitsWord = "";
                    break;
                case 8:
                    tensWord = "eighteen";
                    unitsWord = "";
                    break;
                case 9:
                    tensWord = "nineteen";
                    unitsWord = "";
                    break;



            }
        }



        output = hundredsWord + tensWord + unitsWord;
        System.out.println(output);
    }
}
