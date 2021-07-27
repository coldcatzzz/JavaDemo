package oop.Task;

public class Task11 {
    public static void main(String[] args) {
        Guess guess = new Guess();
        guess.game(1);
    }
}

class Guess{
    int num1;

    //  1 石头    2 剪刀    3  布
    public void game(int myNum){
        int count = 0;
        int win = 0;
        do {
            num1 = (int)Math.floor(Math.random() * 3 + 1);
            System.out.println(num1);
            if (num1 == myNum){
                System.out.println("平局");
            }else if (num1 == 2){
                System.out.println("你赢了");
                win++;
            }else {
                System.out.println("你输了");
            }
            System.out.println("总次数为:" + count);
        }while (count < 50);
        System.out.println(win);
    }
}
