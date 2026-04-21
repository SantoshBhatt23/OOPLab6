package ques5;

public class Bank {
    int deposit(int amount,int balance){
        return amount+balance;
    }
    int withdraw(int amount,int balance) {
        if (balance - amount >= 0) {
            return balance - amount;
        }
        return 0;
    }
}
