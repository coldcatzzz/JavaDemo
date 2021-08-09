package com.test.objectDetail;

public class EqualsExercise01 {
    public static void main(String[] args) {
        Person1 p1 = new Person1("Jack", 22, '男');
        Person1 p2 = new Person1("Jack", 23, '男');
        System.out.println(p1.equals(p2));
    }
}

class Person1{
    private String name;
    private int age;
    private char gender;

    public Person1(String name, int age, char gender) {
        this.name = name;
        this.age = age;
        this.gender = gender;
    }

    public boolean equals(Object obj){
        if (this == obj){
            return true;
        }
        if (obj instanceof Person1){
            //向下转型，为了拿到各属性
            Person1 p = (Person1)obj;
            return this.name.equals(p.name) && this.age == p.age && this.gender == p.gender;
        }
        return false;
    }
}
