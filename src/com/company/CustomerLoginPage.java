package com.company;

import java.util.ArrayList;
import java.util.Scanner;

public class CustomerLoginPage {

    public static String getPassword() {
        Scanner sc = new Scanner(System.in);
        System.out.println("What is your first name?");
        String firstName = sc.next();
        System.out.println("What is your last name?");
        String lastName = sc.next();
        System.out.println("Hello" + " " + firstName + " " + lastName);
        boolean validPassword = false;
        String userPassword = null;
        while (!validPassword) {
            System.out.println("Please enter a password: ");
            userPassword = sc.next();
            char ch;
            boolean capitalFlag = false;
            boolean lowerCaseFlag = false;
            int numberCount = 0;
            boolean isLongEnough = false;
            for (int i = 0; i < userPassword.length(); i++) {
                ch = userPassword.charAt(i);
                if (Character.isDigit(ch)) {
                    numberCount++;
                } else if (Character.isUpperCase(ch)) {
                    capitalFlag = true;
                } else if (Character.isLowerCase(ch)) {
                    lowerCaseFlag = true;
                }
            }
            if (userPassword.length() >= 5) {
                isLongEnough = true;
            }

            if (numberCount >= 2 && capitalFlag && lowerCaseFlag && isLongEnough) {
                System.out.println("Password saved");
                validPassword = true;
            } else {
                System.out.println("Invalid password!");
                System.out.println("It must contain at least 5 characters, contain at least one capital letter, lowercase number, and at least two numbers!");
            }


        }
        System.out.println(userPassword);


        return userPassword;
    }
    public static String getUsername(ArrayList<User> list) {
        Scanner scan = new Scanner(System.in);
        boolean validUsername = false;
        String userName = null;
        while (!validUsername) {
            System.out.println("Please enter a username: ");
            userName = scan.next();
            if (userName.length() >= 8) {
                validUsername = true;
                for (User user : list) {
                    if (user.userName.equals(userName)) {
                        System.out.println("Username already exists");
                        validUsername = false;
                        break;
                    }
                }
            } else {
                System.out.println("It must be minimum 8 characters long!");
            }
        }
        System.out.println(userName);
        System.out.println("username saved!");
        return userName;
    }
    public static String getEmail() {
        Scanner scn = new Scanner(System.in);
        boolean validEmail = false;
        String theUserEmail = null;
        while (!validEmail) {
            System.out.println("Please enter your preferred email: ");
            theUserEmail = scn.next();
            if (theUserEmail.contains(".com") || theUserEmail.contains(".edu") || theUserEmail.contains(".org")) {
                validEmail = true;
                System.out.println("Email saved!");
                System.out.println(theUserEmail);
                return theUserEmail;
            } else {
                System.out.println("Please enter a valid email!");
            }
        }

        return theUserEmail;
    }
    public static User createAccount(ArrayList<User> list) {
        String thePassword = getPassword();
        String theUserName = getUsername(list);
        String theEmail = getEmail();
        return new User(theUserName, thePassword, theEmail);
    }
    public static void userLogin(ArrayList<User> list) {
        Scanner theScan = new Scanner(System.in);
        System.out.println("Please enter your username: ");
        String theUserName = theScan.next();
        System.out.println("Please enter your password: ");
        String theUserPassword = theScan.next();
        for (User user : list) {
            if (user.userName.equals(theUserName) && user.password.equals(theUserPassword)) {
                System.out.println("login found");
                return;
            }
        }
        System.out.println("incorrect password or account not found");
    }
}


