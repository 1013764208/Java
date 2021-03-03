package Test05;

import org.junit.Test;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

/**
 * @author HXS
 * @create 2021-03-03 10:22
 */


/*
    JDK 8 之前的日期时间API测试
    1. System 类中currentTimeMills()
    2. java.util.Date 和 子类 java.sql.Date
    3. SimpleDateFormat
    4. Calendar

 */
public class DateTimeTest {
    /*
        SimpleDateFormat的使用：SimpleDateFormat对日期Date类的格式化和解析

        1. 两个操作
        1.1 格式化：日期 —> 字符串
        1.2 解析：格式化的逆过程，字符串 -> 日期

        2. SimpleDateFormat 实例化

     */

    @Test
    public void test1() throws ParseException {
        // 实例化 SimpleDateFormat ：使用默认的构造器
        SimpleDateFormat sdf = new SimpleDateFormat();

        // 格式化： 日期 -> 字符串
        Date date = new Date(); // 当前日期
        System.out.println(date);

        String format = sdf.format(date);
        System.out.println(format);

        // 解析：格式化的逆过程，字符串 -> 日期
        String str = "21-2-2 上午10:35";  // 不爱用
        Date date1 = sdf.parse(str);
        System.out.println(date1);


        SimpleDateFormat sdf1 = new SimpleDateFormat("yyyy-MM-dd hh:mm:ss");
        // 格式化
        String format1 = sdf1.format(date);
        System.out.println(format1);

        // 解析：要求字符串必须要符合SimpleDateFormat 识别的格式（通过构造器参数体现）
        Date date2 = sdf1.parse("2021-03-03 10:44:04");
        System.out.println(date2);
    }



    // 练习："2020-09-08" 转换为 java.sql.Date
    @Test
    public void test2() throws ParseException {
        String birth = "2020-09-08";

        // 实例化
        SimpleDateFormat sdf1 = new SimpleDateFormat("yyyy-MM-dd");

        // 解析
        Date date = sdf1.parse(birth);
        System.out.println(date);

        // util.Date -> sql.Date
        java.sql.Date birthDate = new java.sql.Date(date.getTime());
        System.out.println(birthDate);
    }

    @Test
    public void test3(){
        // 1. 实例化
        // 1.1 创建其子类 Calendar.getInstance() 的对象
        // 1.2 调用其静态方法 getInstance()
        Calendar calendar = Calendar.getInstance();


        // 2. 常用方法
        // 2.1 get()
        int days = calendar.get(Calendar.DAY_OF_MONTH);
        int year = calendar.get(Calendar.YEAR);
        System.out.println(year);
        System.out.println(days);

        // 2.2 set()
        calendar.set(Calendar.DAY_OF_MONTH,22);
        int set = calendar.get(Calendar.DAY_OF_MONTH);
        System.out.println(set);

        // 2.3 add()
        calendar.add(Calendar.DAY_OF_MONTH,3);  // 22 + 3
        int add = calendar.get(Calendar.DAY_OF_MONTH);
        System.out.println(add);

        // 2.4 getTime()：日历类 -> Date
        Date date = calendar.getTime();
        System.out.println(date);

        // 2.5 setTime()：Date -> 日历类
        Date date1 = new Date();
        calendar.setTime(date1);
        days = calendar.get(Calendar.DAY_OF_MONTH);
        System.out.println(days);
    }
}
