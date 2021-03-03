package Test05;

import org.junit.Test;

import java.time.*;
import java.time.format.DateTimeFormatter;
import java.time.format.FormatStyle;
import java.time.temporal.TemporalAccessor;
import java.util.Date;


/**
 * @author HXS
 * @create 2021-03-03 12:51
 */

// JDK8 日期时间API测试
public class DateTimeJDK8 {

    @Test
    public void test1() {
        // 偏移量问题
        Date date1 = new Date(2021 - 1900, 3 - 1, 3);
        System.out.println(date1);
    }


    /*
        LocalDate、LocalTime、LocalDateTime 类的使用

        1. LocalDateTime 相较于 LocalDate、LocalTime 使用频率较高
        2. 类似于Calendar

     */
    @Test
    public void test2() {
        // now()：获取当前的日期、时间、日期 + 时间
        LocalDate localDate = LocalDate.now();
        LocalTime localTime = LocalTime.now();
        LocalDateTime localDateTime = LocalDateTime.now();

        System.out.println(localDate);
        System.out.println(localTime);
        System.out.println(localDateTime);


        // of()：设置指定的年、月、日、时、分、秒 没有偏移量
        LocalDateTime localDateTime1 = LocalDateTime.of(2021, 3, 3, 13, 9);
        System.out.println(localDateTime1);


        // getXxx()：获取相关的属性
        System.out.println(localDateTime.getMonth());       // MARCH
        System.out.println(localDateTime.getDayOfMonth());  // 3  返回一个月的第几天
        System.out.println(localDateTime.getDayOfYear());   // 62   返回一年中的第几天
        System.out.println(localDateTime.getYear());        // 2021


        // 体现不可变性
        // withXxx()：设置相关的属性
        LocalDateTime localDateTime2 = localDateTime.withDayOfMonth(22);
        System.out.println(localDateTime);
        System.out.println(localDateTime2);


        // plusXxx()：向当前对象添加...
        LocalDateTime localDateTime3 = localDateTime.plusHours(2);
        System.out.println(localDateTime);      // 2021-03-03T13:23:19.411
        System.out.println(localDateTime3);     // 2021-03-03T15:23:19.411

        // minusXxx()：从当前对象减去...
        LocalDateTime localDateTime4 = localDateTime.minusDays(30);
        System.out.println(localDateTime);      // 2021-03-03T13:26:04.248
        System.out.println(localDateTime4);     // 2021-02-01T13:26:04.248
    }


    /*
        Instance 使用
        类似于 java.util.Date 类
     */
    @Test
    public void test3() {
        // now()：获取本初子午线对应的标准时间
        Instant instant = Instant.now();
        System.out.println(instant);  // 2021-03-03T05:29:56.744Z   greenTime

        // 添加时间的偏移量
        OffsetDateTime offsetDateTime = instant.atOffset(ZoneOffset.ofHours(8));
        System.out.println(offsetDateTime); //东八区时间

        // 获取自1970年1月1日0时0分（UTC）开始的毫米数  -> Date 类的getTime()
        long milli = instant.toEpochMilli();
        System.out.println(milli);  // 1614749786373

        // ofEpochMilli(): 通过给的毫秒数,获取Instant实例   -> Date(long millis)
        Instant instant1 = Instant.ofEpochMilli(1614749786373L);
        System.out.println(instant1);
    }


    /*
        DateTimeFormatter: 格式化或解析日期、时间
        类似于 SimpleDateFormat
     */
    @Test
    public void test4() {

        // 1. 预定义的标准格式 如：ISO_LOCAL_DATE_TIME;ISO_LOCAL_DATE;ISO_LOCAL_TIME
        DateTimeFormatter formatter = DateTimeFormatter.ISO_DATE_TIME;

        // 格式化：日期 -> 字符串
        LocalDateTime localDateTime = LocalDateTime.now();
        String str1 = formatter.format(localDateTime);
        System.out.println(localDateTime);
        System.out.println(str1);

        // 解析：字符串 -> 日期
        TemporalAccessor parse = formatter.parse("2021-03-03T13:56:34.263");
        System.out.println(parse);



        // 2. 本地化相关的格式 如：ofLocalizedDateTime(FormatStyle.LONG)
        DateTimeFormatter formatter1 = DateTimeFormatter.ofLocalizedDateTime(FormatStyle.LONG);

        // 格式化：日期 -> 字符串
        String str2 = formatter1.format(localDateTime);
        System.out.println(str2);



        // 3. 重点：自定义的格式 如：ofPattern(“yyyy-MM-dd hh:mm:ss”
        DateTimeFormatter formatter2 = DateTimeFormatter.ofPattern("yyyy-MM-dd");

        // 格式化
        String str3 = formatter2.format(LocalDateTime.now());
        System.out.println(str3);   // 2021-03-03

        // 解析
        TemporalAccessor parse1 = formatter2.parse("2021-03-03");
        System.out.println(parse1);
    }
}
