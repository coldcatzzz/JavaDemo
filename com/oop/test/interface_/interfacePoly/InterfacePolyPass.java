package com.oop.test.interface_.interfacePoly;

public class InterfacePolyPass {
    public static void main(String[] args) {
        IG ig = new Tea();

        // 接口多态传递
        IH ih = new Tea();
    }
}

interface IH{
    void hi();
}
interface IG extends IH{}

class Tea implements IG{

    @Override
    public void hi() {

    }
}
