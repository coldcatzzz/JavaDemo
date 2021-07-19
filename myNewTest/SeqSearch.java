package myNewTest;

/*
* 顺序查找
* */

import java.util.Scanner;

public class SeqSearch {
    public static void main(String[] args) {
//        System.out.println("请输入你喜欢的老妖怪：");
//        String name[] = new String[]{"白眉鹰王","金毛狮王","紫衫龙王","青翼蝠王"};
//        Scanner scanner = new Scanner(System.in);
//        String input = scanner.next();
//
//        for (int i = 0; i < name.length; i++){
//            if (input.equals(name[i])){
//                System.out.println("find");
//                System.out.println("第" + (i + 1) + "个");
//            }
//        }
        int index = -1;
        do {
            String name[] = new String[]{"白眉鹰王","金毛狮王","紫衫龙王","青翼蝠王"};
            System.out.println("请输入你喜欢的老妖怪：");
            Scanner scanner = new Scanner(System.in);
            String input = scanner.next();

            for (int i = 0; i < name.length; i++){
                if (input.equals(name[i])){
                    System.out.println("find");
                    System.out.println("第" + (i + 1) + "个");
                    index = i;
                    System.out.println("end!");
                    break;
                }
            }
        }while (index == -1);
    }
}
