package enum_;

/*
* 对于季节，他的对象（具体值），是固定的春夏秋冬，不会有其他的
* 枚举：把具体的对象一个一个列举出来
* */

public class Enumeration01 {
    public static void main(String[] args) {

        Season spring = new Season("春天", "温暖");
        Season summer = new Season("夏天", "炎热");
        Season autumn = new Season("秋天", "凉快");
        Season winter = new Season("冬天", "寒冷");
        Season other = new Season("五月天", "哈哈");
        spring.setName("名称被修改");
        spring.setDesc("描述被修改");

    }
}

class Season{
    private String name;
    private String desc;

    public Season(String name, String desc) {
        this.name = name;
        this.desc = desc;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDesc() {
        return desc;
    }

    public void setDesc(String desc) {
        this.desc = desc;
    }
}
