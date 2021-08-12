package com.oop.test.override_.override_exercise;

public class Student extends Person{
    private int id;
    private double score;

    public Student(String name, int age, int id, double score) {
        super(name, age);
        this.id = id;
        this.score = score;
    }

    public String getInfo(){
        return super.getInfo() + " Id:" + id + " score:" + score;
    }
}
