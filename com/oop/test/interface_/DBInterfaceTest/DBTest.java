package com.oop.test.interface_.DBInterfaceTest;

public class DBTest {
    public static void main(String[] args) {
        Mysql mysql = new Mysql();
        Oracle oracle = new Oracle();
        DB db = new DB();

        db.con(mysql);
        db.con(oracle);
    }
}
