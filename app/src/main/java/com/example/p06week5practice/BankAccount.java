package com.example.p06week5practice;

public class BankAccount {

    //These are all the properties that  a BankAccount needs
    String name;
    String nric;
    String accountNumber;
    String accountType;
    double balance;
    boolean activation;
    //This is the constructor to populate the necessary information
    public BankAccount(String _name, String _nric,
                       String _accountNumber, String _accountType)
    {
        this.name = _name;
        this.nric = _nric;
        this.accountNumber = _accountNumber;
        this.accountType = _accountType;
        this.balance = 0.0;
        this.activation = false;
    }
    public void activateAccount()
    {
        this.activation=true;
    }
    public void debitAccount(double amountToDebit)
    {
        this.balance-=amountToDebit;
    }
    public void creditAccount(double amountToCredit)
    {
        this.balance+=amountToCredit;
    }
    public void transferAmount(double amtToTransfer,BankAccount accountToTransfer)
    {
        this.debitAccount(amtToTransfer);
        accountToTransfer.creditAccount(amtToTransfer);
    }
    public double getBalance()
    {
        return this.balance;
    }
    public String getName()
    {
        return this.name;
    }
    public String getAccountType()
    {
        return this.accountType;
    }
}

