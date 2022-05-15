package com.company;

public class AccountData extends AccountDisplay {
    private String name="Alex Brown";
    private String email="alexbrown@gmail.com";
    private String address="1000 Hilltop Cir, Baltimore, MD";
    private String phoneNum="414-452-6666";
    private String dateOfBirth="January 28, 1990";
    private String[] confirmedRequestedServices = new String[]{"Internal Audit"};
    private String[] assignedEmployees = new String[]{"Noah Fein"};

    public AccountData() {
        super();

    }
    public void getAccountData(){
        AccountDetails(name, address, phoneNum, email, dateOfBirth);
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


