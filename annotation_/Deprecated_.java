package annotation_;

/*
* 用于版本更新
* */

public class Deprecated_ {
    public static void main(String[] args) {
        A a = new A();
        a.play();
        System.out.println(a.num);
    }
}

@Deprecated
class A{
    private String name;
    @Deprecated
    public int num;

    @Deprecated
    public void play(){
        System.out.println("play...");
    }
}
