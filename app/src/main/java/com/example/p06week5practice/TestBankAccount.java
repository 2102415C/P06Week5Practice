package com.example.p06week5practice;

public class TestBankAccount {
    public static void main(String[] args)
    {
        //Create a new object from BankAccount Class
        BankAccount account1=new BankAccount("John Loh","S1234567D","123-123-123-1","Savings");
        BankAccount account2=new BankAccount("Varun Dada","S8888888A","321-321-321-3","Current");
        BankAccount account3=new BankAccount("Elsa Goh","S7654321D","113-113-113-2","Transfer");
        //This is to perform functions on Account1
        account1.activateAccount();
        account1.creditAccount(5000.00);
        account1.debitAccount(250.00);

        String account1OwnerName=account1.getName();
        double newBalance=account1.getBalance();
        System.out.println("The balance for "+account1OwnerName+": $"+newBalance);

        //This is to perform functions on Account2
        account2.activateAccount();
        account2.creditAccount(25000.00);

        String account2OwnerName=account2.getName();
        double newBalance2=account2.getBalance();
        System.out.println("The balance for "+account2OwnerName+": $"+newBalance2);

        //This is to perform function on Account3
        account3.activateAccount();
        account3.creditAccount(5000.00);
        account1.transferAmount(50.00,account3);

        //Printing of balance after transfer amount
        String account3OwnerName=account1.getName();
        double newBalance3=account1.getBalance();
        System.out.println("The balance for "+account3OwnerName+": $"+newBalance3);

        String account4OwnerName=account3.getName();
        double newBalance4=account3.getBalance();
        System.out.println("The balance for "+account4OwnerName+": $"+newBalance4);

    }
}
