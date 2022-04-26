package com.company;

import java.util.Scanner;

public class customerData {
    String Name, address, phoneNum, full;
    customerData(String Name, String phoneNum, String address) {
        this.Name = Name;
        this.address = address;
        this.phoneNum = phoneNum;
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
    customerData(String full) {
        this.full=full;
    }
     public void full() {
        System.out.println("Client's full information: " + full);
     }
    public static void main(String[] args) {
    //Accounting Firm
    //1. Customer database
    customerData data= new customerData("Alex Lee","972-975-8335","6424 Circle Street, Elkridge, MD 21075");
    customerData data1= new customerData("Jessi Jo, 240-412-2222, 720 Marble Street");
    data.Name();
    data.phoneNum();
    data.Address();
    data1.full();
    }
}
