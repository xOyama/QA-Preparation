package com.telerikacademy;

import javax.xml.transform.SourceLocator;
import java.util.Scanner;

public class PrintCompanyInformation {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        String name = sc.nextLine();
        String address = sc.nextLine();
        String phoneNumber = sc.nextLine();
        String faxNumber = sc.nextLine();
        String webSite = sc.nextLine();
        String managerFirstName = sc.nextLine();
        String managerLastName = sc.nextLine();
        int age = Integer.parseInt(sc.nextLine());
        String managerPhone= sc.nextLine();

        System.out.println(name);
        System.out.println(address);
        System.out.println(phoneNumber);
        System.out.println(faxNumber);
        System.out.println(webSite);
        System.out.printf("%s %s (age: %d, tel. %s)",managerFirstName , managerLastName , age , managerPhone );





    }
}
