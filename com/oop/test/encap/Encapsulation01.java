package com.oop.test.encap;

/*
* 封装
* 隐藏实现细节
* 对输入数据进行检查
* */

public class Encapsulation01 {
    public static void main(String[] args) {
        Person person = new Person();
        person.setName("Jack");
        person.setAge(18);
        person.setSalary(8888);
        System.out.println(person.getInfo());

        Person smith = new Person("Smith.hhhh.hh.hhh.hhh", 2000, 6666);
        System.out.println(smith.getInfo());
    }
}

class Person{
    public String name;
    private int age;
    private double salary;

    public Person() {
    }

    public Person(String name, int age, double salary) {
        setName(name);
        setAge(age);
        setSalary(salary);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        if (name.length() >=2 && name.length() <= 6){
            this.name = name;
        }else {
            this.name = "无名氏";
        }
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        if (age >= 1 && age <= 120){
            this.age = age;
        }else {
            this.age = 18;
        }
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    public String getInfo(){
        return "信息为:" + "name:" + name + " age:" + age + " salary:" + salary;
    }
}
