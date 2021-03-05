package Test03;

import Test01.Person;
import org.junit.Test;

import java.util.HashSet;
import java.util.Iterator;

/**
 * @author HXS
 * @create 2021-03-05 11:37
 */


/*

// set接口的框架

   /---- Collection 接口：单列集合，用来存储一个一个的对象
          /---- Set 接口：存储无序，不可重复的数据     —>  "高中集合"
                  /---- HashSet：作为set接口的主要实现类；线程不安全；可以存储null值
                      /---- LinkedHashSet：作为Hashset的子类，遍历其内部数据时，可以按照添加的顺序遍历
                                           对于频繁的遍历操作，LinkedHashSet效率高
                  /---- TreeSet：可以按照添加对象的指定属性，进行排序

    1. Set接口中没有额外定义新的方法，使用的都是Collection中声明过方法
    2. 要求：向Set中添加的数据，其所在的类一定要重写hashcode() 和 equals()方法
       要求：重写的hashcode() 和 equals() 保持一致性：相等的对象必须具有相等的散列码
       重写两个方法的小技巧：对象中用作equals 方法比较的 Filed，都应该用来计算 hashCode



 */


public class test01 {
    /*
        1. Set：存储无序，不可重复的数据
           以 HashSet为例说明    # 散列函数
        1.1 无序性：不等于随机性。存储的数据在底层数组中并非按照数组索引的顺序添加，而是根据数据的哈希值决定的

        1.2 不可重复性：保证添加的元素按照equals()判断时，不能返回true，即：相同的元素只能添加一个


        2. 添加元素的过程，以HashSet 为例
            我们向HashSet 中添加元素a，首先调用元素a所在类的hashSet()方法，计算元素a的哈希值，此哈希值接着
            通过某种算法计算出HashSet底层数组中的存放位置（即为：索引位置），判断数组此位置上是否已经有元素：
                若此位置上没有其他元素：则元素a添加成功        —> 成功 情况 1
                若此位置上有其他元素b（或以链表形式存在多个元素），则比较元素a和元素b的hash值：
                    若哈希值不相同，则元素a添加成功           —> 成功 情况 2
                    若哈希值相同，进而调用元素a的equals()方法：
                        若equals() 返回true，元素a添加失败
                        若equals() 返回false，元素a添加成功     —> 成功 情况 3

           对于添加成功的情况2和情况3而言：元素a 于已经存在指定索引位置上数据以链表的方法存储
           JDK 7：元素a放在数组中，指向原来的元素   # 总结：7上8下
           JDK 8：原来的元素在数组中，指向元素a


         HashSet底层：数组 + 链表


     */

    @Test
    public void test1(){
        HashSet set = new HashSet();
        set.add(123);
        set.add(123);
        set.add(345);
        set.add("AA");
        set.add(false);
        set.add(new Person("Tom",12));
        set.add(new Person("Tom",12));

        Iterator iterator = set.iterator();
        while (iterator.hasNext()){
            System.out.println(iterator.next());
        }
    }
}
