package myNewTestBase;

public class TwoDimensionalArray03 {
    public static void main(String[] args) {
        int arr[][] = new int[][]{{4,6},{1,4,5,7},{-2}};
        int sum = 0;
        for (int i = 0; i < arr.length; i++){
            for (int j = 0; j < arr[i].length; j++){
                System.out.println(arr[i][j]);
                sum += arr[i][j];
            }
        }
        System.out.println("sum:" + sum);
    }
}
