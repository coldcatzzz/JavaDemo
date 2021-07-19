package xyz;

import abc.Hello;

public class Main_hello {
    public static void main(String[] args) {
        Outer.StaticNested sn = new Outer.StaticNested();
        sn.hello();
        Person p = new Person();

    }

    public static class Person{
        private String firstName;
        private String lastName;


        public String getFirstName() {
            return firstName;
        }

        public void setFirstName(String firstName) {
            this.firstName = firstName;
        }

        public String getLastName() {
            return lastName;
        }

        public void setLastName(String lastName) {
            this.lastName = lastName;
        }
    }

}

class Outer{
    private static String NAME = "OUTER";

    private String name;

    Outer(String name){
        this.name = name;
    }

    static class StaticNested{
        void hello(){
            System.out.println("Hello," + Outer.NAME);
        }
    }
}


