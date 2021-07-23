package oop.This;

/*
* 通过hashcode() 检查this和对象是否一致
* */

public class This01 {
    public static void main(String[] args) {
        Dog dog = new Dog("da.huang", 3);
        System.out.println(dog.name);
        System.out.println(dog.age);
        System.out.println(dog.hashCode());
        dog.info();

        System.out.println("-------------------------");

        Dog dog2 = new Dog("xiao.bai", 2);
        System.out.println(dog2.name);
        System.out.println(dog2.age);
        System.out.println(dog2.hashCode());
        dog2.info();
    }
}

class Dog{
    String name;
    int age;

    public Dog(String name, int age){
        this.name = name;
        this.age = age;
        System.out.println("this.hashcode : " + this.hashCode());
    }

    public void info(){
        System.out.println("this.hashcode : " + this.hashCode());
        System.out.println(name + " " + age);
    }
}
