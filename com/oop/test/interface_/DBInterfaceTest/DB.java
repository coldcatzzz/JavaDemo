package com.oop.test.interface_.DBInterfaceTest;

//连接数据库类
public class DB {
    public void con(DBInterface dbInterface){
        dbInterface.connect();
        dbInterface.close();
    }
}
