package com.company;

public class CustomerList extends customerData{
    CustomerList(String Name, String phoneNum, String Dob, String emailAddress, String service) {
        super(Name, phoneNum, Dob, emailAddress, service);
    }
    public CustomerList() {
        super();
    }
    public void CustomerList (){
        //Accounting Firm
        //1. Customer database
        customerData data= new customerData("Alex Brown","414-512-6666","01/28/1990","alexbrown@gmail.com","Internal Audit");
        customerData data1= new customerData("Julie Kim", "410-612-3333", "02/28/1990", "juliekim@gmail.com","Business Tax");
        customerData data2 = new customerData("Will Smiths" ,"410-725-5555", "03/28/1990" ,"willsmiths@gmail.com","Individual Tax");
        customerData data3 =new customerData("Ann Choi","410-455-3322", "04/28/1990","annchoi@gmail.com","Consulting");
        data.Name(); data.phoneNum(); data.emailAddress(); data.Dob(); data.service();
        data1.Name(); data1.phoneNum(); data1.emailAddress(); data1.Dob(); data1.service();
        data2.Name(); data2.phoneNum(); data2.emailAddress(); data2.Dob();data2.service();
        data3.Name(); data3.phoneNum(); data3.emailAddress(); data3.Dob(); data3.service();
    }

}
