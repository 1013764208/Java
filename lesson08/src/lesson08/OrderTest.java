package lesson08;

public class OrderTest {
    public static void main(String[] args) {
        Order o = new Order();
        o.orderDefault = 1;
        o.orderPublic = 2;
//        o.orderPrivate = 3;  / 出了Order类，私有的结构就不可以调用

        o.methodDefault();
        o.methodPublic();
//        o.methodPrivate(); / 出了Order类，私有的结构就不可以调用
    }
}

