package lesson07;
/*
    关于变量赋值
    如果变量为基本数据类型，此时赋值的是变量所保存的数据

 */
public class ValueTransfer {
    public static void main(String[] args) {

        System.out.println(" -------------基本数据类型---------------");
        int m = 10;
        int n = m;

        System.out.println("m = " + m + " n = " + n);
        n = 20;
        System.out.println("m = " + m + " n = " + n);

        System.out.println(" -------------引用数据类型---------------");

        Oder o1 = new Oder();
        o1.OderId = 1001;

        Oder o2 = o1; // 赋值以后，o1 和 o2 地址值相同，都指向堆空间中同一个对象实体
        System.out.println("o1.orderId: "+ o1.OderId + "  o2.orderId: "+ o2.OderId);

        o2.OderId = 1002;
        System.out.println("o1.orderId: "+ o1.OderId + "  o2.orderId: "+ o2.OderId);
    }
}
class Oder{
    int OderId;
}
