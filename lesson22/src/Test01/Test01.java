package Test01;
import org.junit.Test;

import java.lang.annotation.ElementType;
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

    /*
        关于 java.lang.Class 类的理解
        1. 类的加载过程：
           程序经过javac.exe命令以后，会生成一个或多个字节码文件（.class结尾）
           接着我们使用java.exe 命名对某个字节码文件进行解释运行. 相当于将某个字节码文件加载到内存中，此过程成为类的加载
           加载到到内存中的类，我们就称为运行时类，此运行时类，就作为Class的一个实例

        2. 换句话说，Class的实例对应着一个运行时类
        3. 加载到内存中的运行时类，会缓存一定的时间，在此时间之内，我们可以通过不同的方式来获取运行时类


     */

    // 万事万物皆对象？

    // 获取Class的实例方式，需要掌握
    @Test
    public void test3() throws ClassNotFoundException {
        // 方式 1：调用运行时类的属性: .class
        Class<Person> personClass = Person.class;
        System.out.println(personClass);    // class Test01.Person

        // 方式 2：通过运行时类的对象，调用getClass()
        Person p1 = new Person();
        Class<? extends Person> p1Class = p1.getClass();

        // 方式 3：调用Class的静态方法：forName(String classPath)    （常用）
        Class<?> forName = Class.forName("Test01.Person");
        System.out.println(forName);

        // 方式 4：使用类的加载类：ClassLoader （了解）
        ClassLoader classLoader = Test01.class.getClassLoader();
        Class<?> aClass = classLoader.loadClass("Test01.Person");
        System.out.println(aClass);     // class Test01.Person
    }

    // Class 实例可以是那些结构的说明
    @Test
    public void test4(){
        Class c1 = Object.class;
        Class c2 = Comparable.class;
        Class c3 = String[].class;
        Class c4 = int[][].class;
        Class c5 = ElementType.class;
        Class c6 = Override.class;
        Class c7 = int.class;
        Class c8 = void.class;
        Class c9 = Class.class;

        int[] a = new int[10];
        int[] b = new int[100];
        Class c10 = a.getClass();
        Class c11 = b.getClass();

        // 只要元素类型与维度一样，就是同一个Class
        System.out.println(c10 == c11);
    }
}
