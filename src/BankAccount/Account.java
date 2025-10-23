package BankAccount;

import java.util.Scanner;

public class Account {
    String number;
    String name;
    int balance;

public Account(String accountNumber,String ownerName, int accountBalance){
    number = accountNumber;
    name = ownerName;
    balance = accountBalance;
}
    public void displayAccount(){
        System.out.println("On your balance:"+balance+"rub");

    }
    public void deposit(){
        System.out.println("Enter sum:");
        Scanner console = new Scanner(System.in);
        int a = console.nextInt();
        int count = balance+a;
        System.out.println("On your balance:"+count+" Rub.");


    }
    public void withdraw(){
        System.out.println("Enter sum:");
        Scanner console = new Scanner(System.in);
        int a = console.nextInt();
        if(a<balance) {
            int count = balance - a;
            System.out.println("On your balance:" + count + " Rub.");
        }
        else {
            System.out.println("There are not enough money in your balance :(");
        }
    }
    public void getName(){
        System.out.println("Owner name: " + name);
    }
    public void getAccount(){
        System.out.println("Account number: "+ number);
    }
    public void getBalance(){
        System.out.print("On your balance: " + balance);
    }


}

