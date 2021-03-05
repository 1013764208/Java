package Test03;

import Test01.Person;
import org.junit.Test;

import java.util.Comparator;
import java.util.Iterator;
import java.util.TreeSet;

/**
 * @author HXS
 * @create 2021-03-05 14:45
 */
public class test03 {
    /*
        1. 向TreeSet 中添加的数据，要求是相同类的对象
        2. 两种排序方法：自然排序（实现comparable 接口） 和 定序排序（comparator）
        3. 自然排序中，比较两个对象是否相同的标准为：compareTo return 0，不再是 equals()
        4. 定制排序中，比较两个对象是否相同的标准为：compareTo return 0，不再是 equals()
     */

    // 自然排序
    @Test
    public void test1(){
        TreeSet treeSet = new TreeSet();

        treeSet.add(123);
        // treeSet.add("AA");   # Error  不能添加不同类的对象
        treeSet.add(345);
        treeSet.add(567);
        treeSet.add(-789);




        Iterator iterator = treeSet.iterator();
        while (iterator.hasNext()) System.out.println(iterator.next());
    }


    // 定制排序
    @Test
    public void test2(){
        Comparator comparator = new Comparator() {
            // 按照年龄从小到大排序
            @Override
            public int compare(Object o1, Object o2) {
                if (o1 instanceof Person && o2 instanceof Person) {
                    Person p1 = (Person)o1;
                    Person p2 = (Person)o2;

                    return Integer.compare(p1.getAge(),p2.getAge());
                } else {
                    throw new RuntimeException("输入的数据不匹配");
                }
            }
        };

        TreeSet treeSet = new TreeSet(comparator);

        treeSet.add(new Person("Tom",12));
        treeSet.add(new Person("HXD",22));
        treeSet.add(new Person("MCD",52));
        treeSet.add(new Person("AOD",28));

        for (Object obj : treeSet)
            System.out.println(obj);

    }
}
