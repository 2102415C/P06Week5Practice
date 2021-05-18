package com.example.p06week5practice;

public class TestBankAccount {
    public static void main(String[] args)
    {
        //Create a new object from BankAccount Class
        BankAccount account1=new BankAccount("John Loh","S1234567D","123-123-123-1","Savings");
        account1.activateAccount();
        account1.creditAccount(5000.00);
        account1.getBalance();
    }
}
