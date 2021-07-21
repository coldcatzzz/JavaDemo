package Recursion;

public class Recursion01 {
    public static void main(String[] args) {
        Tools tools = new Tools();
        tools.test(5);
    }
}

class Tools{
    public void test(int n){
        if (n > 2){
            test(n - 1);
        }
        System.out.println(n);
    }
}
