package Test03;

import org.junit.Test;
import java.util.Date;

/**
 * @author HXS
 * @create 2021-03-02 13:22
 */

/*
    JDK 8 之间的日期和时间API测试
 */
public class DataTime {

    // 1. system 类中currentTimeMillis()
    @Test
    public void test1(){

        // 返回当前时间与1970年1月1日0时0分0秒之间以毫秒为单位的时间差，称为时间戳
        long time = System.currentTimeMillis();
        System.out.println(time);
    }

    /*
        java.util.Date 类
            java.sql.Date 类

        1. 两个构造器的使用
        1.1 构造器1：Date()：创建一个对应当前时间的Date对象
        1.2 构造器2：创建指定毫秒数的Date对象

        2. 两个方法的使用
        2.1 toString()：显示当前的年、月、日、分、秒
        2.2 getTime()：获取当前Date对象对应的毫秒数 （时间戳）

        3. java.sql.Date 对应着数据库中的日期类型的变量
        3.1 如果实例化
        3.2 sql.Date -> util.Date 对象  多态
        3.3 util.Date -> sql.Date 对象




     */

    @Test
    public void test2(){

        // 构造器1：Date()：创建一个对应当前时间的Date对象
        Date date1 = new Date();
        System.out.println(date1.toString());   // Tue Mar 02 13:30:57 CST 2021

        System.out.println(date1.getTime());    // 1614663057845

        // 构造器2：创建指定毫秒数的Date对象
        Date date2 = new Date(1614663057845L);
        System.out.println(date2.getTime());

        // 创建java.sql.Date 对象
        java.sql.Date date3 = new java.sql.Date(323213213123L);
        System.out.println(date3);

        // 如何 util.Date -> sql.Date 对象
        // 情况1
        Date date4 = new java.sql.Date(23123213L);
        java.sql.Date date5 = (java.sql.Date) date4;

        // 情况2
        Date date6 = new Date();
        java.sql.Date date7 = new java.sql.Date(date6.getTime());
    }
}
