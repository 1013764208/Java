package Test03;

import Test02.Person;
import org.junit.Test;

import java.lang.annotation.Annotation;
import java.lang.reflect.Method;
import java.lang.reflect.Modifier;

/**
 * @author HXS
 * @create 2021-03-11 11:46
 */

/*
    获取运行时类的方法结构
 */
public class MethodTest {
    @Test
    public void test1(){
        Class<Person> clazz = Person.class;

        // getMethods(): 获取当前运行时类及其所有的父类中声明为public权限的方法
        Method[] methods = clazz.getMethods();
        for (Method m : methods) {
            System.out.println(m);
        }

        // getDeclaredMethods(): 获取当前运行时类中声明的所有方法（不包含父类声明的方法）
        Method[] declaredMethods = clazz.getDeclaredMethods();
        for (Method m : declaredMethods) {
            System.out.println(m);
        }
    }

    /*
        @Xxx
        权限修饰符  返回值类型  方法名（参数类型1 形参名1...） throws XxxException{}
     */
    @Test
    public void test2(){
        Class<Person> personClass = Person.class;
        Method[] declaredMethods = personClass.getDeclaredMethods();
        for (Method m : declaredMethods) {
            // 1. 获取方法声明的注解
            Annotation[] annotations = m.getAnnotations();
            for (Annotation a : annotations) {
                System.out.println(a);
            }

            // 2. 权限修饰符
            System.out.println(Modifier.toString(m.getModifiers()));

            // 3. 返回值类型
            System.out.println(m.getReturnType().getName());

            // 4. 方法名
            System.out.println(m.getName());

            // 5. 形参列表
            System.out.print("(");
            Class<?>[] parameterTypes = m.getParameterTypes();
            if (!(parameterTypes == null && parameterTypes.length == 0)){
                for (int i = 0; i < parameterTypes.length; i++) {
                    if (i == parameterTypes.length -1){
                        System.out.print(parameterTypes[i].getName() + " age_" + i);
                        break;
                    }
                    System.out.print(parameterTypes[i].getName() + " ages_" + i + ",");
                }
            }
            System.out.print(")");

            // 6. 抛出异常
            Class<?>[] exceptionTypes = m.getExceptionTypes();
            if (!(exceptionTypes == null && exceptionTypes.length == 0)){
                System.out.println("throw ");
                for (int i = 0; i < exceptionTypes.length; i++) {
                    if (i == exceptionTypes.length-1) {
                        System.out.println(exceptionTypes[i].getName());
                        break;
                    }
                    System.out.println(exceptionTypes[i].getName()+",");
                }
            }
        }
    }
}
