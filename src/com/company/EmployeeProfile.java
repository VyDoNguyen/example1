package com.company;

import java.util.ArrayList;
import java.util.Scanner;

public class EmployeeProfile {
    public static String employeePassword;
    public static String employeeName;
    public static String employeeEmail;
    public static String employeeNumber;
    public static String employeeDob;
    public static String employeeAddress;


    public static String getEmployeePassword(ArrayList<String> list) {
        Scanner sc = new Scanner(System.in);
        System.out.println("What is your first name?");
        String firstName = sc.next();
        System.out.println("What is your last name?");
        String lastName = sc.next();
        System.out.println("Hello" + " " + firstName + " " + lastName);
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

    public static String getEmployeeNumber() {
        Scanner theScan = new Scanner(System.in);
        boolean validPhoneNumber = false;
        while (!validPhoneNumber) {
            System.out.println("Please enter your phone number: (eg: 410-442-5555) ");
            employeeNumber = theScan.next();
            if (employeeNumber.length() == 12 && employeeNumber.contains("-")) {
                System.out.println("Phone number saved!");
                validPhoneNumber = true;
                return employeeNumber;
            } else {
                System.out.println("Please enter a valid phone number!");
            }
        }
        return employeeNumber;
    }

    public static String getEmployeeDob() {
        Scanner scanner = new Scanner(System.in);
        boolean validUserDob = false;
        while (!validUserDob) {
            System.out.println("Please enter your date of birth: (eg January 25, 2000) ");
            employeeDob = scanner.nextLine();
            if (employeeDob.contains("January") || employeeDob.contains("February") ||
                    employeeDob.contains("March") || employeeDob.contains("April") || employeeDob.contains("May")
                    || employeeDob.contains("June") || employeeDob.contains("July") || employeeDob.contains("August")
                    || employeeDob.contains("September") || employeeDob.contains("October") || employeeDob.contains("November")
                    || employeeDob.contains("December")) {
                System.out.println("Date of birth saved!");
                validUserDob = true;
                return employeeDob;
            }


        }
        return employeeDob;
    }

    public static String getEmployeeAddress() {
        Scanner theScanner = new Scanner(System.in);
        boolean validAddress = false;
        while (!validAddress) {
            System.out.println("Please enter your preferred address: ");
            employeeAddress = theScanner.nextLine();
            if (employeeAddress != null) {
                System.out.println("Address saved!");
                validAddress = true;
                return employeeAddress;
            }
        }
        return employeeAddress;
    }

    public static void employeeLogin(ArrayList<String> list) {
        Scanner theScan = new Scanner(System.in);
        boolean validLogin = false;
        while (!validLogin) {
            System.out.println("Please enter your username: ");
            String employeeName = theScan.next();
            System.out.println("Please enter your password: ");
            String employeePassword = theScan.next();
            if (list.contains(employeePassword) && list.contains(employeeName)) {
                System.out.println("account found");
                return;
            }
            System.out.println("account not found or incorrect login");
            validLogin = true;
        }
    }

    public static void employeeLogin() {
        Scanner theScan = new Scanner(System.in);
        boolean validLogin = false;
        while (!validLogin) {
            System.out.println("Please enter your username: ");
            String theEmployeeUserName = theScan.next();
            System.out.println("Please enter your password: ");
            String theUserPassword = theScan.next();
            if (theEmployeeUserName.equals("nguyend4") == true && employeePassword.equals("Nguyen2000") == true) {
                System.out.println("account found");
                validLogin = true;
                    return;
                }
            if (theEmployeeUserName.equals("nguyend4") != true || theUserPassword.equals("Nguyen2000") != true) {
                System.out.println("account not found or incorrect login");
            }
        }
    }

}