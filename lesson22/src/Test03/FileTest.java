package Test03;

import Test02.Person;
import org.junit.Test;

import java.io.File;
import java.lang.reflect.Field;
import java.lang.reflect.Modifier;
import java.nio.file.Files;

/**
 * @author HXS
 * @create 2021-03-11 11:27
 */
// 获取当前时类的属性结构
public class FileTest {
    @Test
    public void test1(){
        Class<Person> personClass = Person.class;

        // 获取属性结构
        // getFiles(): 获取当前运行时类及其父类中声明为public访问权限的属性
        Field[] fields = personClass.getFields();
        for (Field f : fields) {
            System.out.println(f);
        }

        // getDeclaredFields(): 获取当前运行时类中声明的所有属性（不包含父类中声明的属性）
        Field[] declaredFields = personClass.getDeclaredFields();
        for (Field f : declaredFields) {
            System.out.println(f);
        }
    }

    // 权限修饰符  数据类型   变量名
    @Test
    public void test2() {
        Class<Person> personClass = Person.class;
        Field[] declaredFields = personClass.getDeclaredFields();
        for (Field f : declaredFields) {
            // 1. 权限修饰符
            int modifiers = f.getModifiers();
            System.out.println(Modifier.toString(modifiers));

            // 2. 数据类型
            Class<?> type = f.getType();
            System.out.println(type);

            // 3. 变量名
            String name = f.getName();
            System.out.println(name);
        }
    }
}
