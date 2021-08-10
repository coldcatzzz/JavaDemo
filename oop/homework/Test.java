package oop.homework;

public class Test {

    public static void main(String[] args) {
        Teacher teacher = new Teacher("White", 33, "high", 9999);
        Teacher professor = new Professor("black", 44, "low", 2000);
        Teacher associateProfessor = new Professor("smith", 55, "low", 6000);
        Teacher lecturer = new Professor("tom", 66, "low", 5555);

        teacher.introduce();
        professor.introduce();
        associateProfessor.introduce();
        lecturer.introduce();
    }
}
