package myNewTest;

public class AddBubble {
    public static void main(String[] args) {
        /*
        扩容 ， 冒泡
        * [1,3,5,7] - > [1,3,4,5,7]
        * */

        int arr[] = {1,3,5,7};
        int arr2[] = new int[arr.length + 1];

        for (int i = 0; i < arr.length; i++){
            arr2[i] = arr[i];
            arr2[arr.length] = 4;
        }
        for (int k = 0; k < arr2.length; k++){
            System.out.println(arr2[k]);
        }

        System.out.println("----------------------");

        int temp = 0;

        // arr2 = [1,3,4,5,7]

        for (int j = 0; j < arr2.length - 1; j++){
            for (int s = 0; s < arr2.length - 1 - j; s++){
                if (arr2[s] > arr2[s + 1]){
                    temp = arr2[s];
                    arr2[s] = arr2[s + 1];
                    arr2[s + 1] = temp;
                }
            }
            System.out.println(arr2[j]);
        }
        System.out.println(arr2[arr2.length - 1]);
    }
}
