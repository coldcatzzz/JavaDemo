package oop;

public class ArrReturn {
    public static void main(String[] args) {
        Method method = new Method();
        int[]  resArr = method.getSumAndSub(5, 3);
        System.out.println("sum : " + resArr[0]);
        System.out.println("sub : " + resArr[1]);
    }
}

class Method{
    public int[] getSumAndSub(int n1 , int n2){
        int[] resArr = new int[2];
        resArr[0] = n1 + n2;
        resArr[1] = n1 - n2;
        return resArr;
    }
}
