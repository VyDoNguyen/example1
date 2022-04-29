package com.company;
import java.time.format.DateTimeFormatter;
import java.time.LocalDateTime;
import java.util.Random;
import java.util.Scanner;

public class AccountDisplay extends AccountData {
    private double balance;
    private String address;
    private String name;
    private String idNumber;
    private double[] transactionCost;
    private String[] transactionDate;
    private String[] transactionPurpose;
    private String dateOfBirth;
    private String phoneNum;
    static DateTimeFormatter dtf = DateTimeFormatter.ofPattern("MM/dd/YYYY");
    static LocalDateTime now = LocalDateTime.now();
    private String randomNumber=getRandomNumber();
    Scanner input= new Scanner(System.in);

    public void AccountData() {

    }

    public void AccountDetails(String name){
        this.name=name;
        idNumber=name.substring(0,1)+randomNumber;
        setBalance();
        System.out.println("Welcome " + name);
        System.out.println("Today's Date "+ dtf.format(now));
        System.out.println("Account Number " +idNumber);
        System.out.println("Your account balance is $" + balance);
    }
    public void askForOptions(){
        int choice;
        do {System.out.println("Press 1 for Transaction History, Press 2 to deposit funds, Press 3 to withdraw funds, Press 4 for more account details, Press 5 to refresh first page, Press 0 to Quit");
            choice= input.nextInt();
            switch (choice){
                case (1):{ int i, j; for (i=0; i>transactionDate.length;i++){System.out.println(transactionDate[i]+ " " + transactionCost[i] + transactionPurpose[i]); break;}}
                case (2):System.out.println("How much do you want to deposit "); balance=balance+ input.nextDouble(); break;
                case (3):System.out.println("How much do you want to withdraw ");balance=balance- input.nextDouble(); break;
                case (4): System.out.println("Date of Birth: " + dateOfBirth); System.out.println("Address: " + address); System.out.println("Cell Phone: "+phoneNum); break;
                case (5): AccountDetails(name); break;
                default: System.out.println("Not an option. Try again.");


        }


    }while(choice!=0);}
    public static String getRandomNumber(){
        Random rnd = new Random();
        int number = rnd.nextInt(999999);
        return String.format("%06d", number);
    }
    public void setBalance(){
        balance=AccountData.balance;
    }


    public static void main(String[] args) {
        AccountDisplay accountDetails = new AccountDisplay();
        accountDetails.AccountDetails("John");
        accountDetails.askForOptions();
    }

    }




