package Test01;

import org.junit.Test;

import java.util.*;

/**
 * @author HXS
 * @create 2021-03-04 14:20
 */

/*
    // 集合框架概述
    1. 集合、数组都是对多个数据进行存储操作的结构，简称 JAVA容器
       说明：次数的存储，主要指的是内存层面的存储，不涉及持久化的存储   持久化 EX-  txt,avi,数据库

    2.1 数组存储多个数组方法的特点：
         一旦初始化以后，其长度就确定了
         数组一旦定义好，其元素的类型也就确立了，我们也就只能操作指定类型的数据     EX- String[], int[]

    2.2 数组存储多个数组方法的特点：
         一旦初始化以后，长度就不可修改
         数组中提供的方法非常有限，对于添加、删除、插入数据等操作，非常不便，效率不高
         获取数组中实际元素的个数的需求，数组没有现成的属性和方法可用
         数组存储数据的特点：有序、可重复.   对于无序、不可重复的需求，不能满足


    // 集合框架
        /---- Collection 接口：单列集合，用来存储一个一个的对象
            /---- List 接口：存储有序、不可重复的数据    —>  "动态数组"  没有长度限制
                /---- ArrayList, LinkList, Vector

            /---- Set 接口：存储无序，不可重复的数据     —>  "高中集合"
                /---- HashSet, LinkedHashSet, TreeSet

        /---- Map 接口：双列集合，用来存储一对 (key-value) 一对的数据     —>  函数 y = f(x)   可多对一
                /---- HashMap, LinkedHashMap, TreeMap, Hashtable, Properties


     // Collection 接口中的方法使用

 */
public class test01 {

    @Test
    public void test1(){

        Collection c1 = new ArrayList();

        // add(Object e)：将元素e添加到集合c1中
        c1.add("AA");
        c1.add("BB");
        c1.add(123); // 自动装箱
        c1.add(new Date());
        c1.add(new String("Tom"));
        c1.add(new Person("A",20));


        // size()：获取添加的元素的个数
        System.out.println(c1.size());


        // addAll()：将c2集合中的元素添加到当前的集合中
        ArrayList c2 = new ArrayList();
        c2.add(345);
        c2.add("CC");
        c1.addAll(c2);
        System.out.println(c1);


        // isEmpty()：判断当前集合是否为空
        // c1.isEmpty();


        // clear()：清空集合元素
        // c1.clear();


        // contains(Object obj)：判断当前集合是否包换obj
        // 我们在判断时，回去调用obj对象所在类的equals()
        boolean contains = c1.contains(123);
        System.out.println(contains);
        System.out.println(c1.contains(new String("Tom")));  //  true  # String 重写 equals 内容比较
        System.out.println(c1.contains(new Person("A", 20))); // false # 没有重写equals 方法 == 地址比较


        // containsAll(Collection c2)：判断形参c1中的所有元素是否都存在于当前集合中
        c1.containsAll(c2);
    }


    @Test
    public void test2(){

        Collection c1 = new ArrayList();
        c1.add(123);
        c1.add(345);
        c1.add(new Person("HSX",12));
        c1.add(new String("Tom"));
        c1.add(false);


        // remove(Object o)：从当前集合中删除obj元素
        c1.remove(123);
        c1.remove(new Person("HSX",12));
        System.out.println(c1);


        // removeAll(Collection c2)：从当前集合中移除c2中的所有元素
        Collection c2 = Arrays.asList(123,345);
        c1.remove(c2);
        System.out.println(c2);
    }

    @Test
    public void test3(){

        Collection c1 = new ArrayList();
        c1.add(123);
        c1.add(345);
        c1.add(new Person("HSX",12));
        c1.add(new String("Tom"));
        c1.add(false);


        // retainAll(c2)：c1,c2 求交集，保留相同的
        Collection c2 = Arrays.asList(123,345,789);
        c1.retainAll(c2);
        System.out.println(c1);


        // equals(Object obj)：要想返回true，需要当前集合和形参集合的元素都相同
        c1.equals(c2);   // 内容比较
    }

    @Test
    public void test4(){

        Collection c1 = new ArrayList();
        c1.add(123);
        c1.add(345);
        c1.add(new Person("HSX",12));
        c1.add(new String("Tom"));
        c1.add(false);


        // hashCode()：返回当前对象的哈希值
        System.out.println(c1.hashCode());


        // 集合 -> 数组 ：toArray()
        Object[] arr = c1.toArray();
        System.out.println(Arrays.toString(arr));

        // 拓展：数组 -> 集合
        List<String> list = Arrays.asList(new String[]{"AA", "BB", "CC"});
        System.out.println(list);

        // List<int[]> a1 = Arrays.asList(new int[]{1, 2, 3});  会将1,2,3 当作一个数组  # size 1
        List a2 = Arrays.asList(new Integer[]{1,2});  // 两个数组
        System.out.println(a2.size()); // 2


        // iterator()：返回Iterator 接口的实例，用于遍历集合元素
    }
}
