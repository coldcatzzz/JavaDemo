package com.oop.test.abstract_.abtractExercise;

public class AbstractExercise01 {
    public static void main(String[] args) {
        CommonEmployee tom = new CommonEmployee("tom", 1, 1000);
        System.out.println(tom.work());

        Manage smith = new Manage("smith", 1, 3000,1000);
        System.out.println(smith.work());
    }
}

abstract class Employee{
    private String name;
    private int id;
    private double salary;

    public Employee(String name, int id, double salary) {
        this.name = name;
        this.id = id;
        this.salary = salary;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    public abstract String work();

}
