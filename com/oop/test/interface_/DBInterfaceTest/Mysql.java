package com.oop.test.interface_.DBInterfaceTest;

public class Mysql implements DBInterface{
    @Override
    public void connect() {
        System.out.println("连接mysql");
    }

    @Override
    public void close() {
        System.out.println("关闭mysql");
    }
}
