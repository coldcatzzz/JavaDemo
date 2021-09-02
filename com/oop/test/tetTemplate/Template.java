package com.oop.test.tetTemplate;

/*
* 抽象类模板
* */

abstract public class Template {
    public abstract void job();

    public void calculateTime(){
        long start = System.currentTimeMillis();
        job();
        long end = System.currentTimeMillis();
        System.out.println("时间:" + (end - start));
    }
}
