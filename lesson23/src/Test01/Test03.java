package Test01;

import org.junit.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;
import java.util.function.Predicate;

/**
 * @author HXS
 * @create 2021-03-12 19:13
 */

/*
    JAVA 内置的4大核心函数式接口
    1. 消费型接口  Consumer<T>     void accept(T t)
    2. 供给性接口  Supplier<T>     T get()
    3. 函数性接口  Function<T,R>   R apply(T t)
    4. 断定新接口  Predicate<T>    boolean test(T t)
 */
public class Test03 {

    @Test
    public void test1(){
        happyTime(500, new Consumer<Double>() {
            @Override
            public void accept(Double aDouble) {
                System.out.println("花费" + aDouble);
            }
        });

        // 新特性
        happyTime(400,money -> System.out.println("花费为" + money));
    }

    public void happyTime(double money, Consumer<Double> con) {
        con.accept(money);
    }


    @Test
    public void test2(){
        List<String> list = Arrays.asList("北京", "南京", "天津", "东京");
        List<String> filterString = filterString(list, new Predicate<String>() {
            @Override
            public boolean test(String s) {
                return s.contains("京");
            }
        });
        System.out.println(filterString);

        // 新特性
        List<String> filterString1 = filterString(list, s -> s.contains("京"));
    }


    // 根据给定的规则，过滤集合中的字符串，此规范则有Predicate的方法决定
    public List<String> filterString(List<String> list, Predicate<String> pre){
        ArrayList<String> arrayList = new ArrayList<>();
        for (String s : list) {
            if (pre.test(s)) {
                arrayList.add(s);
            }
        }
        return arrayList;
    }
}
