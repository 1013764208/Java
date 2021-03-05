package Test02;

import Test01.Person;
import org.junit.Test;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;

/**
 * @author HXS
 * @create 2021-03-04 18:51
 */

/*
    /---- Collection 接口：单列集合，用来存储一个一个的对象
                /---- List 接口：存储有序、不可重复的数据    —>  "动态数组"  没有长度限制，替换原有的数组
                    /---- ArrayList：作为List接口的主要实现类，线程不安全，效率高；底层使用Object[] 存储
                    /---- LinkedList：对于频繁的插入删除，使用此类效率比ArrayList高；底层使用双向链表存储
                    /---- Vector：作为List接口的古老实现类，线程安全，效率低；底层使用Object[] 存储

    1. 面试题：ArrayList,LinkList,Vector 三者的异同 ?
       相同：三个类都是实现了List接口，存储数据的特点相同：存储有序，可重复的数据
       不同：见上

    2. ArrayList的源码分析：JDK7 情况如下
    2.1 ArrayList list = new ArrayList()     // 底层创建了长度为10的Object[]数组elementData
    2.2 list.add(123)  // elementDate[0] = new Integer(123)
        ...
        list.add(11)   // 如何此次添加导致底层elementDate数组容量不足，则扩展，默认扩容原来容量的1.5倍，
                         同时需要将原有的数组中的数据复制到新的数组中

    2.3 结论：建议开发中使用带参的构造器：ArrayList list = new ArrayList(int capacity)


    3. JDK8中 ArrayList 变化
    3.1 ArrayList list = new ArrayList()     // 底层Object[] elementData初始化为{}，并没有创建长度为10的数组
    3.2 list.add(123)    // 第一次调用add()时，底层才创建了长度为10的数组，并将数据123添加到element
        ...
       后续的添加和扩容与JDK7无异

    4. 小结：JDK7中的ArrayList的对象的创建类类似于单例的饿汉式，而JDK8中的ArrayList的对象的创建类似于单例的懒汉式，
            延迟了数组的创建，节省内存


    5. LinkedList的源码分析
        LinkedList list = new LinkedList() // 内部声明了Node类型的first和last属性，默认值为null
        list.add(123)   // 将123封装到Node中，创建了Node对象

        其中 Node 定义为 ： // 体现了LinkedList的双向链表的说法
        private static class Node<E> {
            E item;
            Node<E> next;
            Node<E> prev;

            Node(Node<E> prev, E element, Node<E> next) {
                this.item = element;
                this.next = next;
                this.prev = prev;
            }
        }


    6. Vector 的源码分析，JDK7和JDK8中通过Vector()构造器创建对象，底层都创建了长度为10的数组
       在扩容方面，默认扩容为原来的数组长度的2倍


    7. List接口的常用方法


 */
public class test02 {
    /*
        void add(int index, Object ele):在index位置插入ele元素
        boolean addAll(int index, Collection eles):从index位置开始将eles中的所有元素添加进来
        Object get(int index):获取指定index位置的元素
        int indexOf(Object obj):返回obj在集合中首次出现的位置
        int lastIndexOf(Object obj):返回obj在当前集合中末次出现的位置
        Object remove(int index):移除指定index位置的元素，并返回此元素
        Object set(int index, Object ele):设置指定index位置的元素为ele
        List subList(int fromIndex, int toIndex):返回从fromIndex到toIndex位置的子集合

        总结：常用方法
         增：add(Object obj)
         删：remove(int index) / remove(Object obj)
         改：set(int index, Object ele)
         查：get(int index)
         插：add(int index, Object ele)
         长度：size()
         遍历：1. Iterator 迭代器   2. foreach
     */
    @Test
    public void test1(){
        ArrayList a1 = new ArrayList();
        a1.add(123);
        a1.add(345);
        a1.add("AA");
        a1.add(false);
        a1.add(new Person("Tom",13));

        System.out.println(a1.toString());

        // void add(int index, Object ele):在index位置插入ele元素
        a1.add(1,"CC");
        System.out.println(a1.toString());

        // boolean addAll(int index, Collection eles):从index位置开始将eles中的所有元素添加进来
        List l1 = Arrays.asList(1,2,3);
        a1.addAll(l1);
        System.out.println(a1.size());

        // Object get(int index):获取指定index位置的元素
        Object o = a1.get(1);
        System.out.println(o);

        // int indexOf(Object obj):返回obj在集合中首次出现的位置，如果不存在return -1
        System.out.println(a1.indexOf("CC"));

        // int lastIndexOf(Object obj):返回obj在当前集合中末次出现的位置
        System.out.println(a1.lastIndexOf(123));

        // Object remove(int index):移除指定index位置的元素，并返回此元素
        System.out.println("remove: " + a1.remove(4));  // 按索引删除
        System.out.println(a1.remove("AA"));  // 按内容删除

        // Object set(int index, Object ele):设置指定index位置的元素为ele
        a1.set(0,"HSX");

        // List subList(int fromIndex, int toIndex):返回从fromIndex到toIndex位置的子集合   左闭右开
        List list = a1.subList(0, 4);  // 不会对本身的集合造成影响
        System.out.println(list);
    }


    // 遍历
    @Test
    public void test2(){
        ArrayList a1 = new ArrayList();
        a1.add(123);
        a1.add(345);
        a1.add("AA");

        // 方式 1：Iterator 迭代器
        Iterator iterator = a1.iterator();
        while (iterator.hasNext())
            System.out.println(iterator.next());

        // 方式 2：foreach
        for (Object obj : a1)
            System.out.println(obj);

        // 方式 3：
        for (int i = 0; i < a1.size(); i++) {
            System.out.println(a1.get(i));
        }
    }
}
