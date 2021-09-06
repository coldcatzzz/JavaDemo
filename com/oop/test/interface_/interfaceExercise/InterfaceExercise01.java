package com.oop.test.interface_.interfaceExercise;

public class InterfaceExercise01 {
    public static void main(String[] args) {
        C c = new C();
        c.pX();
    }
}

interface A{
    int x = 0;
}

class B{
    int x = 1;
}

class C extends B implements A{
    public void pX(){
//        System.out.println(x);   //错误  不知道 x 是属于父类还是接口
        //访问接口的属性
        System.out.println(A.x);

        //访问父类的属性
        System.out.println(super.x);
        System.out.println(new B().x);
    }
}