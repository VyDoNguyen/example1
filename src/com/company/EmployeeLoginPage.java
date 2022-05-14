package com.company;

import java.util.Scanner;
import java.util.Random;

public class EmployeeLoginPage {
    public static void EmployeeLoginPage(){
        Scanner empID = new Scanner(System.in);

        //Have account or create account
        System.out.println("Do you have an existing ID? If not, then create a new account (yes/create): ");
        String id = empID.nextLine().toLowerCase();

        if (id == "yes"){ //login

            //username
            System.out.println("Enter your username: ");
            String username = empID.nextLine();

            //password
            System.out.println("Enter your password: ");
            String password = empID.nextLine();

        }else if (id == "create"){ //create account


            int min = 100;
            int max = 999;
            //random number
            int rand_num = (int)Math.floor(Math.random()*(max-min+1)+min);
            String num = "" + rand_num;


            //first name
            System.out.println("Enter first name: ");
            String fname = empID.nextLine().toUpperCase();
            //last name
            System.out.println("Enter last name: ");
            String lname = empID.nextLine().toUpperCase();
            //make username
            String ID = fname.charAt(0) + lname.charAt(0) + num;

            //make sure the ID doesn't already exist
            boolean upperFlag = false;
            boolean lowerFlag = false;
            boolean lengthFlag = false;

            while (!upperFlag || !lowerFlag || !lengthFlag){
                upperFlag = false;
                lowerFlag = false;
                lengthFlag = false;

                //make password
                String LOWER = "abcdefghijklmnopqrstuvwxyz";
                String UPPER = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";

                System.out.println("Create a password" +
                        "Minimum 5 characters" +
                        "At least one uppercase and one lower case letter: ");
                String password = empID.nextLine();
    //            System.out.println(ID);


                if (password.length() >= 5){
                    lengthFlag = true;
                }

                for (int i = 0; i<=password.length(); i++) {
                    char temp = password.charAt(i);
                    if (LOWER.indexOf(temp) != -1) {
                        lowerFlag = true;
                    }
                    if (UPPER.indexOf(temp) != -1) {
                        upperFlag = true;
                    }


            }

            }

        }

    }
}

