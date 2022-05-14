package com.company;
import java.util.ArrayList;
import java.util.Scanner;




public class Main {
    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<>();
        IntroPage.IntroPage(list);
        AccountDisplay obj = new AccountDisplay();
        obj.AccountDetails(CustomerLoginPage.userName, CustomerLoginPage.userAddress, CustomerLoginPage.PhoneNumber,
                CustomerLoginPage.theUserEmail, CustomerLoginPage.TheUserDob);
    }
}

