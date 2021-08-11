package oop.homework.homework10;

public class Student extends Person{
    private int stu_id;

    public Student(String name, String sex, int age, int stu_id) {
        super(name, sex, age);
        this.stu_id = stu_id;
    }

    public void study(){
        System.out.println("我在学习...");
    }

    @Override
    public String play() {
        return super.play() + "足球";
    }

    @Override
    public String toString() {
        return "Student{" +
                "stu_id=" + stu_id +
                '}' + super.toString();
    }
}
