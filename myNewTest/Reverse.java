package myNewTest;

public class Reverse {
    public static void main(String[] args) {
        int arr1[] = new int[]{1,2,3,4,5};
        int arr2[] = new  int[arr1.length];

        for (int i = arr1.length-1; i >= 0; i--){
            arr2[arr1.length - 1 - i] = arr1[i];
        }

        for (int a : arr2
             ) {
            System.out.println(a);
        }
    }
}
