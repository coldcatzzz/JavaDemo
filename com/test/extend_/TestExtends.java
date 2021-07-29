package com.test.extend_;

/*
* 1.私有屬性和方法 在子類不能直接訪問，要通過父類提供的公共方法訪問
* 2.子类必须调用父类的构造器，完成父类的初始化   默认调用super() 无参
* 3.当创建子类对象时，不管使用子类的哪个构造器，默认情况下总会去调用父类的无参构造器，
*   如果父类没有提供无参构造器，则必须在子类的构造器中用super()去指定使用父类的哪个构造器
*   完成对父类的初始化工作
* 4.访问属性，就近原则
* */

public class TestExtends {
    public static void main(String[] args) {
        Pupil pupil = new Pupil();
        pupil.name = "小明";
        pupil.age = 10;
        pupil.testing();
        pupil.setScore(88);
        pupil.showInfo();

        Graduate graduate = new Graduate();
        graduate.name = "小強";
        graduate.age = 22;
        graduate.testing();
        graduate.setScore(99);
        graduate.showInfo();
    }
}
