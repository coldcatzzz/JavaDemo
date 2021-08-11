package oop.homework.homework08;

public class Test {
    public static void main(String[] args) {
        CheckAccount checkAccount = new CheckAccount(1000);
        checkAccount.deposit(10);
        checkAccount.show();
        checkAccount.withdraw(9);
        checkAccount.show();

    }
}
