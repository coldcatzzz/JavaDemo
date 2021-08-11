package oop.homework.homework10;

import com.sun.security.auth.callback.TextCallbackHandler;

public class Test {
    public static void main(String[] args) {
        Person person = new Person("吴亦凡", "男", 18);
        Person student = new Student("小明", "男", 13, 123212);
        Person teacher = new Teacher("苍井空", "女", 33, 10);
        System.out.println(student.play());
        System.out.println(teacher.play());

        Person[] persons = new Person[4];
        persons[0] = new Student("jack", "男", 10, 1122);
        persons[1] = new Student("tom", "男", 20, 2536);
        persons[2] = new Teacher("smith", "男", 36, 5);
        persons[3] = new Teacher("milan", "女", 26, 3);

        Test test = new Test();
        test.bubbleSort(persons);

        System.out.println("-------------------");
        for (Person p:persons
             ) {
            System.out.println(p);
        }

        //遍历数组
        System.out.println("--------------------");
        for (int i = 0; i < persons.length; i++) {
            test.array_test(persons[i]);
        }
    }

    public void array_test(Person p){
        if (p instanceof Student){
            ((Student) p).study();
        }else if (p instanceof Teacher){
            ((Teacher) p).teach();
        }else {
            System.out.println("do nothing");
        }
    }

    public void bubbleSort(Person[] persons){
        Person temp = null;
        for (int i = 0; i < persons.length - 1; i++) {
            for (int j = 0; j < persons.length - 1 - i; j++) {
                if (persons[j].getAge() < persons[j + 1].getAge()){
                    temp = persons[j];
                    persons[j] = persons[j + 1];
                    persons[j + 1] = temp;
                }
            }
        }
    }
}
