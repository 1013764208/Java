package Test07;

import Test01.Person;
import org.junit.Test;

import java.util.Comparator;
import java.util.TreeMap;

/**
 * @author HXS
 * @create 2021-03-06 15:16
 */
public class TreeMapTest {

    // 向TreeMap 中添加key-value，要求key必须由同一个类创建的对象
    // 因为要按照key进行排序：自然排序，定制排序

    @Test
    public void test1(){
        TreeMap treeMap = new TreeMap();

        // 自然排序
        treeMap.put(new Person("Tom",12),89);
        treeMap.put(new Person("AA",23),88);
        treeMap.put(new Person("HSD",54),59);
        treeMap.put(new Person("JCAO",84),27);

        System.out.println(treeMap);
    }


    @Test
    public void test2(){
        TreeMap treeMap = new TreeMap(new Comparator() {

            // 定制排序
            @Override
            public int compare(Object o1, Object o2) {
                if (o1 instanceof Person && o2 instanceof Person){
                    Person p1 = (Person)o1;
                    Person p2 = (Person)o2;
                    return p1.getName().compareTo(p2.getName());
                }
                throw new RuntimeException("输入的类型不匹配");
            }
        });

        treeMap.put(new Person("Tom",12),89);
        treeMap.put(new Person("AA",23),88);
        treeMap.put(new Person("HSD",54),59);
        treeMap.put(new Person("JCAO",84),27);

        System.out.println(treeMap);
    }
}
