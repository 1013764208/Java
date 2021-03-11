package Test03;

import Test02.Person;
import org.junit.Test;

import java.lang.reflect.Constructor;

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
}
