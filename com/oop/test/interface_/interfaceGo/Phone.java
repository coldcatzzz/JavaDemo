package com.oop.test.interface_.interfaceGo;

public class Phone implements UsbInterface{
    @Override
    public void start() {
        System.out.println("手机开始工作。。。");
    }

    @Override
    public void stop() {
        System.out.println("手机停止工作。。。");
    }
}
