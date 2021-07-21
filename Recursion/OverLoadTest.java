package Recursion;

public class OverLoadTest {
    public static void main(String[] args) {
        Test07 t = new Test07();
        int max = t.max(66, 12, 999);
        System.out.println(max);
    }
}

class Test07{
    public int max(int n1, int n2, int n3){
//        return n1 > n2 ? n1 : (n2 > n3 ? n2 : n3);
        return Math.max(n1, Math.max(n2, n3));
    }
}
