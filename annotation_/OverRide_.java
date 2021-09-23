package annotation_;

public class OverRide_ {
    public static void main(String[] args) {
        Cat cat = new Cat();
        cat.cry();
    }
}

class Animal{
    public void cry(){
        System.out.println("Animal cry...");
    }
}

class Cat extends Animal{
    @Override
    public void cry(){
        System.out.println("Cat cry...");
        }
}
