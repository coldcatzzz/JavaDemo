package oop;

public class IsOdd {
    public static void main(String[] args) {
        Odd odd = new Odd();
        boolean bResult = odd.isOdd(6);
        System.out.println(bResult);
    }
}

class Odd{
    public boolean isOdd(int n){
        boolean b = n % 2 == 0 ? true : false;
        return b;
    }
}