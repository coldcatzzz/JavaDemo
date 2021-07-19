package myNewTest;

import java.util.Scanner;

public class ArrayAdd02 {
    public static void main(String[] args) {
        int arr[] = new int[]{1,2,3};
        Scanner scanner = new Scanner(System.in);
        do {
            int arr2[] = new int[arr.length + 1];

            for (int i = 0; i < arr.length; i++){
                arr2[i] = arr[i];
            }
            System.out.println("请输入你想添加的数字:");
            int newNum = scanner.nextInt();
            arr2[arr2.length - 1] = newNum;
            arr = arr2;
            for (int a:arr
                 ) {
                System.out.print(a + " ");
            }
            System.out.println("你是否想继续添加 y/n : ");
            String ifAdd = scanner.next();
            if (ifAdd.equals("n")){
                break;
            }
        }while (true);
        System.out.println("break!");
    }
}
