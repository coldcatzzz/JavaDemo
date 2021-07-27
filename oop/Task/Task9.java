package oop.Task;

public class Task9 {
    public static void main(String[] args) {
        Employee employee = new Employee("Jack", '男', 33, "组长", 1800);
    }
}

class Employee{
    String name;
    char sex;
    int age;
    String emp;
    double salary;


    public Employee(String name, char sex, int age, String emp, double salary) {
        this.name = name;
        this.sex = sex;
        this.age = age;
        this.emp = emp;
        this.salary = salary;
    }

    public Employee(String name, char sex, int age) {
        this.name = name;
        this.sex = sex;
        this.age = age;
    }

    public Employee(String emp, double salary) {
        this.emp = emp;
        this.salary = salary;
    }

}
