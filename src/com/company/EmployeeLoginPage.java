package com.company;

import java.util.ArrayList;
import java.util.Objects;
import java.util.Scanner;
import java.util.Random;

public class EmployeeLoginPage {
    static ArrayList<String> thelist = new ArrayList<>();
    public static void EmployeeLoginPage(){
        Scanner empID = new Scanner(System.in);

        String storeID;
        String storePassword;
        String storeFullName;
        
        String id = "";
        while (id != "yes" || id != "create"){
            //Have account or create account
            System.out.println("Do you have an existing ID? If not, then create a new account (yes/create): ");
            id = empID.nextLine().toLowerCase();
        }
        

        if (Objects.equals(id, "yes")){ //login

            //username
            System.out.println("Enter your username: ");
            String username = empID.nextLine();

            //password
            System.out.println("Enter your password: ");
            storePassword = empID.nextLine();
            if(thelist.contains(username) && thelist.contains(storePassword)) {
                serviceCatalog.serviceCatalog();
            }

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
            storeID = fname.charAt(0) + lname.charAt(0) + num;
            storeFullName = fname + " " + lname;
            thelist.add(storeFullName);

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
                storePassword = empID.nextLine();
                thelist.add(storePassword);
                //            System.out.println(ID);


                if (storePassword.length() >= 5){
                    lengthFlag = true;
                }

                for (int i = 0; i<=storePassword.length(); i++) {
                    char temp = storePassword.charAt(i);
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
