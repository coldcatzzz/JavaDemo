package com.test.extend_.extendsDetails;

public class Father {

    String name;
    int age;

    public Father() {
    }

    public Father(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public void getInfo(){
        System.out.println("name:" + name + " age:" + age);
    }

    public void fa(){
        System.out.println("fa()...");
    }

}
