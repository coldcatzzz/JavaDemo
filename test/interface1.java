package test;

public class interface1 {
    public static void main(String[] args) {
        Student2 s = new Student2("Jack");
        s.run();
        System.out.println(s.getName());
    }
}

interface Person2{
    void run();
    String getName();
}

class Student2 implements Person2{
    private String name;

    Student2(String name) {
        this.name = name;
    }

    @Override
    public void run(){
        System.out.println("run...");
    }

    @Override
    public String getName(){
        return this.name;
    }
}