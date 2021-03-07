package Test01;
import org.junit.Test;

import java.util.*;

/**
 * @author HXS
 * @create 2021-03-07 9:45
 */

/*
    泛型的使用
    1. JDK 5.0 新增的特性

    2. 在集合中使用泛型
    2.1 集合接口或集合类在JDK5.0 时都修改为带泛型的结构
    2.2 在实例化集合类时，可以指明具体的泛型类型
    2.3 指明完以后，在集合类或接口中凡是定义类或接口时，内部结构（EX- 方法，构造器，属性）使用类的泛型的位置，都指定为实例化的泛型类型
        EX- add(E e)  ->  实例化以后：add(Integer e)
    2.4 注意点：泛型的类型必须是类，不能是基本数据类型，需要用到基本数据类型的位置，拿包装类替换
    2.5 如果实例化时，没有指明泛型的类型，默认 Object

    3. 如何自定义泛型结构： 泛型类，泛型接口；泛型方法  见后

 */
public class test01 {


    // 在集合中使用泛型之前的情况：
    @Test
    public void test1() {
        ArrayList arrayList = new ArrayList();

        // 需求：存放学生的成绩
        arrayList.add(45);
        arrayList.add(20);
        arrayList.add(87);
        arrayList.add(43);

        // 问题 1：类型不安全
        arrayList.add("Tom");

        for (Object obj : arrayList) {
            // 问题 2：强转时，可能出现 classCastException
            int stuScore = (int) obj;
            System.out.println(obj);
        }
    }


    // 在集合中使用泛型的情况：以 ArrayList
    @Test
    public void test2() {
        ArrayList<Integer> integers = new ArrayList<Integer>();    // 不能用基本数据类型，要用包装类
        // JDK 7 新特性，类型推断
        ArrayList<Integer> integers1 = new ArrayList<>();    // 不能用基本数据类型，要用包装类

        integers.add(123);
        integers.add(234);
        // integers.add("AA");   编译过不去
        integers.add(0);

        for (Integer score : integers) {
            System.out.println(score);
        }

        Iterator<Integer> iterator = integers.iterator();
        while (iterator.hasNext()) {
            iterator.next();
        }
    }


    // 在集合中使用泛型的情况：以HashMap为例
    @Test
    public void test3(){
        Map<String, Integer> map = new HashMap<String, Integer>();

        map.put("Tom",123);
        map.put("AA",89);
        map.put("VV",89);
        // map.put(123,"DD");   不满足泛型的要求

        // 泛型的嵌套
        Set<Map.Entry<String, Integer>> entry = map.entrySet();
        Iterator<Map.Entry<String, Integer>> iterator = entry.iterator();

        while (iterator.hasNext()) {
            Map.Entry<String, Integer> next = iterator.next();
            String key = next.getKey();
            Integer value = next.getValue();
        }
    }
}
