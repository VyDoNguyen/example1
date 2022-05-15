package com.company;

import java.util.Locale;
import java.util.Scanner;

public class serviceCatalog {
    public static void serviceCatalog() {
        String[][] serviceCat = new String[6][4];
        serviceCat[0][0] = "Service Line";
        serviceCat[1][0] = "Internal Audit";
        serviceCat[2][0] = "Business Tax";
        serviceCat[3][0] = "Individual Tax";
        serviceCat[4][0] = "Consulting";
        serviceCat[5][0] = "Accounting";

        serviceCat[0][1] = "Staff";
        serviceCat[1][1] = "Noah Fein";
        serviceCat[2][1] = "Vy Nguyen";
        serviceCat[3][1] = "Nhat Han";
        serviceCat[4][1] = "Sophie Dong";
        serviceCat[5][1] = "Harsha Ambaty";

        serviceCat[0][2] = "Employee ID";
        serviceCat[1][2] = "NF100";
        serviceCat[2][2] = "VN200";
        serviceCat[3][2] = "NH300";
        serviceCat[4][2] = "SD400";
        serviceCat[5][2] = "HA500";

        serviceCat[0][3] = "Email Address";
        serviceCat[1][3] = "nfein1@umbc.edu";
        serviceCat[2][3] = "nguyend4@umbc.edu";
        serviceCat[3][3] = "ff91178@umbc.edu";
        serviceCat[4][3] = "sdong1@umbc.edu";
        serviceCat[5][3] = "il54815@umbc.edu";

        int row = 6;
        int columns = 2;
        int i, j;
        for (i = 0; i < row; i++) {
            for (j = 0; j < columns; j++) {
                System.out.print(serviceCat[i][j] + "\t" + "|");
            }
            System.out.println();
        }
    }
}