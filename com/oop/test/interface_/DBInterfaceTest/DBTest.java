package com.oop.test.interface_.DBInterfaceTest;

public class DBTest {
    public static void main(String[] args) {
        Mysql mysql = new Mysql();
        Oracle oracle = new Oracle();

        DBTest.con(mysql);
        DBTest.con(oracle);
    }

    public static void con(DBInterface dbInterface){
        dbInterface.connect();
        dbInterface.close();
    }
}
