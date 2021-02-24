package lesson08_1;

import lesson08.Order;

public class OrderTest {
    public static void main(String[] args) {
        Order o = new Order();

          o.orderPublic = 2;
//        o.orderDefault = 1;   / 出了order类所属的包之后，private,缺省 都不能用
//        o.orderPrivate = 3;  / 出了Order类，私有的结构就不可以调用

          o.methodPublic();
//        o.methodDefault();  / 出了order类所属的包之后，private,缺省 都不能用
//        o.methodPrivate();  / 出了Order类，私有的结构就不可以调用
    }
}
