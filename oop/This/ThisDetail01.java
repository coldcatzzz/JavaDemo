package oop.This;

public class ThisDetail01 {
    public static void main(String[] args) {
        T t = new T();
    }
}

class T{
    public T(){
        this("Jack",2); //构造器中用this访问另外一个构造器，需要把语句放在第一位
        System.out.println("T()构造器");
    }

    public T(String name, int age){
        System.out.println("T(String name, int age)构造器");
        System.out.println(name);
        System.out.println(age);
    }
}
