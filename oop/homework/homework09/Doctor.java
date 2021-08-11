package oop.homework.homework09;

import javax.print.Doc;

public class Doctor {
    private String name;
    private int age;
    private String gender;
    private double salary;

    public Doctor(String name, int age, String gender, double salary) {
        this.name = name;
        this.age = age;
        this.gender = gender;
        this.salary = salary;
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

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    public boolean equals(Object obj){
        if (this == obj){
            return true;
        }

        if (!(obj instanceof Doctor)){
            return false;
        }

        Doctor doctor = (Doctor) obj;
        return this.name.equals(doctor.name) && this.age == doctor.age &&
                this.gender.equals(doctor.gender) && this.salary == doctor.salary;
    }
}
