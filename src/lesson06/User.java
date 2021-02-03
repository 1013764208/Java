package lesson06;
/*
    类中属性的使用
    属性 / 成员变量  vs 局部变量
    1. 相同点
    1.1 定义变量的格式    数据类型 变量名 = 变量值
    1.2 先声明，后使用
    1.3 变量都有其对应的作用域

    2. 不同点
    2.1 在类中声明位置不同
        属性：直接定义在类的内
        局部变量：声明在方法内、方法形参、代码块、构造器形参、构造器内部的变量
    2.2 关于权限修饰符的不同
        属性：可以在声明属性时，指明其权限，使用权限修饰符
             常用的权限修饰符：private、public、缺省、protected
        局部变量：不可以使用权限修饰符
    2.3 默认初始化值的情况
        属性：类的属性、根据其类型，都默认初始化值
        局部变量：没有默认初始化
            意味着，我们在调用局部变量之前，一定要显示赋值
            特别地，形参在调用时，我们赋值即可
    2.4 在内存中加载的位置
        属性：堆空间中 （非static）
        局部变量：栈空间中

 */
public class User {
    public static void main(String[] args) {

    }
}
class user1{
    // 属性 / 成员变量
    String name;
    int age;
    boolean isMale;

    public  void talk (String language) {  // language ：形参
        System.out.println("使用: " +language );
    }
    public void eat(){
        String food = "米";  // 局部变量
        System.out.println("吃："+ food);
    }
}
