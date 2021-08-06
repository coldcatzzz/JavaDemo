package com.test.polymorphic.polyParameter;

public class Worker extends Employee{
    public Worker(String name, double salary) {
        super(name, salary);
    }

    public void work(){
        System.out.println("name : " + getName() + " working...");
    }

    @Override
    public double getAnnual() {
        return super.getAnnual();
    }
}
