package com.company;

public class AccountData extends AccountDisplay {
    private String name="Alex Brown";
    private String email="alexbrown@gmail.com";
    private String address="1000 Hilltop Cir, Baltimore, MD";
    private String phoneNum="410-455-1000";
    private String dateOfBirth="October 13 2000";
    private final String[] confirmedRequestedServices = new String[]{"Internal Audit"};
    private final String[] assignedEmployees = new String[]{"Noah Fein"};


    public AccountData(){
        super();
        AccountDetails(name, address, phoneNum, email, dateOfBirth);
        displayPersonalInfo();


    }
    public void displayRequests() {
        int i;
        System.out.println("Requested Services Assigned Employee");
        for (i = 0; i < confirmedRequestedServices.length; i++) {

            System.out.println(confirmedRequestedServices[i] + " " + assignedEmployees[i]);

        }
    }
    public static void main(String[] args) {
       new AccountData();
}}


