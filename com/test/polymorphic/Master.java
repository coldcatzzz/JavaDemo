package com.test.polymorphic;

public class Master {
    private String name;

    public Master(String name) {
        this.name = name;
    }

    public String getName()  {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    //使用多态
    public void feed(Animal animal, Food food){
        System.out.println("主人" + name + "给" + animal.getName() + "喂食" + food.getName());
    }

//    public void feed(Dog dog, Bone bone){
//        System.out.println("主人" + name + "给" + dog.getName() + "喂食" + bone.getName());
//    }
//
//    public void feed(Cat cat, Fish fish){
//        System.out.println("主人" + name + "给" + cat.getName() + "喂食" + fish.getName());
//    }
}
