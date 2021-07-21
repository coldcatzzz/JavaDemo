package Recursion;

/*
* 每天吃一半加一个，第十天发现还剩一个
* */

public class Peach {
    public static void main(String[] args) {
        Test03 t = new Test03();
        int peachNum = t.peach(1);
        System.out.println(peachNum);
    }
}

class Test03{
    public int peach(int day){
        if (day == 10){
            return 1;
        }else if (day >= 1 && day <= 9){
            return (peach(day + 1) + 1) * 2;
        }
        return -1;
    }
}
