package Test01;

import org.junit.Test;

import java.util.List;

/**
 * @author HXS
 * @create 2021-03-07 10:46
 */


/*
    如何自定义泛型结构：泛型类、泛型接口；泛型方法

    1. 关于自定义泛型类，泛型接口


 */
public class test02 {

    @Test
    public void test1(){

        // 如果定义了泛型类，实例化没有指明类的泛型，则认为此泛型为Object类型
        // 要求：如果大家定义了类的带泛型，建议在实例化时要指名类的泛型
        Order order  = new Order();

        // 建议：实例化时指定类的泛型
        Order<String> order1 = new Order<String>("orderAA",1001,"order:AA");
    }

    @Test
    public void test2(){
        // subOrder 不再是泛型类，不需要写<Object>
        SubOrder subOrder = new SubOrder();

        // 由于子类在继承带泛型的父类时，指明了泛型类型，则实例化子类对象时，不再需要泛型
        subOrder.setOrderT(123);
    }

    @Test
    public void test3(){
        // SubOrder1 仍是泛型，需要填写<Object>
        SubOrder1<String> objectSubOrder1 = new SubOrder1<>();
    }


    // 测试泛型方法
    @Test
    public void test4(){
        Order<String> order = new Order<>();
        Integer[] arr = new Integer[]{1,2,3,4};
        // 泛型方法调用时，指明泛型参数的类型，与类的泛型没有关系
        List<Integer> integers = order.copyFromArrayList(arr);
        System.out.println(integers);
    }
}
