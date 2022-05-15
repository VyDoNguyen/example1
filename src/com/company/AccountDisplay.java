package com.company;
import java.time.format.DateTimeFormatter;
import java.time.LocalDateTime;
import java.util.Random;
import java.util.Scanner;

public class AccountDisplay {
    private String email;
    private String address;
    private String name;
    private String accountNumber;
    private String dateOfBirth;
    private String phoneNum;
    private String[] confirmedRequestedServices = new String[5];
    private String[] assignedEmployees = new String[5];
    private String randomIDNumber = getRandomNumber();
    public static DateTimeFormatter dtf = DateTimeFormatter.ofPattern("MM/dd/YYYY");
    public static LocalDateTime now = LocalDateTime.now();
    Scanner input = new Scanner(System.in);


    public void AccountDetails(String name, String address, String phoneNum, String email, String dateOfBirth) {
        int x;
        do {
            System.out.println("Press 1 to change services, Press 2 for more account details, Press 0 to quit");
            setName(name);
            setAddress(address);
            setPhoneNum(phoneNum);
            setEmail(email);
            setDateOfBirth(dateOfBirth);
            accountNumber = name.substring(0, 1) + randomIDNumber;
            System.out.println("Welcome " + name);
            System.out.println("Today's Date " + dtf.format(now));
            System.out.println("Account Number " + accountNumber);
            displayRequests();
            x = input.nextInt();
            switch (x) {
                case (1):
                    askForOptions();
                    break;
                case (2):
                    displayPersonalInfo();
                    break;
                case (0):
                    break;
            }
        } while (x != 0);
    }


    public void displayRequests() {
        int i;
        System.out.println("Requested Services Assigned Employee");
        for (i = 0; i < confirmedRequestedServices.length; i++) {

            System.out.println(confirmedRequestedServices[i] + " " + assignedEmployees[i]);

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
                    AccountDetails(name, address, phoneNum, email, dateOfBirth);
                    displayRequests();
                    break;
                default:
                    System.out.println("Not an option. Try again.");
                case (0):
                    break;


            }

        } while (choice != 0);
        for (i = 0; i < requestedServices.length; i++) {
            System.out.println(requestedServices[i] + " " + assignedEmployee[i]);
        }
        Scanner input2 = new Scanner(System.in);
        System.out.println("Enter your address to confirm your identity");
        String confirmAddress = input2.nextLine();
        addressCheck(confirmAddress);
        System.out.println("Enter your phone number");
        String confirmPhoneNumber = input2.nextLine();
        phoneNumCheck(confirmPhoneNumber);
        System.out.println("Press 1 to confirm your selections, Press 0 to restart");
        choice = input.nextInt();
        switch (choice) {
            case (1):
                int j;
                for (j = 0; j < confirmedRequestedServices.length; j++) {
                    confirmedRequestedServices[j] = requestedServices[j];
                    assignedEmployees[j] = assignedEmployee[j];

                }
                break;
            case (0):
                askForOptions();
                break;
            default:
                System.out.println("Not an option. Try again.");
                break;
        }

    }

    public static String getRandomNumber() {
        Random rnd = new Random();
        int number = rnd.nextInt(999999);
        return String.format("%06d", number);
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public void setPhoneNum(String phoneNum) {
        this.phoneNum = phoneNum;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public void setDateOfBirth(String dob) {
        dateOfBirth = dob;
    }

    public void displayPersonalInfo() {
        System.out.println("Name: " + name);
        System.out.println("Date of birth: " + dateOfBirth);
        System.out.println("Email: " + email);
        System.out.println("Address: " + address);
        System.out.println("Phone Number: " + phoneNum);
        System.out.println();
    }

    public void addressCheck(String givenAddress) {
        do {
            if (givenAddress.equals(address) == true) {
                break;
            } else {
                System.out.println("Incorrect Address. Try Again");
                givenAddress = input.nextLine();
            }
        } while (givenAddress.equals(address) == false);
    }

    public void phoneNumCheck(String phoneNumber) {
        do {
            if (phoneNumber.equals(phoneNum) == true) {
                break;
            } else {
                System.out.println("Incorrect Phone Number. Try Again");
                phoneNumber = input.nextLine();
            }
        } while (phoneNumber.equals(phoneNum) == false);
    }
}
