package Test02;

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

    面试题：ArrayList,LinkList,Vector 三者的异同 ?
    相同：三个类都是实现了List接口，存储数据的特点相同：存储有序，可重复的数据
    不同：见上

 */
public class test02 {
}
