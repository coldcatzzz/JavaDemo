package oop.Task;

public class Task2 {
    public static void main(String[] args) {
        A02 a = new A02();
        String[] arr = {"cat", "dog", "horse"};
        int result = a.find(arr, "horse");
        System.out.println(result);
    }
}

class A02{
    public int find(String[] arr, String sTest){
        for (int i = 0; i<arr.length; i++){
            if (arr[i].equals(sTest)){
                return i;
            }
        }
        return -1;
    }
}
