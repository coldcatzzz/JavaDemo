package com.oop.test.extend_.ExtendsExercise;

public class Pc extends Computer{

    private String brand;

    public Pc(String cpu, int memory, int disk, String brand) {
        super(cpu, memory, disk);
        this.brand = brand;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public void getInfo(){
        System.out.println(getDetails() + " 品牌:" + getBrand());
    }

}
