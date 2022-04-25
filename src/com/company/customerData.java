package com.company;

import java.util.Scanner;

public class customerData {
    String Name, address;
    int phoneNum;
    String full;
    customerData(String Name, int phoneNum, String address) {
        this.Name = Name;
        this.address = address;
        this.phoneNum = phoneNum;
        }
    public String customerData (String full) {
        this.full=full;
       return null;
    }
    public void Name() {
        System.out.println("Client's name: " + Name);
    }
    public void phoneNum() {
        System.out.println("Client's phone number: " + phoneNum);
    }
    public void Address() {
        System.out.println("Client's address: " + address);
    }
    public static void main(String[] args) {
    //Accounting Firm
    //1. Customer database
    customerData data= new customerData("Alex",9283,"6424 Circle Street");
    data.Name();
    data.phoneNum();
    data.Address();
    }
}
