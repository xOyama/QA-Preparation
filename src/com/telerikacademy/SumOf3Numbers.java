package com.telerikacademy;
import java.util.Scanner;

public class SumOf3Numbers {

    public static void main(String[] args) {

	    Scanner sc = new Scanner(System.in);

	    int a = Integer.parseInt(sc.nextLine());
	    int b = Integer.parseInt(sc.nextLine());
        int c = Integer.parseInt(sc.nextLine());

        int sum = a + b + c ;

        System.out.println(sum);


    }
}
