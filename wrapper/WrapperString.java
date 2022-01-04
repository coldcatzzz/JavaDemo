package wrapper;

public class WrapperString {
    public static void main(String[] args) {
        //包装类(Integer) -> String
        Integer i = 100; //自动装箱

        //way 1
        String str1 = i + "";   //i 不会被改变

        //way 2
        String str2 = i.toString();

        //way 3
        String str3 = String.valueOf(i);

        //String -> 包装类(Integer)
        String str4 = "12345";

        //way 1
        Integer i1 = Integer.parseInt(str4); //自动装箱

        //way 2
        Integer i2 = new Integer(str4); //构造器

    }
}
