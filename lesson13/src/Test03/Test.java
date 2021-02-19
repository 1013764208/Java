package Test03;

import java.lang.reflect.WildcardType;

/*
    final：最终  # 太监类 没有子类, 不能被继承

    1. final 可以永安里修饰的结构：类、方法、变量

    2. final 用来修饰一个类：此类不能被其他类所继承
    2.1 EX- String,System,StringBuffer

    3. final 修饰方法：此方法不能被重写
    3.1 EX- Object.getClass

    4. final 用来修饰变量：此时的 "变量" 就称为 "常量"
    4.1 final 修饰属性：可以考虑赋值的位置有：显式初始化、代码块中赋值
    4.2 final 修饰局部变量
    4.21 尤其是使用final 修饰形参是，表明此形参是一个常量。当我们调用此方法时，给常量形参赋一个实参
         一旦赋值以后，就只能在方法体内使用此形参，但不能重新赋值

    5. static final 用来修饰属性：全局常量

 */
public class Test {

    // 显式赋值
    final int LEFT = 1;

    final int WIDTH;

    // 代码块赋值
    {
        WIDTH = 20;
    }

    // 构造器赋值
    public Test(){
        int LEFT = 20;
    }

    public void show(){
        final int NUM = 10; // 常量
//        NUM++
    }

    public void show(final int num){
        System.out.println(num);
//        num++;
    }

    public static void main(String[] args) {
        Test t1 = new Test();
        t1.show(12);
        

    }
}
