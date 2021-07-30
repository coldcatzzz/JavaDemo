package com.test.extend_.extendsDetails;

public class Son extends Father{

    private double score;

    public Son() {
    }

    public Son(String name, int age, double score){
        super(name,age);
        this.name = name;
        this.age = age;
        this.score = score;
    }

    public double getScore() {
        return score;
    }

    public void fa(){
        System.out.println("son fa()...");
    }

    public void so(){
        System.out.println("so()...");
        this.fa();
    }
}
