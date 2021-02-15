package lesson10.test01;

public class OrderTest {
    public static void main(String[] args) {
        Order order = new Order();

        order.orderDefault = 1;
        order.orderProtected = 2;
//        order.oderPublic = 3;

        order.methodDefalut();
        order.methodProtected();
        order.methodPublic();

//        同一个包中其他类，不可以调用Order类中私有的属性、方法
//        order.orderPrivate = 4;
//        order.methodPrivate();
    }
}
