package designMode.single;

/*
* 单例模式 （懒汉模式）
* 当用户调用getInstance()时，才返回cat对象
* 若再次调用，返回的是上次的cat对象，保证单例
* */

public class SingleTon02 {
    public static void main(String[] args) {
        System.out.println(Cat.n1);
        System.out.println(Cat.getInstance());
    }
}

class Cat{
    private String name;
    private static Cat cat;
    public static int n1 = 99;

    private Cat(String name) {
        System.out.println("构造器被调用...");
        this.name = name;
    }

    public static Cat getInstance(){
        if (cat == null){
            cat = new Cat("小花猫");
        }
        return cat;
    }

    @Override
    public String toString() {
        return "Cat{" +
                "name='" + name + '\'' +
                '}';
    }
}