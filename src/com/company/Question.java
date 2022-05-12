package com.company;

import java.util.Scanner;

public class Question {
    public void Question() {
        int i;
        Scanner input = new Scanner(System.in);
        do {
            System.out.println("Are you an employee or a customer. Press 1 for employee or Press 2 for customer");
            i = input.nextInt();
            switch (i) {
                case (1):
                    CustomerLoginPage login1 = new CustomerLoginPage();
                case (2):
                    EmployeeLoginPage login2 = new EmployeeLoginPage();
                default:
                    System.out.println("Not an option. Try again.");
            }
        } while(i!=1||i!=2);
    }
}
