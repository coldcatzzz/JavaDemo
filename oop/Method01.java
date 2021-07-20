package oop;

public class Method01 {
    public static void main(String[] args) {
        Person p = new Person();
        p.speak();
        p.cal01();
        p.cal02(100);
        System.out.println(p.cal03(100, 200));
    }
}

class Person{
    String name;
    int age;

    public void speak(){
        System.out.println("我是一个好人");
    }

    public void cal01(){
        int sum = 0;
        for (int i = 1; i <= 1000; i++){
            sum += i;
        }
        System.out.println(sum);
    }

    public void cal02(int n){
        int sum = 0;
        for (int i = 1; i <= n; i++){
            sum += i;
        }
        System.out.println(sum);
    }

    public int cal03(int num1 , int num2){
        return num1 + num2;
    }

}
