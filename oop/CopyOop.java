package oop;

public class CopyOop {
    public static void main(String[] args) {
        PersonCopy p = new PersonCopy();
        p.name = "xiao.ming";
        p.age = 66;

        Tools tool = new Tools();
        PersonCopy person2 = tool.copyPerson(p);
        System.out.println("p:" + p.age);
        System.out.println("p2:" + person2.age);
        System.out.println(person2 == p);
    }
}

class PersonCopy{
    String name;
    int age;
}

class Tools {
    public PersonCopy copyPerson(PersonCopy personCopy){
        PersonCopy p2 = new PersonCopy();
        p2.name = personCopy.name;
        p2.age = personCopy.age;
        return p2;
    }
}