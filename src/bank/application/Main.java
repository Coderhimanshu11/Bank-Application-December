package bank.application;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        SBI.rateOfInterest = 7;
        HdfcBank.rateOfInterest = 6;
        SBI account1 = new SBI(100000, "123", "Dev");
        SBI account2 = new SBI(150000, "456", "Himanshu");
        HdfcBank account3 = new HdfcBank(150000, "789", "joni");
          // wrong password
        int balance = account1.checkBalance("124");

        System.out.println("The balance for account1 is " + balance);
        //right password
        int balanceCheck = account1.checkBalance("123");
        System.out.println("The balance for account1 is " + balanceCheck);
       //Add money
        String bankMessage = account2.addMoney(50000);
        System.out.println(bankMessage);
        //Wrong password retry
        String message = account3.withdrawMoney(1000, "1234");
        System.out.println(message);
        //right password
        String message1 = account3.withdrawMoney(1000, "789");
        System.out.println(message1);

       // double message3 = account1.calculateTotalInterest(20);
        double interest = account1.calculateTotalInterest(20);
        System.out.println("THe total interest you will get " + interest);
       //HDFC account
        double interest1 = account3.calculateTotalInterest(20);

        System.out.println("The total interest you will get " + interest1);
        System.out.println("Making it dynamic");
        System.out.println("Welcome to SBI,Please enter the detail tp create account");
        System.out.println("Enter the name:");
        Scanner sc=new Scanner(System.in);
        String name= sc.next();
        System.out.println("Enter balance:");
        int initialBalance= sc.nextInt();
        System.out.println("Enter password: ");
        String password=sc.next();
        SBI sbiAccount=new SBI(initialBalance,password,name);
        System.out.println("Enter money and password to add");

    }

    }

