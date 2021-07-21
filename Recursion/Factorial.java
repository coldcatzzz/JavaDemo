package Recursion;

public class Factorial {
    public static void main(String[] args) {
        Test02 t = new Test02();
        int result = t.factorial(5);
        System.out.println(result);
    }
}

class Test02 {
    public int factorial(int n){
        if (n == 1){
            return 1;
        }else {
            return factorial(n -1 ) * n;
        }
    }
}
