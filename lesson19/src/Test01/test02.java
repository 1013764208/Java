package Test01;

import org.junit.Test;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;

/**
 * @author HXS
 * @create 2021-03-04 17:51
 */

/*
    集合元素的遍历操作，使用迭代器 Iterator 接口
    1. 内部的方法：hasNext()  和 next()
    2. 集合对象每次调用iterator() 方法都得到一个全新的迭代器对象，默认游标放置在 集合的第一个元素之前
    3. 内部定义 remove(), 可以在遍历时，删除集合中的元素，此方法不同于集合直接调用 remove
 */
public class test02 {

    @Test
    public void test1(){

        Collection c1 = new ArrayList();
        c1.add(123);
        c1.add(345);
        c1.add(new Person("HSX",12));
        c1.add(new String("Tom"));
        c1.add(false);

        Iterator iterator = c1.iterator();

        // 方式 1：
        System.out.println(iterator.next());

        // 方式 2：
        for (int i = 0; i < c1.size(); i++) {
            System.out.println(iterator.next());
        }

        // 方式 3：推荐
        while (iterator.hasNext()){                 // 判断是否还有下一个元素
            System.out.println(iterator.next());    // 指向下移，将下移以后集合位置上的元素返回
        }
    }


    // 测试Iterator中的remove()
    @Test
    public void test2(){
        Collection c1 = new ArrayList();
        c1.add(123);
        c1.add(345);
        c1.add(new Person("HSX",12));
        c1.add(new String("Tom"));
        c1.add(false);

        Iterator iterator = c1.iterator();
        while (iterator.hasNext()){
            Object o = iterator.next();
            if ("Tom".equals(o)){
                iterator.remove();
            }
        }

        Iterator iterator1 = c1.iterator();  // 需要重写获得 迭代器对象
        while (iterator1.hasNext()){
            System.out.println(iterator1.next());
        }
    }
}
