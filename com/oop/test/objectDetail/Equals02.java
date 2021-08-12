package com.oop.test.objectDetail;

/*
* object 的equals方法,比较的是地址
* 子类中往往重写该方法，用语判断内容是否相等(Integer, String)
* */

public class Equals02 {
    public static void main(String[] args) {

    }

    public boolean equals(Object obj){
        return (this == obj);
    }
}

