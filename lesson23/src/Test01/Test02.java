package Test01;

import org.junit.Test;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.function.Consumer;

/**
 * @author HXS
 * @create 2021-03-12 18:14
 */

/*
    Lambda 表达式的使用
    1. 举例：(o1,o2) -> Integer.compare(o1,o2)
    2. 格式：
        —> lambda 操作符 或 箭头操作符
        —> 左边：lambda 形参列表 （其实就是接口中的抽象方法的形参列表）
        —> 右边：lambda 体 （其实就是重写的抽象方法的方法体）

    3. lambda 表达式的使用（六种情况）

       总结：
       —> 左边：lambda 形参列表的类型可以省略（类型推断）；如果参数列表只有一个参数，其一对()也可以省略
       —> 右边：lambda 体应该使用一对{}包括；如果lambda体只有一条执行语句（可能时return语句），可以省略{}，和return关键字


    4. Lambda 表达式的本质：作为函数式接口的实例

    5. 如果一个接口中，只声明了一个抽象方法，则此接口就称为函数式接口. 我们可以在一个接口上使用
       @FunctionalInterface 注解，这样做可以检查它是否是一个函数式接口

    6. 所有以前用匿名实现类表示的现在都可以用lambda表达式来写


 */
public class Test02 {

    // 语法格式 1：无参，无返回值
    @Test
    public void test1(){

        Runnable r1 = new Runnable() {
            @Override
            public void run() {
                System.out.println("我爱北京天安门");
            }
        };

        // 方式 2
        Runnable r2 = () -> System.out.println("我爱北京");
    }


    // 语法格式 2：Lambda 需要一个参数，但是没有返回值
    @Test
    public void test2(){
        Consumer<String> con = new Consumer<String>() {
            @Override
            public void accept(String s) {
                System.out.println(s);
            }
        };
        con.accept("谎言和誓言");

        // 新特性
        Consumer<String> con1 = (String s) -> System.out.println(s);
        con1.accept("谎言和誓言");
    }


    // 语法格式 3：数据类型可以省略，因为可由编译器推断得出，称为 "类型推断"
    @Test
    public void test3(){

        Consumer<String> con1 = (String s) -> System.out.println(s);

        // 类型推断
        Consumer<String> con2 = (s) -> System.out.println(s);
    }


    @Test
    public void test4(){
        ArrayList<String> list = new ArrayList<>();   // 类型推断

        int[] arr1 = new int[]{1,2,3};
        int[] arr2 = {1,2,3};     // 类型推断
    }


    // 语法格式 4：Lambda 若只需要一个参数时，参数的小括号可以省略
    @Test
    public void test5(){

        Consumer<String> con2 = (s) -> System.out.println(s);

        Consumer<String> con3 = s -> System.out.println(s);
    }


    // 语法格式 5：Lambda 需要两个或两个以上的参数，多条执行语句，并且可以有返回值
    @Test
    public void test6(){
        Comparator<Integer> com1 = new Comparator<Integer>() {
            @Override
            public int compare(Integer o1, Integer o2) {
                System.out.println(o1);
                System.out.println(o2);
                return o1.compareTo(o2);
            }
        };
    }

    // 当有多条执行语句时，使用大括号 / 新特性
    Comparator<Integer> com2 = (o1,o2) ->  {
        System.out.println(o1);
        System.out.println(o2);
        return o1.compareTo(o2);
    };


    // 语法格式 6：当lambda 体只有一条语句时，return 与大括号若有，都可以省略
    @Test
    public void test7(){
        Comparator<Integer> com2 = (o1,o2) ->  {
            return o1.compareTo(o2);
        };

        // 新特性
        Comparator<Integer> com3 = (o1, o2) -> o1.compareTo(o2);
        com3.compare(21,12);
    }

    @Test
    public void test8(){
        Consumer<String> con1 = s -> {
            System.out.println(s);
        };
        con1.accept("helloworld");

        // 新特性
        Consumer<String> con2 = s -> System.out.println(s);
    }
}
