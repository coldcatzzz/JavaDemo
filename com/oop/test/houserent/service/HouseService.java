package com.oop.test.houserent.service;

import com.oop.test.houserent.domain.House;

public class HouseService {
    private House[] houses;  //保存House对象

    public HouseService(int size) {
        houses = new House[size];  //创建HouseService对象的时候，指定数组大小

        //配合测试，初始化一个对象
        houses[0] = new House(1, "Jack", "13123", "上海市", 2000, "未出租");
    }

    //返回houses
    public House[] list(){
        return houses;
    }
}
