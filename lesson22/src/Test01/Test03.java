package Test01;

import org.junit.Before;
import org.junit.Test;

import java.util.Random;

/**
 * @author HXS
 * @create 2021-03-11 10:46
 */

/*
    通过反射创建对应的运行时类的对象
 */
public class Test03 {
    @Test
    public void test1() throws Exception {
        Class<Person> personClass = Person.class;
        /*
            newInstance(): 调用此方法，创建对应的运行时类的对象
            内部调用了运行时类的空参构造器，要想此方法正常创建运行时类的对象，要求：
            1. 运行时类必须提供空参的构造器
            2. 空参的构造器的访问权限要够，通常设置为public

            在java中要求提供一个public的空参构造器，原因：
            1. 便于通过反射，创建运算时类的对象
            2. 便于子类继承此运算时类时，默认调用super()时，保证父类有此构造器

         */
        Person obj = personClass.newInstance();
        System.out.println(obj);

    }

    // 体会反射的动态性
    @Test
    public void test2() throws Exception {
        int num = new Random().nextInt(3);// 0,1,2
        String classPath = "";
        switch (num) {
            case 0:
                classPath = "java.util.Data";
                break;
            case 1:
                classPath = "java.lang.Object";
                break;
            case 2:
                classPath = "Test01.Person";
                break;
        }
        Object obj = getInstance(classPath);
        System.out.println(obj);
    }

    /*
        创建一个指定类的对象
        classPath: 指定类的全类名
     */
    public Object getInstance(String classPath) throws Exception{
        Class<?> clazz = Class.forName(classPath);

        return clazz.newInstance();
    }
}
