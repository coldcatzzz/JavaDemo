package oop.Task;

public class Task7 {
    public static void main(String[] args) {
        Dog dog = new Dog();
        dog.show();
    }
}

class Dog{
    String name = "xiao.hei";
    int age = 3;
    String color = "红色";

    public void show(){
        System.out.println("名字:" + this.name + " 年龄:" + this.age + " 颜色:" + this.color);
    }
}
