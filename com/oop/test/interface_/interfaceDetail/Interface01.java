package com.oop.test.interface_.interfaceDetail;

public class Interface01 {
    public static void main(String[] args) {
        A a = new A();
        a.hi();
    }
}

class A implements AInterface{
    @Override
    public void hi() {
        System.out.println("hi");
    }
}
