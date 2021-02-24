package lesson01;
/*
    变量的使用
    1. java定义变量的格式：数据类型 变量名  = 变量值
    2. 说明
       2.1 变量必须先声明再赋值
       2.2 变量都定义在作用域内
 */
public class VariableTest {
    public static void main(String[] args){
        // 变量的定义
        int myAge = 12;

        System.out.println(myAge);
        //      System.out.println(myClass);   / 作用域不对
    }
    void method(){
        int myClass = 1;
    }
}
