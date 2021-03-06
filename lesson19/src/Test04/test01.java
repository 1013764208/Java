package Test04;

import org.junit.Test;

import java.util.Comparator;
import java.util.Iterator;
import java.util.TreeSet;

/**
 * @author HXS
 * @create 2021-03-06 9:29
 */
public class test01 {
    // 问题一：使用自然排序
    @Test
    public void test1(){
        TreeSet set = new TreeSet();  // 底层红黑树

        Employee e1 = new Employee("刘德华",55,new MyDate(1843,5,4));
        Employee e2 = new Employee("张博",20,new MyDate(2000,12,1));
        Employee e3 = new Employee("HSX",31,new MyDate(1994,2,5));
        Employee e4 = new Employee("TOM",17,new MyDate(2004,7,20));
        Employee e5 = new Employee("JCOK",35,new MyDate(1874,23,2));

        set.add(e1);
        set.add(e2);
        set.add(e3);
        set.add(e4);
        set.add(e5);

        // Test04.Employee cannot be cast to java.lang.Comparable / 此时无法添加，底层红黑树无法比较添加
        // 需要 1. 自然排序（comparable 接口）  2. 定制排序 （comparator 接口）

        Iterator iterator = set.iterator();
        while (iterator.hasNext()) {
            System.out.println(iterator.next());
        }
    }

    // 问题二：按照生日排序
    @Test
    public void test2(){
        TreeSet set = new TreeSet(new Comparator() {
            @Override
            // 可以看看 compareTo源码，原理，返回值相似
            public int compare(Object o1, Object o2) {
                if (o1 instanceof Employee && o2 instanceof Employee) {
                    Employee e1 = (Employee)o1;
                    Employee e2 = (Employee)o2;

                    MyDate b1 = e1.getBirthday();
                    MyDate b2 = e2.getBirthday();

                    // 比较年
                    int minusYear = b1.getYear() - b2.getYear();
                    if (minusYear != 0) {
                        return minusYear;
                    }

                    // 比较月
                    int minusMonth = b1.getMonth() - b2.getMonth();
                    if (minusMonth != 0) {
                        return minusMonth;
                    }

                    // 比较日
                    return b1.getDay() - b2.getDay();
                }
                throw new RuntimeException("输入数据类型不一致");
            }
        });

        Employee e1 = new Employee("刘德华",55,new MyDate(1843,5,4));
        Employee e2 = new Employee("张博",20,new MyDate(2000,12,1));
        Employee e3 = new Employee("HSX",31,new MyDate(1994,2,5));
        Employee e4 = new Employee("TOM",17,new MyDate(2004,7,20));
        Employee e5 = new Employee("JCOK",35,new MyDate(1874,23,2));

        set.add(e1);
        set.add(e2);
        set.add(e3);
        set.add(e4);
        set.add(e5);

        Iterator iterator = set.iterator();
        while (iterator.hasNext()) {
            System.out.println(iterator.next());
        }
    }
}
