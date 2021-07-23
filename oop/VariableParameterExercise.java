package oop;

public class VariableParameterExercise {
    public static void main(String[] args) {
        MyMethods01 m = new MyMethods01();
        m.score("Jack", 70,80,90,88,55);
    }
}

class MyMethods01{
    public void score(String name, double... scores){
        System.out.println("姓名:" + name);
        double sum = 0;
        for (int i = 0; i < scores.length; i++){
            sum += scores[i];
            System.out.println("成绩分别为:" + scores[i]);
        }
        System.out.println("总成绩为:" + sum);
    }
}
