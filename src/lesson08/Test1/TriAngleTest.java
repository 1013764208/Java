package lesson08.Test1;

/*
    练习：编写两个类，TriAngle和TriAngleTest，其中TriAngle类中声明私有的底边长base和高height，
        同时声明公共方法访问私有变量。此外，提供类必要的构造器。另一个类中使用这些公共方法，计算三角形的面积。
 */

public class TriAngleTest {
    public static void main(String[] args) {
        TriAngle t1 = new TriAngle();
//        TriAngle t1 = new TriAngle(2.0,2.4);   / 可以直接在构造器中初始化
        t1.setBase(2.0);
        t1.setHeight(2.4);
        System.out.println("base：" + t1.getBase() + " height: " + t1.getHeight());
    }
}
