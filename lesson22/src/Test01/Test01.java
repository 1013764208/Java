package Test01;
import org.junit.Test;

import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.Method;

/**
 * @author HXS
 * @create 2021-03-10 19:20
 */


public class Test01 {

    // 反射之前对于Person的操作
    @Test
    public void test1(){

        // 1. 创建Person类的对象
        Person p1 = new Person("Tom",12);

        // 2. 通过对象，调用其内部的属性、方法
        p1.age = 10;
        System.out.println(p1.toString());
        p1.show();

        // 在 Person类外部，不可以通过Person类的对象调用其内部私有化结构
        // EX- name，showNation() 以及私有的构造器
    }

    // 反射之后，对于Person的操作
    @Test
    public void test2() throws Exception {
        Class personClass = Person.class;
        // 1. 通过反射，创建Person类的对象
        Constructor constructor = personClass.getConstructor(String.class, int.class);
        Object obj = constructor.newInstance("Tom", 12);
        Person p = (Person)obj;
        System.out.println(obj.toString());

        // 2. 通过反射，调用对象指定的属性，方法
        // 调用属性
        Field age = personClass.getDeclaredField("age");
        age.set(p,10);
        System.out.println(p.toString());

        // 调用方法
        Method show = personClass.getDeclaredMethod("show");
        show.invoke(p);

        // 通过反射，可以调用Person类的私有结构 EX- 私有的结构，方法，属性
        // 调用私有构造器
        Constructor cons1 = personClass.getDeclaredConstructor(String.class);
        cons1.setAccessible(true);
        String p1 = (String) cons1.newInstance("Jerry");
        System.out.println(p1);

        // 调用私有的属性
        Field name = personClass.getDeclaredField("name");
        name.setAccessible(true);
        name.set(p1,"李明");
        System.out.println(p1.toString());

        // 调用私有的方法
        Method showNation = personClass.getDeclaredMethod("showNation", String.class);
        showNation.setAccessible(true);
        String nation = (String) showNation.invoke(p1, "中国");// 相当于 string nation = p1.showNation("中国")
        System.out.println(nation);
    }

    // 疑问：通过直接new的方法或反射的方法都可以调用公共的结构，开发中到底用哪个？
    // 建议：直接new的方式
    // 使用时候会使用：反射的方法. 反射的特征：动态性
    // 疑问: 反射机制与面向对象中的封装性是不是矛盾的？如何看待两个技术
    // 不矛盾，
}
