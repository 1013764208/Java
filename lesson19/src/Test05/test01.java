package Test05;

import org.junit.Test;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;

// 练习：在 List 内去除重复数字值，要求尽量简单
public class test01{

    // 利用HashSet原理，去除重复数值，秒!
    public List duplicateList(List list) {
        HashSet set = new HashSet();
        set.addAll(list);
        return new ArrayList(set);
    }

    @Test
    public void test01() {
        List list = new ArrayList();
        list.add(new Integer(1));
        list.add(new Integer(2));
        list.add(new Integer(2));
        list.add(new Integer(4));
        list.add(new Integer(4));

        List list2 = duplicateList(list);
        for (Object integer : list2) {
            System.out.println(integer);
        }
    }
}
