package com.company;

import java.util.ArrayList;
import java.util.Scanner;

public class IntroPage {
    public static void IntroPage(ArrayList<String> list) {
        System.out.println("Welcome to 123 Accounting Firm");
        Scanner thescn = new Scanner(System.in);
        boolean validAnswer = false;
        while (!validAnswer) {
            System.out.println("Login: 'c' for customer, 'e' for employee");
            String login = thescn.next();
            if (login.equals("c") || login.equals("C")) {
                System.out.println("call customer login");
                boolean valid = false;
                while (!valid) {
                    System.out.println("Do you have an account: 'y' for yes, 'n' for no");
                    String haveAccount = thescn.next();
                    if (haveAccount.equals("y") || haveAccount.equals("Y")) {
                        System.out.println("call login");
                        CustomerLoginPage.userLogin(list);
                        valid = true;
                    } else if (haveAccount.equals("n") || haveAccount.equals("N")) {
                        System.out.println("call create account");
                        CustomerLoginPage.getPassword(list);
                        CustomerLoginPage.getUsername(list);
                        CustomerLoginPage.getEmail();
                        CustomerLoginPage.getPhoneNumber();
                        CustomerLoginPage.getDob();
                        valid = true;
                    } else {
                        System.out.println("Invalid response!");
                    }
                }
                validAnswer = true;
            } else if (login.equals("e") || login.equals("E")) {
                System.out.println("call employee login");
                validAnswer = true;
            } else {
                System.out.println("Please enter a valid input!");
            }
        }
    }


}
