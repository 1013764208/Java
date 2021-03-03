package Test06;

import org.junit.Test;
import java.util.Arrays;
import java.util.Comparator;

/**
 * @author HXS
 * @create 2021-03-03 14:22
 */

/*
    1. 说明：Java 中的对象，正常情况下，只能进行 == 或 != 不能使用 > 或 <
            但是在开发环境中，我们需要对多个对象进行排序，言外之意，就需要比较对象的大小

    2. 如何实现 ?  使用两个接口中的任何一个：comparable 或 comparator

    2.1 comparable 使用
    2.2 comparator 使用

    3. 两者对比
    3.1 comparable 接口的方式一旦一旦，保证 comparable 接口实现类的对象在任何位置都可以比较大小
    3.2 comparator 接口属性临时性的比较


 */
public class CompareTest {
    /*
        comparable EX-  自然排序
        1. 如 String,包装类 等实现了comparable接口，重写了compareTo()方法，给出了比较两个对象的大小
        2. 如 String,包装类 重写compareTo() 方法后，进行了从小到大的排序
        3. 重写compareTo() 的规则
           如果当前对象this大于形参对象obj，则返回正整数，
           如果当前对象this小于形参对象obj，则返回负整数，
           如果当前对象this等于形参对象obj，则返回零

        4. 对于自定义类来说，如果需要排序，我们可以让自定义类实现comparable接口，重写compareTo() 方法


     */
    @Test
    public void test1(){
        String[] arr = new String[]{"AA","CC","BB","KK","DD"};
        Arrays.sort(arr);
        System.out.println(Arrays.toString(arr));
    }

    @Test
    public void test2(){
        Goods[] arr = new Goods[4];
        arr[0] = new Goods("联想鼠标",34);
        arr[1] = new Goods("小米鼠标",20);
        arr[2] = new Goods("戴尔鼠标",30);
        arr[3] = new Goods("华为鼠标",30);

        Arrays.sort(arr);
        System.out.println(Arrays.toString(arr));

    }

    /*
        comparator 使用：定制排序
        1. 背景
           当元素的类型没有实现java.lang.Comparable接口而又不方便修改代码，
           或者实现了java.lang.Comparable接口的排序规则不适合当前的操作，那
           么可以考虑使用 Comparator 的对象来排序，

        2. 重写 compare(Object o1, Object o2)方法，比较o1 和 o2 的大小
           如果方法返回正整数，则表示 o1 大于 o2
           如果返回 0,表示相等
           如果返回负整数，表示 o1 小于 o2

     */

    @Test
    public void test3(){
        String[] arr = new String[]{"AA","CC","MM","GG","JJ","DD"};
        Arrays.sort(arr, new Comparator<String>() {
            // 按照字符串从大到小的顺序排序
            @Override
            public int compare(String o1, String o2) {
                if (o1 instanceof String && o2 instanceof String) {
                    String s1 = (String) o1;
                    String s2 = (String) o2;
                    return -s1.compareTo(s2);  // 负 自然排序
                }
                throw new RuntimeException("输入的数据类型不一致");
            }
        });
        System.out.println(Arrays.toString(arr));
    }


    @Test
    public void test4(){
        Goods[] arr = new Goods[5];
        arr[0] = new Goods("联想鼠标",34);
        arr[1] = new Goods("小米鼠标",20);
        arr[2] = new Goods("戴尔鼠标",30);
        arr[3] = new Goods("华为鼠标",30);
        arr[4] = new Goods("华为鼠标",40);

        Arrays.sort(arr, new Comparator<Goods>() {
            // 指明商品比较大小的方式：按照名称从低到高，再按照价格名称从高到低的排序
            @Override
            public int compare(Goods o1, Goods o2) {
                if (o1 instanceof Goods && o2 instanceof Goods) {
                    Goods g1 = (Goods) o1;
                    Goods g2 = (Goods) o2;
                    if (g1.getName().equals(g2.getName())){
                        return - Double.compare(g1.getPrice(),g2.getPrice());
                    } else {
                        return g1.getName().compareTo(g2.getName());
                    }
                }
                throw new RuntimeException("数据类型不一致");
            }
        });
        System.out.println(Arrays.toString(arr));
    }
}
