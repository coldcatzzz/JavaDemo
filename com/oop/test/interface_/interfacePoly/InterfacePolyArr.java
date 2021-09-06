package com.oop.test.interface_.interfacePoly;

public class InterfacePolyArr {
    public static void main(String[] args) {

        //多态数组  接口类型数组
        Usb[] usbs = new Usb[2];
        usbs[0] = new Phone();
        usbs[1] = new Camera();

        //遍历数组，如果是相机对象，调用相机的特有方法

        for (int i = 0; i < usbs.length; i++) {
            usbs[i].work();
            if (usbs[i] instanceof Phone){
                ((Phone) usbs[i]).call();
            }
        }
    }
}

interface Usb{
    void work();
}

class Phone implements Usb{
    public void call(){
        System.out.println("手机在打电话。。。");
    }

    @Override
    public void work() {
        System.out.println("手机在工作中。。。");
    }
}

class Camera implements Usb{
    @Override
    public void work() {
        System.out.println("相机在工作中。。。");
    }
}
