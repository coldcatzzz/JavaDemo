package com.oop.test.encap;

public class Account {
    private String name;
    private double balance;
    private String pass;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        if (name.length() >= 2 &&name.length() <= 4){
            this.name = name;
        }
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        if (balance > 20){
            this.balance = balance;
        }
    }

    public String getPass() {
        return pass;
    }

    public void setPass(String pass) {
        if (pass.length() == 6){
            this.pass = pass;
        }
    }
}
