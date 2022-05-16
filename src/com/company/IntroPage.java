package com.company;

import com.company.AccountData;
import com.company.CustomerLoginPage;

import java.util.ArrayList;
import java.util.Objects;
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
                            System.out.println("Welcome back!");
                            System.out.println("Business Tax");
                            System.out.println("Vy Nguyen");
                            System.out.println("VN200");
                            System.out.println("nguyend4@umbc.edu");
                            System.out.println("Do you want to see the service catalog?");
                            String serviceCatalog = thescn.next();
                            if(serviceCatalog.equals("yes")) {
                                com.company.serviceCatalog.serviceCatalog();
                            }else{
                                System.out.println("okay");
                                System.out.println("Business Tax");
                                System.out.println("Vy Nguyen");
                                System.out.println("VN200");
                                System.out.println("nguyend4@umbc.edu");

                            }
                            valid = true;
                        } else if (haveAccount.equals("n") || haveAccount.equals("N")) {
                            EmployeeProfile.getEmployeePassword(list);
                            EmployeeProfile.getEmployeeName(list);
                            EmployeeProfile.getEmployeeEmail();
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
