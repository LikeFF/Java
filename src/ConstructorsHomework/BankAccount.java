package ConstructorsHomework;

public class BankAccount {

    int balance = 1000;

    public int addToWallet(int x){
        balance += x;
        return balance;
    }

    public int getFromWallet(int a){
        balance -= a;
        return balance;
    }


}
