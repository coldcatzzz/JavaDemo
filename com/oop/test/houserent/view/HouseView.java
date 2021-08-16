package com.oop.test.houserent.view;

import com.oop.test.houserent.domain.House;
import com.oop.test.houserent.service.HouseService;
import com.oop.test.houserent.utils.Utility;

public class HouseView {
    private boolean loop = true; //控制循环
    private String key;  //接收用户输入
    private HouseService houseService = new HouseService(2); //设置数组大小为10

    //显示房屋列表
    public void listHouse(){
        System.out.println("---------------房屋列表---------------");
        System.out.println("编号\t房主\t电话\t地址\t月租\t状态(未出租/已出租)");
        House[] houses = houseService.list();
        for (int i = 0; i < houses.length; i++) {
            if (houses[i] != null){
                System.out.println(houses[i]);
            }
        }
        System.out.println("---------------房屋列表显示完毕---------------" + "\n");
    }

    //添加房屋
    public void addHouse(){
        System.out.println("---------------添加房屋---------------");
        System.out.print("姓名:");
        String name = Utility.readString(10);
        System.out.print("电话:");
        String phone = Utility.readString(11);
        System.out.print("地址:");
        String address = Utility.readString(20);
        System.out.print("租金:");
        int rent = Utility.readInt();
        System.out.print("状态:");
        String state = Utility.readString(6);
        House newHouse = new House(0, name, phone, address, rent, state);
        if (houseService.add(newHouse)){
            System.out.println("---------------添加房屋成功---------------");
        }else {
            System.out.println("---------------添加房屋失败---------------");
        }

    }

    //编写delHouse() 接收输入的id，调用service的del()
    public void delHouse(){
        System.out.println("---------------删除房屋信息---------------");
        System.out.println("请输入待删除房屋的编号(-1退出):");
        int delId = Utility.readInt();
        if (delId == -1){
            System.out.println("---------------放弃删除房屋信息---------------");
            return;
        }
        char choice = Utility.readConfirmSelection();
        if (choice == 'Y'){
            if (houseService.del(delId)){
                System.out.println("---------------删除房屋信息成功---------------");
            }else {
                System.out.println("---------------房屋编号不存在，删除失败---------------");
            }
        }else {
            System.out.println("---------------放弃删除房屋信息---------------");
        }
    }

    //编写findHouse() 接收输入的id，调用service的find()
    public void findHouse(int findId){
        int index = 0;
        System.out.println("---------------查找房屋信息---------------");
        System.out.println("请输入查找的房屋的编号(-1退出):");
        int findKey = Utility.readInt();

        if (findKey == -1){
            System.out.println("---------------放弃查找房屋信息---------------");
            return;
        }


    }

    //退出系统
    public void exit(){
        char c = Utility.readConfirmSelection();
        if (c == 'Y'){
            loop = false;
        }
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
            key = Utility.readString(10);
            switch (key) {
                case "1":
                    addHouse();
                    break;
                case "2":
                    System.out.println("查 找");
                    break;
                case "3":
                    delHouse();
                    break;
                case "4":
                    System.out.println("修 改");
                    break;
                case "5":
                    listHouse();
                    break;
                case "6":
                    exit();
                    break;
            }
        }while (loop);
    }
}
