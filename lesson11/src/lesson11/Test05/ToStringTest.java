package lesson11.Test05;

/*
    Object 类中toString（）的使用
    1. 当我们输出一个对象的引用时，实际上就是调用当前对象的toString（）
    2. Object 类中 toString 的定义
     public String toString() { // 源码
        return getClass().getName() + "@" + Integer.toHexString(hashCode());
    }

    3. EX- String,Data,File,包装类都重写了 Object 类中的 toString（）方法
    使得在调用对象的toString（）时，返回 "实体内容" 信息

    4. 自定义类也可以重写toString（）方法，当调用此方法时，返回对象的 "实体内容"
 */
import lesson11.Test03.Custom;

public class ToStringTest {
    public static void main(String[] args) {
        Custom c1 = new Custom("Tom",21);

        System.out.println(c1.toString()); // lesson11.Test03.Custom@1b6d3586 -> Custom{name='Tom', age=21}
        System.out.println(c1); // lesson11.Test03.Custom@1b6d3586 -> Custom{name='Tom', age=21}

        String str = new String("MM");
        System.out.println("MM"); // MM 说明 mm 重写过
    }
}

