package Test04;

import Test02.Person;
import org.junit.Test;

import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.Method;

/**
 * @author HXS
 * @create 2021-03-11 15:05
 */

/*
    调用运行时类指定的结构：属性、方法、构造器
 */
public class Test01 {

    /*
        不需要，对属性要求太高
     */
    @Test
    public void test01() throws Exception {
        Class<Person> personClass = Person.class;

        // 创建运行时类的对象
        Person p = personClass.newInstance();


        // 获取指定的属性: 要求运行时类中属性声明为public
        // 通常不采用此方法
        Field id = personClass.getField("id");

        // 设置当前属性的值
        // set(): 参数1，指明设置哪个对象的属性  参数2：将此属性值设置为多少
        id.set(p,1001);

        // 获取当前属性的值
        // get(): 参数1，获取哪个对象的当前属性值
        Object o = id.get(p);
        System.out.println(o);
    }

    // 如何操作运行时类中指定的属性  -- 需要掌握
    @Test
    public void test2() throws Exception {
        Class<Person> personClass = Person.class;

        // 创建运行时类的对象
        Person person = personClass.newInstance();

        // 1. getDeclaredField(String filedName) : 获取运行时类中指定变量名的属性
        Field name = personClass.getDeclaredField("name");

        // 2. 保存当前属性是可以访问的
        name.setAccessible(true);

        // 3. 获取、设置指定对象的此属性值
        name.set(person,"TOM");
        System.out.println(name.get(person));
    }


    // 如何操作运行时类中指定的方法 -- 需要掌握
    @Test
    public void test4() throws Exception {
        Class<Person> personClass = Person.class;

        // 创建运行时类的对象
        Person person = personClass.newInstance();

        // 1. 获取指定的某个方法
        // getDeclaredMethod(): 参数1：指明获取的方法的名称 参数2：指明获取方法的形参列表
        Method show = personClass.getDeclaredMethod("show", String.class);

        // 2. 保证当前方法是可以访问的
        show.setAccessible(true);

        // 3. 调用方法的invoke执行
        // invoke(): 参数1，方法的调用者  参数2：给方法形参赋值
        show.invoke(person,"CHN");


        // 如何调用静态方法
        Method showDesc = personClass.getDeclaredMethod("showDesc");
        showDesc.setAccessible(true);

        // 如果调用的运行时类中的方法没有返回值，则此invoke()返回null
        showDesc.invoke(person);
    }

    // 如何调用运行时类中指定的构造器
    @Test
    public void test5() throws Exception {
        Class<Person> personClass = Person.class;

        // private Person(String name)
        // 1. 获取指定的构造器
        // getDeclaredConstructor(): 参数：指明构造器的参数列表
        Constructor<Person> constructor = personClass.getDeclaredConstructor(String.class);

        // 2. 保存此构造器的可访问的
        constructor.setAccessible(true);

        // 3. 调用此构造器创建运行时类的对象
        Person person = constructor.newInstance("Tom");

        System.out.println(person);

    }
}
