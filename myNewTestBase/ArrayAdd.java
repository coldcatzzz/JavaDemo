package myNewTestBase;

import java.util.Scanner;

public class ArrayAdd {
    public static void main(String[] args) {

        int arr1[] = new  int[]{1,2,3};
        int arr2[] = new int[arr1.length + 1];

        Scanner scanner = new Scanner(System.in);
        System.out.println("y or n:");
        String input = scanner.next();
        if (input.equals("y")){
            for (int i = 0; i< arr1.length; i++){
                arr2[i] = arr1[i];
                arr2[arr1.length] = 4;
            }

        }

        arr1 = arr2;

        for (int a1:arr1
             ) {
            System.out.println(a1);
        }

        for (int a2:arr2
             ) {
            System.out.println(a2);
        }
    }
}


