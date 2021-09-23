package enum_;

/*自定义实现枚举*/

public class Enumeration02 {
    public static void main(String[] args) {
        System.out.println(Season2.SPRING);
        System.out.println(Season2.AUTUMN);
    }
}

//1. 将构造器私有化，防止在外部使用new
//2. 删除setXxx()，防止修改
class Season2{
    private String name;
    private String desc;

    //3. 创建对象
    //4. 优化，添加final修饰符
    public final static Season2 SPRING = new Season2("春天", "温暖");
    public final static Season2 SUMMER = new Season2("夏天", "炎热");
    public final static Season2 AUTUMN = new Season2("秋天", "凉快");
    public final static Season2 WINTER = new Season2("冬天", "寒冷");

    private Season2(String name, String desc) {
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
        return "Season2{" +
                "name='" + name + '\'' +
                ", desc='" + desc + '\'' +
                '}';
    }
}
