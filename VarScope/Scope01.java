package VarScope;

public class Scope01 {
    public static void main(String[] args) {
        Person p = new Person();
        p.say();
    }
}

class Person{
    String name = "Jack";

    public void say(){
//        String name = "Tom";
        System.out.println("Say " + name);
    }
}
