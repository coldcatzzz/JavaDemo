package com.test.smallchange;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

public class SmallChangeSys {
    public static void main(String[] args) {
        boolean loop = true; // 控制循环
        Scanner scanner = new Scanner(System.in);
        String key = "";
        String details = "------------零钱通明细------------\n";
        double money = 0.0;  //收益
        double balance = 0.0;  //余额
        Date date = null;
        double consume = 0.0;

        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");

        do {
            System.out.println("------------零钱通系统------------");
            System.out.println("\t\t\t1 零钱通明细");
            System.out.println("\t\t\t2 收益入账");
            System.out.println("\t\t\t3 消费");
            System.out.println("\t\t\t4 退出");

            System.out.println("请选择(1-4):");

            key = scanner.next();

            switch (key){
                case "1" :
                    System.out.println(details);
                    break;
                case "2" :
                    System.out.println("收益入账金额:");
                    money = scanner.nextDouble();
                    balance += money;
                    date = new Date();
                    details += "\n收益入账\t" + money + "\t" + sdf.format(date) + "\t余额:" + balance;
                    break;
                case "3" :
                    System.out.println("消费金额:");
                    consume = scanner.nextDouble();
                    balance -= consume;
                    details += "\n消费金额\t" + consume + "\t" + sdf.format(date) + "\t余额:" + balance;

                    break;
                case "4" :
                    System.out.println("4 退出");
                    loop = false;
                    break;
                default:
                    System.out.println("输入内容有误，请重新输入");
            }
        }while (loop);
        System.out.println("退出了系统...");
    }
}
