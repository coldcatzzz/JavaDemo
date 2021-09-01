package com.oop.test.abstract_.abtractExercise;

public class Manage extends Employee{
    private double bonus;
    public Manage(String name, int id, double salary,double bonus) {
        super(name, id, salary);
        this.bonus = bonus;
    }

    @Override
    public String work() {
        return getName() + " 的工资为:" + (getSalary() + bonus);
    }
}
