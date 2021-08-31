package class_.classVariable;

/*
* 代码块
* 无论先调用哪个构造器，都先调用代码块
* 静态代码块在类被加载的时候调用
* 非静态代码块在创建对象时候调用
*
* 类什么时候被加载
* 1. 创建对象实例(new)
* 2. 创建子类对象实例，父类也会被加载
* 3. 使用类的静态成员时（静态属性，静态方法）
* */

public class codeBlock_ {
    public static void main(String[] args) {
        Movie movie1 = new Movie("泰坦尼克号");
        Movie movie2 = new Movie("野性的呼唤",39);
        Movie movie3 = new Movie("怦然心动",25,"尼导");
    }
}

class Movie{
    private String name;
    private int price;
    private String director;

    {
        System.out.println("屏幕打开");
        System.out.println("宣传视频");
        System.out.println("电影开始");
    }

    public Movie(String name) {
        System.out.println("Movie(String name)......");
        this.name = name;
    }

    public Movie(String name, int price) {
        System.out.println("Movie(String name, int price)......");
        this.name = name;
        this.price = price;
    }

    public Movie(String name, int price, String director) {
        System.out.println("Movie(String name, int price, String director)......");
        this.name = name;
        this.price = price;
        this.director = director;
    }
}
