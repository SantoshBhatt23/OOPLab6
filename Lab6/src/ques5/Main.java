package ques5;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Bank sbi = new Bank();
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the deposit amount: ");
        int depositAmount = input.nextInt();
        System.out.println("Enter the current balance: ");
        int currBal = input.nextInt();
        currBal = sbi.deposit(depositAmount,currBal);
        System.out.println("The new balance in your account: "+currBal);

        System.out.println("Enter the amount you want to withdraw");
        int withdrawAmount = input.nextInt();
        currBal = sbi.withdraw(withdrawAmount,currBal);
        System.out.println("The new balane in your count after withdrawal: "+ currBal);
    }
}
