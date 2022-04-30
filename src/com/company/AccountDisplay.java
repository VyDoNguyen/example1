package com.company;
import java.time.format.DateTimeFormatter;
import java.time.LocalDateTime;
import java.util.Random;
import java.util.Scanner;

public class AccountDisplay extends AccountData {
    private String email;
    private String address;
    private String name;
    private String accountNumber;
    private String dateOfBirth;
    private String phoneNum;
    public String[] confirmedRequestedServices = new String[5];
    public String[] assignedEmployees = new String[5];
    private String randomIDNumber = getRandomNumber();
    static DateTimeFormatter dtf = DateTimeFormatter.ofPattern("MM/dd/YYYY");
    static LocalDateTime now = LocalDateTime.now();
    Scanner input = new Scanner(System.in);

    public void AccountDetails(String name) {
        this.name = name;
        accountNumber = name.substring(0, 1) + randomIDNumber;
        System.out.println("Welcome " + name);
        System.out.println("Today's Date " + dtf.format(now));
        System.out.println("Account Number " + accountNumber);
        displayRequests();
    }
    public void displayRequests(){
        int i;
        System.out.println("Requested Services Assigned Employee");
        for(i=0;i< confirmedRequestedServices.length;i++){

            System.out.println(confirmedRequestedServices[i]+" "+assignedEmployees[i]);

        }
    }
    public void askForOptions() {
        int choice, i;
        int count = 0;
        int size = 5;
        String[] requestedServices = new String[size];
        String[] assignedEmployee = new String[size];
        System.out.println("Please select the services that you would like to request. Press 0 to confirm your requests, Press 9 to go to Main Page");
        System.out.println("Press 1 for Internal Audit, Press 2 for Business Tax, Press 3 for Individual Tax, Press 4 for Consultation, Press 5 for Accounting");
        do {
            choice = input.nextInt();
            switch (choice) {
                case (1):
                    requestedServices[count] = "Internal Audit";
                    assignedEmployee[count] = "Noah Fein";
                    count++;
                    System.out.println("Internal Audit added!");
                    break;
                case (2):
                    requestedServices[count] = "Business Tax";
                    assignedEmployee[count] = "Vy Nguyen";
                    count++;
                    System.out.println("Business Tax added!");
                    break;
                case (3):
                    requestedServices[count] = "Individual Tax";
                    assignedEmployee[count] = "Nhat Han";
                    count++;
                    System.out.println("Individual Tax added!");
                    break;
                case (4):
                    requestedServices[count] = "Consultation";
                    assignedEmployee[count] = "Sophie Dong";
                    count++;
                    System.out.println("Consultation added!");
                    break;
                case (5):
                    requestedServices[count] = "Accounting";
                    assignedEmployee[count] = "Harsha Ambaty";
                    count++;
                    System.out.println("Accounting added!");
                    break;
                case (9):
                    AccountDetails(name);
                    displayRequests();
                    break;
                default:
                    System.out.println("Not an option. Try again.");
                case(0):break;


            }

        } while (choice != 0);
        System.out.println("Press 1 to confirm your selections, Press 0 to restart");
        for (i = 0; i < requestedServices.length; i++) {
            System.out.println(requestedServices[i] + " " + assignedEmployee[i]);
        }
        choice = input.nextInt();
        switch (choice) {
            case (1):
                int j;
                for(j = 0;j < confirmedRequestedServices.length;j++) {
                    confirmedRequestedServices[j]=requestedServices[j];
                    assignedEmployees[j]=assignedEmployee[j];

                }break;
            case (0):
                askForOptions();
                break;
            default:
                System.out.println("Not an option. Try again."); break;
        }

    }

    public static String getRandomNumber() {
        Random rnd = new Random();
        int number = rnd.nextInt(999999);
        return String.format("%06d", number);
    }


    public static void main(String[] args) {
        int choice=1;
        AccountDisplay accountDetails = new AccountDisplay();
        do {
            accountDetails.AccountDetails("Katy Garcia");
            accountDetails.askForOptions();
        }while (choice!=0);
    }
    }




