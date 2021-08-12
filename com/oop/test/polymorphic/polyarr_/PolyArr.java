package com.oop.test.polymorphic.polyarr_;

/*
* 动态数组
* 编译状态一直是Person[] 运行类型是Person Student Teacher
*
* 通过向下转型 调用子类的特有方法
* */

public class PolyArr {
    public static void main(String[] args) {
        Person[] persons = new Person[5];
        persons[0] = new Person("Jack", 66);
        persons[1] = new Student("Tom", 18, 99);
        persons[2] = new Student("Jemmy", 22, 88);
        persons[3] = new Teacher("Smith", 33, 8888);
        persons[4] = new Teacher("White", 44, 9999);

        for (Person p :persons
             ) {
            System.out.println(p.say());
            if (p instanceof Student){
                ((Student) p).study();
            }
            if (p instanceof Teacher){
                ((Teacher)p).teach();
            }
        }
    }
}
