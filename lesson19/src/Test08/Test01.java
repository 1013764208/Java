package Test08;

import org.junit.Test;

import java.util.*;

/**
 * @author HXS
 * @create 2021-03-06 15:52
 */

/*
    collections：操作 collection，Map的工具类

    面试题：collections 和 collection 的区别 ?
          工具类，接口
 */
public class Test01 {

    /*
        排序操作：（均为static方法）
        reverse(List)：反转 List 中元素的顺序
        shuffle(List)：对 List 集合元素进行随机排序
        sort(List)：根据元素的自然顺序对指定 List 集合元素按升序排序
        sort(List，Comparator)：根据指定的 Comparator 产生的顺序对 List 集合元素进行排序
        swap(List，int， int)：将指定 list 集合中的 i 处元素和 j 处元素进行交换

        查找、替换
        Object max(Collection)：根据元素的自然顺序，返回给定集合中的最大元素
        Object max(Collection，Comparator)：根据 Comparator 指定的顺序，返回给定集合中的最大元素
        Object min(Collection)
        Object min(Collection，Comparator)
        int frequency(Collection，Object)：返回指定集合中指定元素的出现次数
        void copy(List dest,List src)：将src中的内容复制到dest中
        boolean replaceAll(List list，Object oldVal，Object newVal)：使用新值替换List 对象的所有旧值

        synchronizedXxx()：该方法可使将指定集合合包装成线程同步的集合

     */

    @Test
    public void test1(){
        ArrayList arrayList = new ArrayList();
        arrayList.add(123);
        arrayList.add(345);
        arrayList.add(567);
        arrayList.add(-23);
        arrayList.add(0);

        System.out.println(arrayList);

        // reverse(List)
        Collections.reverse(arrayList);
        System.out.println(arrayList);

        // sort(List)
        Collections.sort(arrayList);
        System.out.println(arrayList);

        // swap(List，int， int)
        Collections.swap(arrayList,0,1);  // index
        System.out.println(arrayList);

        // frequency(Collection，Object)
        Collections.frequency(arrayList,0);
        System.out.println(arrayList);

        //  void copy(List dest,List src)
        List list = Arrays.asList(new Object[arrayList.size()]);
        Collections.copy(list,arrayList);
        System.out.println(list);

        //  synchronizedXxx()：该方法可使将指定集合合包装成线程同步的集合
        Collections.synchronizedList(arrayList);
    }
}
