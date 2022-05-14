package com.company;
import java.util.ArrayList;
import java.util.Scanner;


public class Main {

    public static void main(String[] args) {
        //user userData = new user("noahh", "3252", "ndsk@yahoo.com");
        //user[] userData = new user[1];
        //userData[0] = new user("bob1", "dhhjhcv", "fnvkng@yahoo.com");
        ArrayList<User> list = new ArrayList<User>();
        list.add(new User("alexbrown", "AlexBrown128", "alexbrown@gmail.com"));
        list.add(new User("juliekim", "JulieKim228", "juliekim@gmail.com"));
        list.add(new User("willsmiths", "WillSmiths328", "willsmiths@yahoo.com"));
        list.add(new User("annachoi", "AnnaChoi428", "annachoi@gmail.com"));
        System.out.println("Welcome to 123 Accounting Firm");
        Scanner thescn = new Scanner(System.in);
        boolean validAnswer = false;
        while(!validAnswer) {
            System.out.println("Login: 'c' for customer, 'e' for employee");
            String login = thescn.next();
            if (login.equals("c") || login.equals("C")) {
                System.out.println("call customer login");
                boolean valid = false;
                while(!valid) {
                    System.out.println("Do you have an account: 'y' for yes, 'n' for no");
                    String haveAccount = thescn.next();
                    if (haveAccount.equals("y") || haveAccount.equals("Y")) {
                        System.out.println("call login");
                        CustomerLoginPage.userLogin(list);
                        valid = true;
                    } else if (haveAccount.equals("n") || haveAccount.equals("N")) {
                        System.out.println("call create account");
                        User user = CustomerLoginPage.createAccount(list);
                        list.add(user);
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

