package oop.homework;

public class HomeWork01 {
    public static void main(String[] args) {
        Person[] persons = new Person[3];
        persons[0] = new Person("jack", 10, "java");
        persons[1] = new Person("tom", 50, "php");
        persons[2] = new Person("white", 30, "python");

        for (Person p :persons
             ) {
            System.out.println(p);
        }
        System.out.println("-----------------------------");

        Person tmp = null;

        for (int i = 0; i < persons.length - 1; i++) {
            for (int j = 0; j < persons.length - 1 - i; j++) {
                if (persons[i].getAge() < persons[i + 1].getAge()){
                    tmp = persons[i];
                    persons[i] = persons[i + 1];
                    persons[i + 1] = tmp;
                }
            }
        }

        for (Person p2 :persons
        ) {
            System.out.println(p2);
        }

    }
}

class Person{
    private String name;
    private int age;
    private String job;

    public Person(String name, int age, String job) {
        this.name = name;
        this.age = age;
        this.job = job;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getJob() {
        return job;
    }

    public void setJob(String job) {
        this.job = job;
    }

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", job='" + job + '\'' +
                '}';
    }
}
