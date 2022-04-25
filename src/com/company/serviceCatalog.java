package com.company;

import java.util.Locale;
import java.util.Scanner;

public class serviceCatalog {
    public static void main(String[] args) {
        String[][] serviceCat = new String[6][4];
        serviceCat[0][0]="Service Line";
        serviceCat[1][0]="Internal Audit";
        serviceCat[2][0]="Business Tax";
        serviceCat[3][0]="Individual Tax";
        serviceCat[4][0]="Consulting";
        serviceCat[5][0]="Accounting";
        serviceCat[0][1]="Employee ID";
        serviceCat[1][1]="NF100";
        serviceCat[2][1]="VN200";
        serviceCat[3][1]="NH300";
        serviceCat[4][1]="SD400";
        serviceCat[5][1]="HA500";
        serviceCat[0][2]="Staff";
        serviceCat[1][2]="Noah Fein";
        serviceCat[2][2]="Vy Nguyen";
        serviceCat[3][2]="Nhat Han";
        serviceCat[4][2]="Sophie Dong";
        serviceCat[5][2]="Harsha Ambaty";
        serviceCat[0][3]="Email Address";
        serviceCat[1][3]= "nfein1@umbc.edu";
        serviceCat[2][3]="nguyend4@umbc.edu";
        serviceCat[3][3]="ff91178@umbc.edu";
        serviceCat[4][3]="sdong1@umbc.edu";
        serviceCat[5][3]="il54815@umbc.edu";

    int row= 6;
    int columns=4 ;
    int i,j;
    for(i=0; i<row; i++) {
        for (j=0; j< columns; j++) {
            System.out.print(serviceCat[i][j] +"\t" + "|");
        }
        System.out.println();
    }

    Scanner employee = new Scanner(System.in);
    System.out.println("Enter Employee ID (eg. AB100): ");
    String name = employee.nextLine().toUpperCase();
    switch (name) {
        case "NF100":
            System.out.println("Employee's name is " + serviceCat[1][2]);
            System.out.println("Employee's service is " + serviceCat[1][0]);
            System.out.println("Employee's email address: " + serviceCat[1][3]);
            break;
        case "VN200":
            System.out.println("Employee's name is " +serviceCat[2][2]);
            System.out.println("Employee's service is " + serviceCat[2][0]);
            System.out.println("Employee's email address: " + serviceCat[2][3]);
            break;
        case "NH300":
            System.out.println("Employee's name is " +serviceCat[3][2]);
            System.out.println("Employee's service is " + serviceCat[3][0]);
            System.out.println("Employee's email address: " + serviceCat[3][3]);
            break;
        case "SD400" :
            System.out.println("Employee's name is " + serviceCat[4][2]);
            System.out.println("Employee's service is " + serviceCat[4][0]);
            System.out.println("Employee's email address: " + serviceCat[4][3]);
            break;
        case "HA500" :
            System.out.println("Employee's name is " + serviceCat[5][2]);
            System.out.println("Employee's service is " + serviceCat[5][0]);
            System.out.println("Employee's email address: " + serviceCat[5][3]);
            break;
        default:
            System.out.println("Invalid Employee ID");
    }
        }
    }
