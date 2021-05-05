package ConstructorsHomework;

public class MainClass {
    public static void main(String[] args) {
        BankAccount q = new BankAccount();
        System.out.println(q.balance);
        q.addToWallet(100);
        System.out.println(q.balance);
        q.getFromWallet(400);
        System.out.println(q.balance);

    }
}
