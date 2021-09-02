package com.oop.test.interface_.interfaceGo;

/*
* JDK 7.0 以前，接口里的方法都没有方法体，即抽象方法
* JDK 8.0 后，接口可以有静态方法，默认方法，也就是接口中可以有方法的具体实现
* */

public interface UsbInterface {
    public void start();
    public void stop();
}
