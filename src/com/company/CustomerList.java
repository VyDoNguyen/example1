package com.company;

public class CustomerList extends customerinfor{
    CustomerList(String Name, String phoneNum, String Dob, String emailAddress, String service) {
        super(Name, phoneNum, Dob, emailAddress, service);
    }
    public CustomerList() {
        super();
    }
    public void CustomerList (){
        //Accounting Firm
        //1. Customer database
        customerinfor data= new customerinfor("Alex Brown","414-512-6666","01/28/1990","alexbrown@gmail.com","Internal Audit");
        customerinfor data1= new customerinfor("Julie Kim", "410-612-3333", "02/28/1990", "juliekim@gmail.com","Business Tax");
        customerinfor data2 = new customerinfor("Will Smiths" ,"410-725-5555", "03/28/1990" ,"willsmiths@gmail.com","Individual Tax");
        customerinfor data3 =new customerinfor("Ann Choi","410-455-3322", "04/28/1990","annchoi@gmail.com","Consulting");
        data.Name(); data.phoneNum(); data.emailAddress(); data.Dob(); data.service();
        data1.Name(); data1.phoneNum(); data1.emailAddress(); data1.Dob(); data1.service();
        data2.Name(); data2.phoneNum(); data2.emailAddress(); data2.Dob();data2.service();
        data3.Name(); data3.phoneNum(); data3.emailAddress(); data3.Dob(); data3.service();
    }

}
