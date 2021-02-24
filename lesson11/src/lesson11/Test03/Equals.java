package lesson11.Test03;
/*
    面试题： == 和 equals（） 区别

    1. == 的使用  / 运算符
    1.1 可以使用在基本数据类型变量和引用数据类型变量中
    1.2 如果比较的是基本数据类型变量：比较两个变量保存的数据是否相等 （不一定类型要相等）
        如果比较的是引用数据类型变量：比较两个对象的地址值是否相同，即两个引用是否指向同一个对象实体

    2. equals（） 方法
    2.1 是一个方法，而非运算符
    2.2 只能适用于引用数据类型

    2.3 Object 中 equals 方法 与 == 相同    # 地址比较
        public boolean equals(Object obj) {    // 源码
        return (this == obj);
    }

    2.4 EX- String,Date,File,包装类都重写了Object中 equals 方法，比较的不再是引用地址是否相同
    而是比较两个对象的 "实体内容" 是否相同

    2.5 通常情况下，我们自定义的类如果使用equals（）的话，也通常是比较两个对象的 "实体内容" 是否相同，那么
    我们就需要对 Object 类中的 equals（） 进行重写


 */
public class Equals {
    public static void main(String[] args) {

        // 基本数据类型
        int i = 10;
        int j = 10;
        double d = 10.0;
        System.out.println(i == j); // true;
        System.out.println(d == i); // true;

        boolean b = true;
//        System.out.println(i == b);    boolean 不行
        char c = 10;
        System.out.println(i == c);


        //--------------------------------------------------------------
        // 引用数据类型
        Custom c1 = new Custom("Tom",12);
        Custom c2 = new Custom("Jack",20);
        Custom c3 = new Custom("Jack",20);


        System.out.println(c1 == c2); // false

        String str1 = new String("AA");
        String str2 = new String("BB");
        String str3 = new String("BB");

        System.out.println(str1 == str2); // false  地址

        //-----------------------------------------------------------------
        // equals
        System.out.println(str1.equals(str2)); // false # String
        System.out.println(c2.equals(c3)); // false -> true  # Object
        System.out.println(str2.equals(str3)); // true
    }
}

