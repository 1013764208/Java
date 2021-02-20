package Test04;

import org.testng.annotations.Test;

public class SubClass extends SuperClass implements CompareA,Interface{
    public void method2(){
        System.out.println("SubClass: 上海");
    }

    @Test
    // 5. 如果在子类中（实现类）的方法中调用父类、接口中被重写的方法
    public void myMethod(){
        method2(); // 自己定义重写的方法
        super.method2(); // 调用父类中声明的
        Interface.super.method2();
    }
}
