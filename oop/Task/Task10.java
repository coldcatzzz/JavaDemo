package oop.Task;

public class Task10 {
    public static void main(String[] args) {
        CircleTest c = new CircleTest();
        PassObject po = new PassObject();
        po.printArea(c, 5);
    }
}

class CircleTest{
    double pi = 3.14;
    double radius;

    public double getArea(){
        return pi * radius * radius;
    }
}

class PassObject{
    public void printArea(CircleTest c, int times){
        double pi = 3.14;
        double area = 0;
        for (int i = 1; i <= times; i++){
            area = pi * i *i ;
            System.out.println(area);
        }
    }
}
