package myNewTest;

import java.util.Scanner;

public class ArrayReduce {
    public static void main(String[] args) {
        int arr[] = new int[]{1,2,3,4,5};
        Scanner scanner = new Scanner(System.in);
        for (int i = 0; i< arr.length; i++){
            System.out.print(arr[i] + " ");
        }
        do {
            if (arr.length >= 1){
                System.out.println("是否需要缩减数组: y / n : ");
                String input = scanner.next();
                if (input.equals("y")){
                    int arr2[] = new int[arr.length -1];
                    for (int i = 0; i < arr.length -1; i++){
                        arr2[i] = arr[i];
                    }
                    arr = arr2;
                    for (int i = 0; i< arr.length; i++){
                        System.out.print(arr[i] + " ");
                    }
                }else if(input.equals("n")){
                    System.out.println("end!");
                    break;
                }
            }else{
                System.out.println("不能再减少了");
                break;
            }
        }while (true);
    }
}
