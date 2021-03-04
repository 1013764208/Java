package Test01;

/**
 * @author HXS
 * @create 2021-03-03 19:22
 */

/*
    1. 枚举类的使用
    1.1 枚举类的理解：类的对象只有有限个, 确定的. 我们称此类为枚举类
    1.2 当需要定义一组常量时，强烈建议使用枚举类
    1.3 如何枚举类只有一个对象，则可以作为单例模式的是实现方式

    2. 如何定义枚举类
    2.1 JDK5 之前，自定义枚举类
    2.2 JDK5，可以使用enum关键字定义枚举类

    3. Enum 常用的方法
       values()方法：返回枚举类型的对象数组。该方法可以很方便地遍历所有的枚举值
       valueOf(String str)：可以把一个字符串转为对应的枚举类对象。要求字符串必须是枚举类对象的“名字”。如不是，会有运行时异常：IllegalArgumentException
       toString()：返回当前枚举类对象常量的名称

    4. 使用enum关键字定义的枚举类实现的接口的情况
    4.1 情况一：实现接口，在enum类中实现抽象方法
    4.2 情况二：让枚举类的对象分别实现接口中的抽象方法


 */
public class test01 {
    public static void main(String[] args) {

        season spring = season.SPRING;
        System.out.println(spring);
        spring.show();
    }
}

//自定义枚举类
class season implements Info{
    //1.声明Season对象的属性:private final修饰
    private final String seasonName;
    private final String seasonDesc;

    //2.私有化类的构造器,并给对象属性赋值
    private season(String seasonName,String seasonDesc){
        this.seasonName = seasonName;
        this.seasonDesc = seasonDesc;
    }

    //3.提供当前枚举类的多个对象：public static final的
    public static final season SPRING = new season("春天","春暖花开");
    public static final season SUMMER = new season("夏天","夏日炎炎");
    public static final season AUTUMN = new season("秋天","秋高气爽");
    public static final season WINTER = new season("冬天","冰天雪地");

    //4.其他诉求1：获取枚举类对象的属性
    public String getSeasonName() {
        return seasonName;
    }

    public String getSeasonDesc() {
        return seasonDesc;
    }
    //4.其他诉求1：提供toString()
    @Override
    public String toString() {
        return "Season{" +
                "seasonName='" + seasonName + '\'' +
                ", seasonDesc='" + seasonDesc + '\'' +
                '}';
    }

    @Override
    public void show() {
        System.out.println("这个一个季节");
    }
}

interface Info{
    void show();
}

