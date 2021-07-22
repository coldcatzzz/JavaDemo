package oop.Constructor;

/*
* 可以创建多个类型的构造器（参数不同）
* */

public class Constructor01 {
    public static void main(String[] args) {
        Person person = new Person("Jack",18);
        System.out.println(person.name);
        System.out.println(person.age);

        Person person2 = new Person("Tom");
        person2.age = 22;
        System.out.println(person2.age);

        Person person3 = new Person();
        person3.name = "Smith";
        person3.age = 33;
        System.out.println(person3.name);
        System.out.println(person3.age);
    }
}

class Person{
    String name;
    int age;
    String address;
    char sex;

    public Person(String name, int age){
        System.out.println("构造器1被调用");
        this.name = name;
        this.age = age;
    }

    public Person(String name){
        System.out.println("构造器2被调用");
        this.name = name;
    }

    public Person(){
        System.out.println("构造器3被调用");
    }
}
