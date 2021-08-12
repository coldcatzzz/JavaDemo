package com.oop.test.encap;

public class AccountTest {
    public static void main(String[] args) {
        Account account = new Account();
        account.setName("Tom");
        account.setBalance(60.66);
        account.setPass("pass66");
        System.out.println("name:" + account.getName() + " balance:" + account.getBalance() + " pass:" + account.getPass());
    }
}
