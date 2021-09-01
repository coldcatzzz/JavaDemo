package designMode.single;

/*
 * 单例模式（饿汉式）   类加载， ff就被创建     （没有使用实例，都要创建）
 * 1. 将构造器私有化
 * 2. 在类的内部创建对象
 * 3. 提供一个公共的static方法，返回ff对象
 * */

public class SingleTon01 {
    public static void main(String[] args) {
        Friend friend = Friend.getInstance();
        System.out.println(friend);
    }
}

class Friend{
    private String name;

    private Friend(String name) {
        System.out.println("构造器被调用...");
        this.name = name;
    }

    static Friend ff = new Friend("孙悟空");

    public static Friend getInstance(){
        return ff;
    }

    @Override
    public String toString() {
        return name;
    }
}