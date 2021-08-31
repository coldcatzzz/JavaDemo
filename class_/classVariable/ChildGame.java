package class_.classVariable;

public class ChildGame {
    public static void main(String[] args) {
        Child child1 = new Child("小明");
        child1.join();
        child1.count ++;

        Child child2 = new Child("小张");
        child2.join();
        child2.count ++;

        Child child3 = new Child("小王");
        child3.join();
        child3.count ++;

        System.out.println("共有" + child1.count + "个小孩");
    }
}

class Child{
    private String name;
    public static int count = 0;

    public Child(String name) {
        this.name = name;
    }

    public void join(){
        System.out.println(name + " 加入了游戏");
    }
}
