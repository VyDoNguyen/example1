package com.company;

public class UnassignedClients {
   public String fullName, phoneNum, emailAddress, Dob, service;
public void clientInformation() {
System.out.println("Client's name: "+ fullName +"\n"+ "Phone number: " + phoneNum +"\n"+ "Email Address: " + emailAddress +"\n"+"Date of birth: "+ Dob + "\n"+"Service: "+ service);
    }
public void setFullName(String fullName) { this.fullName=fullName;}
public void setPhoneNum(String phoneNum) {this.phoneNum = phoneNum;}
    public void setDob(String dob) {this.Dob = dob;}
    public void setEmailAddress(String emailAddress) {this.emailAddress = emailAddress;}
    public void setService(String service) {this.service = service;}
}