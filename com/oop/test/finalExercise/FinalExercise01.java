package com.oop.test.finalExercise;

public class FinalExercise01 {
    public static void main(String[] args) {
        System.out.println(Circle.getArea(6));
    }
}

class Circle{
    private final static double PI1 = 3.14;
    private final static double PI2;
    private final  double PI3;

    static {
        PI2 = 3.14;
    }

    public Circle() {
        PI3 = 3.14;
    }

    public static double getArea(double r){
        return PI1 * r * r;
    }
}
