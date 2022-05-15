package com.company;

import java.util.ArrayList;
import java.util.Scanner;

public class CustomerLoginPage {
    public static String userPassword;
    public static String userName;
    public static String theUserEmail;
    public static String PhoneNumber;
    public static String TheUserDob;
    public static String userAddress;


    public static String getPassword(ArrayList<String> list) {
        Scanner sc = new Scanner(System.in);
        System.out.println("What is your first name?");
        String firstName = sc.next();
        System.out.println("What is your last name?");
        String lastName = sc.next();
        System.out.println("Hello" + " " + firstName + " " + lastName);
        boolean validPassword = false;
        //String userPassword = null;
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
                list.add(userPassword);
                validPassword = true;
            } else {
                System.out.println("Invalid password!");
                System.out.println("It must contain at least 5 characters, contain at least one capital letter, lowercase number, and at least two numbers!");
            }


        }
        System.out.println(userPassword);


        return userPassword;
    }

    public static String getUsername(ArrayList<String> list) {
        Scanner scan = new Scanner(System.in);
        boolean validUsername = false;
        //String userName = null;
        while (!validUsername) {
            System.out.println("Please enter a username: ");
            userName = scan.next();
            if (userName.length() >= 8) {
                validUsername = true;
                list.add(userName);
                return userName;
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
        //String theUserEmail = null;
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

    public static String getPhoneNumber() {
        Scanner theScan = new Scanner(System.in);
        boolean validPhoneNumber = false;
        //String PhoneNumber = null;
        while (!validPhoneNumber) {
            System.out.println("Please enter your phone number: ");
            PhoneNumber = theScan.next();
            if (PhoneNumber.length() == 12 && PhoneNumber.contains("-")) {
                System.out.println("Phone number saved!");
                validPhoneNumber = true;
                return PhoneNumber;
            } else {
                System.out.println("Please enter a valid phone number!");
            }
        }
        return PhoneNumber;
    }

    public static String getDob() {
        Scanner scanner = new Scanner(System.in);
        boolean validUserDob = false;
        //String TheUserDob = null;
        while (!validUserDob) {
            System.out.println("Please enter your date of birth: ");
            TheUserDob = scanner.nextLine();
            if (TheUserDob.contains("January") || TheUserDob.contains("February") ||
                    TheUserDob.contains("March") || TheUserDob.contains("April") || TheUserDob.contains("May")
                    || TheUserDob.contains("June") || TheUserDob.contains("July") || TheUserDob.contains("August")
                    || TheUserDob.contains("September") || TheUserDob.contains("October") || TheUserDob.contains("November")
                    || TheUserDob.contains("December")) {
                System.out.println("Date of birth saved!");
                validUserDob = true;
                return TheUserDob;
            }


        }
        return TheUserDob;
    }
    public static String getUserAddress() {
        Scanner theScanner = new Scanner(System.in);
        boolean validAddress = false;
        while(!validAddress) {
            System.out.println("Please enter your preferred address: ");
            userAddress = theScanner.nextLine();
            if (userAddress != null) {
                System.out.println("Address saved!");
                validAddress = true;
                return userAddress;
            }
        }
        return userAddress;
    }

    public static void userLogin(ArrayList<String> list) {
        Scanner theScan = new Scanner(System.in);
        boolean validLogin = false;
        while(!validLogin) {
            System.out.println("Please enter your username: ");
            String theUserName = theScan.next();
            System.out.println("Please enter your password: ");
            String theUserPassword = theScan.next();
            if (list.contains(theUserPassword) && list.contains(theUserName)) {
                System.out.println("account found");
                return;
            }
            System.out.println("account not found or incorrect login");
            validLogin = true;
        }
    }
    public static void userLogin() {
        Scanner theScan = new Scanner(System.in);
        boolean validLogin = false;
        while(!validLogin) {
            System.out.println("Please enter your username: ");
            String theUserName = theScan.next();
            System.out.println("Please enter your password: ");
            String theUserPassword = theScan.next();
            if (theUserName.equals("alexbrown12")==true && theUserPassword.equals("Password1000")==true) {
                System.out.println("account found");
                return;
            }
            System.out.println("account not found or incorrect login");
            validLogin = true;
        }
    }
}


