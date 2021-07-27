package oop.Task;

public class Task6 {
    public static void main(String[] args) {
        Cale cale = new Cale();
        System.out.println(cale.sum());
        System.out.println(cale.sub());
        System.out.println(cale.multiply());
        System.out.println(cale.chu());
    }
}

class Cale{
    double num1 = 2.2;
    double num2 = 3.3;

    public double sum(){
        return num1 + num2;
    }

    public double sub(){
        return num1 - num2;
    }

    public double multiply(){
        return num1 * num2;
    }

    public double chu(){
        if (num2 == 0){
            System.out.println("除数不得为0");
        }
        return num1 / num2;
    }
}