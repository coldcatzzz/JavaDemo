package oop.This;

/*
* 比较两个对象是否相等
* */

public class AnimalCompare {
    public static void main(String[] args) {
        Animal animal1 = new Animal("cat", 2);
        Animal animal2 = new Animal("cat", 2);
        System.out.println(animal1.compareTo(animal2));
    }
}

class Animal{
    String name;
    int age;

    public Animal(String name, int age){
        this.name = name;
        this.age = age;
    }

    public boolean compareTo(Animal ani){
        return this.name.equals(ani.name) && this.age == ani.age;
    }
}