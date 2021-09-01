package com.oop.test.abstract_.abtractExercise;

public class CommonEmployee extends Employee{

    public CommonEmployee(String name, int id, double salary) {
        super(name, id, salary);
    }

    @Override
    public String work() {
        return getName() + " 的工资为:" + getSalary();
    }

}
