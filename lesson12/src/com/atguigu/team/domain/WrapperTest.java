package com.atguigu.team.domain;

import javafx.beans.binding.ObjectExpression;
import org.junit.jupiter.api.Test;

/*
    包装类的使用：
    1. Java 提供了8 中基本数据类型对应的包装类，使得基本数据类型的变量具有类的特征
    2. 需要掌握：基本数据类型、包装类、String 三者之间的相互转换
 */
public class WrapperTest {

    // 基本数据类型 -> 包装类：调用包装类的构造器
    @Test
    public void test1(){
        int num1 = 10;
        Integer in1 = new Integer(num1);

        System.out.println(in1.toString());

        Float f1 = new Float(12.3f);

        Boolean b1 = new Boolean(true);
    }

    // 包装类 -> 基本数据类型
    @Test
    public void test2(){
        Integer in2 = new Integer(12);

        int i2 = in2.intValue();
        System.out.println(i2 + 1);

        Float f1 = new Float(12.3);

        // 包装类 -> 基本数据类型   .Value
        float f2 = f1.floatValue();
        System.out.println(f2 + 1);
    }

    /*
        JDK 5.0 新特性：自动装箱与自动拆箱
     */
    public void test3(){
        int num1 = 10;

        // 本来 int num1 不能放入 Object method 中，但有 JDK 5.0 新特性
        method(num1);

        // 自动装箱
        int num2 = 10;
//        Integer in1 = new Integer(num2)   # 本来
        Integer in1 = num2; // 自动装箱   # 原理：源码 构造器


        // 自动拆箱：包装类 -> 基本数据类型
        int num3 = in1;  // 自动拆箱
    }

    public void method(Object obj){
        System.out.println(obj);
    }


    // 基本数据类型、包装类 —> String 类型：调用String 重载的 valuesOf
    @Test
    public void test4(){
        int num1 = 10;
        // 方式 1 : 连续运算
        String str1 = num1 + "";

        // 方式 2 ：调用String.ValueOf
        float f1 = 12.3f;
        String str2 = String.valueOf(f1); // "12.3"
    }


    // String —> 基本数据类型、包装类  : 调用 包装类 parsexxx
    @Test
    public void test5(){
        String str1 = "123";
//        int num1 = (int)str1;   # 强转要有父子关系

        Integer.parseInt(str1);
    }
}
