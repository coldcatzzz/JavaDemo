package com.oop.test.houserent.service;

import com.oop.test.houserent.domain.House;

public class HouseService {

    private House[] houses;  //保存House对象
    private int houseNums = 1; //记录当前有多少个房屋信息
    private int idCounter = 1; //记录当前的id增长到哪个值

    public HouseService(int size) {
        houses = new House[size];  //创建HouseService对象的时候，指定数组大小

        //配合测试，初始化一个对象
        houses[0] = new House(1, "Jack", "13123", "上海市", 2000, "未出租");
    }

    //返回houses
    public House[] list(){
        return houses;
    }

    //add 方法 添加新对象 返回boolean
    public boolean add(House newHouse){
        if (houseNums == houses.length){
            System.out.println("数组已满，不能再继续添加了");
            return false;
        }
        //把newHouse对象加入，新增加了一个房屋
        houses[houseNums ++] = newHouse;
        newHouse.setId(++ idCounter);
        return true;
    }

    //del   删除房屋信息
    public boolean del(int delId){
        //先找到要删除的房屋信息对应的下表
        //下表不是房屋的编号
        int index = -1;
        for (int i = 0; i < houseNums; i++) {
            if (delId == houses[i].getId()){
                index = i;
            }
        }

        if (index == -1){ //delId 在数组中不存在
            System.out.println("不存在该编号");
            return false;
        }

        //找到id
        // 后一位迁移， 再把后一位置空
        for (int i = index; i < houseNums - 1; i++) {
            houses[i] = houses[i + 1];
        }
        houses[-- houseNums] = null;   //把当前存在房屋信息的最后一个置空（不一定是数组最后一个）
        return true;
    }
}