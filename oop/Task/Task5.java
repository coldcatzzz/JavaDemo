package oop.Task;

public class Task5 {
    public static void main(String[] args) {
        Circle circle = new Circle();
        System.out.println(circle.getPerimeter(3.3));
        System.out.println(circle.getArea(6.6));
    }
}

class Circle{
    double pi = 3.14;

    public double getPerimeter(double radius){ //周长
        return 2 * pi * radius;
    }

    public double getArea(double radius){ //面积
        return pi * radius *radius;
    }
}