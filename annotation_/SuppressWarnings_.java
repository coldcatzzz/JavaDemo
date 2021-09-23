package annotation_;

/*
* 抑制警告
* */

import java.util.ArrayList;
import java.util.List;

public class SuppressWarnings_ {
    @SuppressWarnings("all")
    public static void main(String[] args) {
        List list = new ArrayList();
        list.add("孙悟空");
        list.add("猪八戒");
        list.add("沙和尚");
        System.out.println(list.get(1));
    }
}
