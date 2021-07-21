package Recursion;

/*
* 把多个汉诺塔盘子看成，最下面的一个和上面其他的 两部分
* */

public class HanoiTower {
    public static void main(String[] args) {
        Test05 t = new Test05();
        t.move(2, 'A', 'B', 'C');
    }
}

class Test05{
    public void move(int num, char a, char b, char c){
        if (num == 1){
            System.out.println(a + "->" + c);
        }else {
            move(num -1, a, c, b);
            System.out.println(a + "->" + c);
            move(num - 1, b, a, c);
        }
    }
}
