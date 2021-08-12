package com.oop.test.polymorphic.polyParameter;

public class Manager extends Employee{
    private double bounds;

    public Manager(String name, double salary, double bounds) {
        super(name, salary);
        this.bounds = bounds;
    }

    @Override
    public double getAnnual() {
        return super.getAnnual() + bounds;
    }

    public void manage(){
        System.out.println("name:" + getName() + " is managing...");
    }
}
