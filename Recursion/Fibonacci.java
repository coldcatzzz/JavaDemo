package Recursion;

/*
   斐波那契数列
*  1 1 2 3 5 8 13 21 34 55
* */

public class Fibonacci {
    public static void main(String[] args) {
        Tools02 t = new Tools02();
        int result = t.get(6);
        System.out.println(result);
    }
}

class Tools02{
    public int get(int n){ // n为个数
        if (n == 1 || n == 2){
            return 1;
        }else {
            return get(n - 2) + get(n - 1);
        }
    }
}
