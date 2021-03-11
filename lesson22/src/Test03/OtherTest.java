package Test03;

import Test02.Person;
import org.junit.Test;

import java.lang.annotation.Annotation;
import java.lang.reflect.Constructor;
import java.lang.reflect.Type;


/**
 * @author HXS
 * @create 2021-03-11 12:18
 */
public class OtherTest {
    /*
        获取构造器
     */
    @Test
    public void test1(){
        Class personClass = Person.class;
        // getConstructors(): 获取当前运行时类中声明为public的构造器
        Constructor[] constructors = personClass.getConstructors();
        for (Constructor c : constructors) {
            System.out.println(c);
        }

        // getDeclaredConstructors(): 获取当前运行时类中声明的所有构造器
        Constructor[] declaredConstructors = personClass.getDeclaredConstructors();
        for (Constructor c : declaredConstructors) {
            System.out.println(c);
        }
    }

    /*
        获取运行时类的父类
     */
    @Test
    public void test2(){
        Class personClass = Person.class;
        Class superclass = personClass.getSuperclass();
        System.out.println(superclass);
    }
    /*
    获取运行时类的带泛型的父类
 */
    @Test
    public void test3(){
        Class personClass = Person.class;
        Type genericSuperclass = personClass.getGenericSuperclass();
        System.out.println(genericSuperclass);
    }
    /*
        获取运行时类实现的接口
     */
    @Test
    public void test4(){
        Class personClass = Person.class;
        Class[] interfaces = personClass.getInterfaces();
        for (Class c : interfaces) {
            System.out.println(c);
        }
    }

    /*
        获取运行时类所在的包
     */
    @Test
    public void test5(){
        Class personClass = Person.class;
        Package aPackage = personClass.getPackage();
        System.out.println(aPackage);
    }

    /*
        获取运行时时类声明的注解
     */
    @Test
    public void test6(){
        Class personClass = Person.class;
        Annotation[] annotations = personClass.getAnnotations();
        for (Annotation a : annotations) {
            System.out.println(a);
        }
    }
}
