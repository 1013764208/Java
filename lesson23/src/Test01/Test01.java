package Test01;
import org.junit.Test;

import java.util.Comparator;

/**
 * @author HXS
 * @create 2021-03-12 17:59
 */
public class Test01 {
    @Test
    public void test1(){
        // 方式 1
        Runnable r1 = new Runnable() {
            @Override
            public void run() {
                System.out.println("我爱北京天安门");
            }
        };
        r1.run();

        // 方式 2
        Runnable r2 = () -> System.out.println("我爱北京");
        r2.run();
    }

    @Test
    public void test2(){
        // 方式 1
        Comparator<Integer> com1 = new Comparator<Integer>() {
            @Override
            public int compare(Integer o1, Integer o2) {
                return Integer.compare(o1, o2);
            }
        };
        int compare1 = com1.compare(12, 21);
        System.out.println(compare1);


        // 方式 2  Lambda 表达式的写法
        Comparator<Integer> com2 = (o1,o2) -> Integer.compare(o1,o2);

        // 方式 3 方法引用
        Comparator<Integer> com3 = Integer::compare;

    }
}
