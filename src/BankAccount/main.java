package BankAccount;

import java.util.Scanner;

public class main {
    static void Main(String[] args) {
        Account account = new Account("2097-4776", "Pavel lysanov", 0);
        while (true) {
            System.out.println("choose operation:");
            System.out.println("1 - deposit money");
            System.out.println("2 - withdraw money");
            System.out.println("3 - info");
            System.out.println("4 - exit");
            Scanner console = new Scanner(System.in);

            int b = console.nextInt();
            if (b == 1) {
                account.deposit();
            }
            if (b == 2) {
                account.withdraw();
            }
            if (b == 3) {
                boolean back =true;
                while (back) {


                    System.out.println("choose operation:");
                    System.out.println("1 - Owner");
                    System.out.println("2 - Account number");
                    System.out.println("3 - Balance");
                    System.out.println("4 - Back");
                    int c = console.nextInt();
                    if (c == 1) {
                        account.getName();

                    }
                    if (c == 2) {
                        account.getAccount();
                    }
                    if (c == 3) {
                        account.getBalance();
                    }
                    if (c == 4) {
                        back= false;

                    }

                }
            }
            if (b==4){
                break;
            }


        }
    }
}
