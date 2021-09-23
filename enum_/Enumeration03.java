package enum_;

public class Enumeration03 {
    public static void main(String[] args) {
        System.out.println(Season3.SPRING);
        Season3 autumn = Season3.AUTUMN;
        System.out.println(autumn.name()); //AUTUMN
        System.out.println(autumn.ordinal()); //2
        for (Season3 s:autumn.values()
             ) {
            System.out.println(s);
        }

        System.out.println(autumn.compareTo(Season3.SUMMER)); // 1
    }
}

//1. 使用enum 代替 class
enum Season3{

    //省略了 public static final
    //需要写在类的最前面
    SPRING("春天","温暖"),
    SUMMER("夏天","炎热"),
    AUTUMN("秋天","凉快"),
    WINTER("冬天","寒冷");

    private String name;
    private String desc;

    private Season3(String name, String desc) {
        this.name = name;
        this.desc = desc;
    }

    public String getName() {
        return name;
    }

    public String getDesc() {
        return desc;
    }

    @Override
    public String toString() {
        return "Season3{" +
                "name='" + name + '\'' +
                ", desc='" + desc + '\'' +
                '}';
    }
}



