package com.oop.test.houserent.view;

import com.oop.test.houserent.domain.House;
import com.oop.test.houserent.service.HouseService;
import com.oop.test.houserent.utils.Utility;

public class HouseView {
    private boolean loop; //控制循环
    private String key;  //接收用户输入
    private HouseService houseService = new HouseService(10); //设置数组大小为10

    //显示房屋列表
    public void listHouse(){
        System.out.println("---------------房屋列表---------------");
        System.out.println("编号\t房主\t电话\t地址\t月租\t状态(未出租/已出租)");
        House[] houses = houseService.list();
        for (int i = 0; i < houses.length; i++) {
            System.out.println(houses[i]);
        }
        System.out.println("---------------房屋列表显示完毕---------------");
    }

    public void mainMenu(){
        do {
            System.out.println("---------------房屋出租系统菜单---------------");
            System.out.println("\t\t\t1. 新 增 房 源");
            System.out.println("\t\t\t2. 查 找 房 屋");
            System.out.println("\t\t\t3. 删 除 房 屋 信 息");
            System.out.println("\t\t\t4. 修 改 房 屋 信 息");
            System.out.println("\t\t\t5. 房 屋 列 表");
            System.out.println("\t\t\t6. 退 出");

            System.out.println("请输入你的选择(1-6):");
            key = Utility.readString();
            switch (key) {
                case "1":
                    System.out.println("新 增");
                    break;
                case "2":
                    System.out.println("查 找");
                    break;
                case "3":
                    System.out.println("删 除");
                    break;
                case "4":
                    System.out.println("修 改");
                    break;
                case "5":
                    listHouse();
                    break;
                case "6":
                    System.out.println("退 出");
                    break;
            }

        }while (loop);
    }
}
