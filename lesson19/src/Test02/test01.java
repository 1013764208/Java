package Test02;

import Test01.Person;
import javafx.beans.binding.ObjectExpression;
import org.junit.Test;

import java.util.ArrayList;
import java.util.Collection;

/**
 * @author HXS
 * @create 2021-03-04 18:30
 */

/*
    JDK5.0 新增 foreach 循环，用于遍历集合，数组
    1. foreach 只能遍历不能赋值     # 将容器中的值赋给新的变量，在输出

 */
public class test01 {

    @Test
    public void test1(){

        Collection c1 = new ArrayList();
        c1.add(123);
        c1.add(345);
        c1.add(new Person("HSX",12));
        c1.add(new String("Tom"));
        c1.add(false);

        // for (集合中元素的类型  局部变量 : 集合对象)
        // 内部仍然调用了迭代器
        for (Object obj : c1) {
            System.out.println(obj);
        }
    }

    @Test
    public void test2(){
        int[] arr = new int[]{1,2,3,4};
        // for (数组中元素的类型  局部变量 : 数组对象)
        for (int i : arr) {
            System.out.println(i);
        }
    }

    // 练习题
    @Test
    public void test3(){
        String[] arr = new String[]{"AA","AA","AA"};

        // 方式 1: 普通for赋值
        for (int i = 0; i < arr.length; i++) {
            arr[i] = "GG";
        }

        // 方式 2: 增强for循环
        // arr 将数组中的值，赋给 s, s = "G"时，arr数组值不变
        for (String s : arr) {
            s = "GG";
        }

        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);
        }
    }
}
