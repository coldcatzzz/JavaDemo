package oop.homework;

public class Professor extends Teacher{
    public Professor(String name, int age, String post, double salary) {
        super(name, age, post, salary);
    }

    @Override
    public void introduce() {
        System.out.println("name:" + getName() + " age:" + getAge() + " post:" + getPost() + " salary:" + getSalary() * 1.3);
    }
}
