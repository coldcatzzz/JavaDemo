package oop.homework.homework10;

public class Teacher extends Person{
    private int work_age;

    public Teacher(String name, String sex, int age, int work_age) {
        super(name, sex, age);
        this.work_age = work_age;
    }

    public void teach(){
        System.out.println("我在讲课...");
    }

    @Override
    public String play() {
        return super.play() + "象棋";
    }



    @Override
    public String toString() {
        return "Teacher{" +
                "work_age=" + work_age +
                '}' + super.toString();
    }
}
