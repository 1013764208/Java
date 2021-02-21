package com.atguigu.team.domain;

import org.junit.Test;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.Date;
import java.util.Scanner;

/*
    1. 异常系统结构

    java.lang.Throwable
        java.lang.Error: 一般不编写针对性的代码进行处理
        java.lang.Exception: 可以进行异常的处理
               编译时异常 checked
                    EX- IOException,ClassNotFoundException
               运行时异常 unchecked
                    EX- NullPointerException,ClassCastException

     面试题：常见的异常有哪些? 举例说明
 */
public class Exception {


    // ------------------- 运行时异常 ----------------------------
    @Test
    // NullPointerException
    public void test1(){
        int[] arr = null;
        System.out.println(arr[1]);
    }

    @Test
    // ArrayIndexOutOfBoundsException
    public void test2(){
        int[] arr = new int[10];
        System.out.println(arr[10]);
    }

    @Test
    // ClassCastException
    public void test3(){
        Object obj = new Date();
        String str = (String)obj;
    }

    @Test
    public void test4(){
        Scanner scanner = new Scanner(System.in);
        int score = scanner.nextInt();
        System.out.println(score);
    }

    // --------------- 编译时异常 ---------------------
    @Test
    public void test5() throws IOException {
        File file = new File("hello.txt");
        FileInputStream fileInputStream = new FileInputStream(file);

        int data = fileInputStream.read();
        while(data != 1){
            System.out.println((char)data);
            data = fileInputStream.read();
        }
    }
}
