package com.company;

import java.util.Date;
import java.util.Scanner;

public class customerinfor {
    String Name, emailAddress, phoneNum, full, Dob, service;
    customerinfor(String Name, String phoneNum, String Dob, String emailAddress, String service) {
        this.Name = Name;
        this.emailAddress = emailAddress;
        this.phoneNum = phoneNum;
        this.Dob= Dob;
        this.service=service;
        }
    public customerinfor() {
    }
    public void Name() {
        System.out.println(Name);
    }
    public void phoneNum() {
        System.out.println("Client's phone number: " + phoneNum);
    }
    public void emailAddress() {System.out.println("Client's email address: " + emailAddress);}
    public void Dob() {System.out.println("Client's date of birth: " + Dob);}
    public void service() { System.out.println("Service: "+ service);}
    customerinfor(String full) {
        this.full=full;
    }
     public void full() {
        System.out.println("Client's full information: " + full);
     }
}
