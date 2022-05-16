package com.company;

import java.util.ArrayList;
import java.util.Scanner;

public class EmployeeProfile {
    public static String employeePassword;
    public static String employeeName;
    public static String employeeEmail;



    public static String getEmployeePassword(ArrayList<String> list) {
        Scanner sc = new Scanner(System.in);
        boolean validPassword = false;
        while (!validPassword) {
            System.out.println("Please enter a password: ");
            employeePassword = sc.next();
            char ch;
            boolean capitalFlag = false;
            boolean lowerCaseFlag = false;
            int numberCount = 0;
            boolean isLongEnough = false;
            for (int i = 0; i < employeePassword.length(); i++) {
                ch = employeePassword.charAt(i);
                if (Character.isDigit(ch)) {
                    numberCount++;
                } else if (Character.isUpperCase(ch)) {
                    capitalFlag = true;
                } else if (Character.isLowerCase(ch)) {
                    lowerCaseFlag = true;
                }
            }
            if (employeePassword.length() >= 5) {
                isLongEnough = true;
            }

            if (numberCount >= 2 && capitalFlag && lowerCaseFlag && isLongEnough) {
                System.out.println("Password saved");
                list.add(employeePassword);
                validPassword = true;
            } else {
                System.out.println("Invalid password!");
                System.out.println("It must contain at least 5 characters, contain at least one capital letter, lowercase number, and at least two numbers!");
            }


        }
        System.out.println(employeePassword);


        return employeePassword;
    }

    public static String getEmployeeName(ArrayList<String> list) {
        Scanner scan = new Scanner(System.in);
        boolean validUsername = false;
        while (!validUsername) {
            System.out.println("Please enter a username: ");
            employeeName = scan.next();
            if (employeeName.length() >= 8) {
                validUsername = true;
                list.add(employeeName);
                return employeeName;
            } else {
                System.out.println("It must be minimum 8 characters long!");
            }
        }
        System.out.println(employeeName);
        System.out.println("username saved!");
        return employeeName;
    }

    public static String getEmployeeEmail() {
        Scanner scn = new Scanner(System.in);
        boolean validEmail = false;
        while (!validEmail) {
            System.out.println("Please enter your preferred email: ");
            employeeEmail = scn.next();
            if (employeeEmail.contains(".com") || employeeEmail.contains(".edu") || employeeEmail.contains(".org")) {
                validEmail = true;
                System.out.println("Email saved!");
                System.out.println(employeeEmail);
                return employeeEmail;
            } else {
                System.out.println("Please enter a valid email!");
            }
        }

        return employeeEmail;
    }


    public static void employeeLogin() {
        Scanner theScan = new Scanner(System.in);
        boolean validLogin = false;
        while (!validLogin) {
            System.out.println("Please enter your username: ");
            String theEmployeeUserName = theScan.next();
            System.out.println("Please enter your password: ");
            String theUserPassword = theScan.next();
            if (theEmployeeUserName.equals("nguyend4") && theUserPassword.equals("Nguyen2000")) {
                System.out.println("account found");
                validLogin = true;
                    return;
                }
            if (!theEmployeeUserName.equals("nguyend4") || !theUserPassword.equals("Nguyen2000")) {
                System.out.println("account not found or incorrect login");
            }
        }
    }

}