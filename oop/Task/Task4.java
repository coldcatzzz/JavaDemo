package oop.Task;

/*
* 复制数组
* */

public class Task4 {
    public static void main(String[] args) {
        A03 a = new A03();
        int[] arr = {1,2,3,4,5};
        a.copyArr(arr);
    }
}

class A03{
    public void copyArr(int[] arrOld){
        System.out.println("arrOld:" + arrOld);
        int[] arrNew = new int[arrOld.length];
        for (int i = 0; i < arrOld.length; i++){
            arrNew[i] = arrOld[i];
//            System.out.println(arrNew[i]);
        }
        System.out.println("arrNew:" + arrNew);
        for (int ss:arrNew
             ) {
            System.out.println(ss);
        }
    }
}
