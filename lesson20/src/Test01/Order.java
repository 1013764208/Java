package Test01;

import java.util.ArrayList;
import java.util.List;

/**
 * @author HXS
 * @create 2021-03-07 10:42
 */
public class Order<T> {

    String orderName;
    int orderId;

    // 类的内部结构就可以使用类的泛型
    T orderT;

    public Order(){

    }

    public Order(String orderName, int orderId, T orderT) {
        this.orderName = orderName;
        this.orderId = orderId;
        this.orderT = orderT;
    }

    // 如下的方法不是泛型方法
    public T getOrderT(){
        return orderT;
    }

    public void setOrderT(T orderT) {
        this.orderT = orderT;
    }


    // 泛型方法：在方法中出现了泛型的结构，泛型参数与类的泛型参数没有任何关系
    // 换句话说，泛型方法所属的类是不是泛型类都没有关系
    // 泛型方法，可以声明为静态的，原因：泛型参数是调用方法是确定的，并非在实例化时确定的
    public <E> List<E> copyFromArrayList(E[] arr){
        ArrayList<E> list = new ArrayList<>();
        for (E e : list) {
            list.add(e);
        }
        return list;
    }


    @Override
    public String toString() {
        return "Order{" +
                "orderName='" + orderName + '\'' +
                ", orderId=" + orderId +
                ", orderT=" + orderT +
                '}';
    }
}


