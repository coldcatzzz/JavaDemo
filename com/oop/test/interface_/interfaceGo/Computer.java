package com.oop.test.interface_.interfaceGo;

public class Computer {

    //接收 实现了 UsbInterface 接口的类的对象实例
    public void work(UsbInterface usbInterface){
        usbInterface.start();
        usbInterface.stop();
    }
}
