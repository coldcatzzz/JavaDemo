package com.oop.test.extend_.super_;

public class B extends A{

    String name;
    int age;

    public B(){
        super();
    }

    public B(String name, int age){
        super(name,age);
    }

    public B(String name){
        super(name);
    }


    //访问父类属性,不能访问private
    public void hi(){
        System.out.println(super.n1 + " " + super.n2 + " " + super.n3);
    }

    //访问父类方法,不能访问private
    public void ok(){
        super.test100();
        super.test200();
        super.test300();
    }

}
