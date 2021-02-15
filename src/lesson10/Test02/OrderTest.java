package lesson10.Test02;

import lesson10.test01.Order;

public class OrderTest extends Order {
    public void method(){
        orderProtected = 1;
        orderPublic = 2;

//        不同包的子类中，不能调用Order类中声明为private和缺省权限的属性、方法
//        orderDefault = 3;
    }
}
