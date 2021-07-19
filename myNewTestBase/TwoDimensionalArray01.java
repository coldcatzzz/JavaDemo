package myNewTestBase;

/*
* 二维数组
* */

public class TwoDimensionalArray01 {
    public static void main(String[] args) {
        int arr[][] = new int[][]{
                                    {1,2,3,4},
                                    {5,6,7,8},
                                    {9,1,3,5},
                                    {6,3,8,4}
                                    };

//        for (int i = 0; i< arr.length; i++){
//            for (int j = 0; j< arr[i].length; j++){
//                System.out.print(arr[i][j] + " ");
//            }
//        }
        for (int k = 0; k< arr.length; k++){
            System.out.println(arr[k][k]);
        }
    }
}
