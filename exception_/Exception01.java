package exception_;

public class Exception01 {
    public static void main(String[] args) {
        int num1 = 10;
        int num2 = 0;
        int res = 0;

        try {
            res = num1 / num2;
        } catch (Exception e) {
            System.out.println("异常的原因是:" + e.getMessage());
        }

        System.out.println(res);
    }
}
