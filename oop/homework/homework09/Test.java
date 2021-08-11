package oop.homework.homework09;

public class Test {
    public static void main(String[] args) {
        Doctor doctor1 = new Doctor("White", 33, "男", 5555);
        Doctor doctor2 = new Doctor("White", 33, "男", 5555);
        System.out.println(doctor1.equals(doctor2));
    }
}
