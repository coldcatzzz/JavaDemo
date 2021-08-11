package oop.homework.homework08;

public class BankAccount {
    private double balance;

    public BankAccount(int balance) {
        this.balance = balance;
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    //存款
    public void deposit(double amount){
        balance += amount;
    }

    //取款
    public void withdraw(double amount){
        balance -= amount;
    }

    public void show(){
        System.out.println(balance);
    }
}
