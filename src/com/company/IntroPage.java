package com.company;

import com.company.AccountData;
import com.company.CustomerLoginPage;

import java.util.ArrayList;
import java.util.Scanner;

    public class IntroPage {
        public static void IntroPage(ArrayList<String> list) {
            System.out.println("Welcome to 123 Accounting Firm");
            Scanner thescn = new Scanner(System.in);
            AccountData accountData = new AccountData();
            boolean validAnswer = false;
            while (!validAnswer) {
                System.out.println("Login: 'c' for customer, 'e' for employee");
                String login = thescn.next();
                if (login.equals("c") || login.equals("C")) {
                    boolean valid = false;
                    while (!valid) {
                        System.out.println("Do you have an account: 'y' for yes, 'n' for no");
                        String haveAccount = thescn.next();
                        if (haveAccount.equals("y") || haveAccount.equals("Y")) {
                            CustomerLoginPage.userLogin();
                            accountData.getAccountData();
                            valid = true;
                        } else if (haveAccount.equals("n") || haveAccount.equals("N")) {
                            CustomerLoginPage.getPassword(list);
                            CustomerLoginPage.getUsername(list);
                            CustomerLoginPage.getEmail();
                            CustomerLoginPage.getPhoneNumber();
                            CustomerLoginPage.getTheUserDob();
                            CustomerLoginPage.getUserAddress();
                            valid = true;
                        } else {
                            System.out.println("Invalid response!");
                        }
                    }
                    validAnswer = true;
                } else if (login.equals("e") || login.equals("E")) {
                    boolean valid = false;
                    while (!valid) {
                        System.out.println("Do you have an account: 'y' for yes, 'n' for no");
                        String haveAccount = thescn.next();
                        if (haveAccount.equals("y") || haveAccount.equals("Y")) {
                            EmployeeProfile.employeeLogin();
                            accountData.getAccountData();
                            valid = true;
                        } else if (haveAccount.equals("n") || haveAccount.equals("N")) {
                            EmployeeProfile.getEmployeePassword(list);
                            EmployeeProfile.getEmployeeName(list);
                            EmployeeProfile.getEmployeeEmail();
                            EmployeeProfile.getEmployeeNumber();
                            EmployeeProfile.getEmployeeDob();
                            EmployeeProfile.getEmployeeAddress();
                            valid = true;
                        } else {
                            System.out.println("Invalid response!");
                        }
                    }
                    validAnswer = true;
                } else {
                    System.out.println("Please enter a valid input!");
                }
            }
        }


    }
