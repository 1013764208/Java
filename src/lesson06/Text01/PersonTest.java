package lesson06.Text01;
/*
    练习：要求
    1. 创建Person类的对象，设置该对象的name、age和sex 属性，调用study 方法
       输出字符串 ”studying“，调用showAge（）方法显示age值
       调用addAge（）方法对对象的age属性增加2岁
    2. 创建第二个对象，执行上述操作，体会同一个类的不同对象之间关系
 */

public class PersonTest {
    public static void main(String[] args) {
        Person p1 = new Person();

        p1.name = "Tom";
        p1.age = 18;
        p1.sex = 1;

        p1.study();
        p1.showAge();

        int newAge = p1.addAge(2);
        System.out.println(p1.name + " age : " + newAge);

        System.out.println(p1.age); //20
    }
}
