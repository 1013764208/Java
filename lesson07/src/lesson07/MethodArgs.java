package lesson07;
/*
    可变个数形参的方法
    1. JDK 5.0 新增内容
    1.1 定义：允许直接定义能和多个实参相匹配的形参，从而可以用一种更简单的方法，来传递个数可变的实参

    2. 具体使用
    2.1 可变个数形参的格式：数据类型 ... 变量
    2.2 当调用可变个数形参的方法时，传入参数个数可以为 0,1,2...
    2.3 可变个数形参的方法与本类中方法名相同，形参不同的方法之间构成重载
    2.4 可变个数形参的方法与本类中方法名相同，形参类型也相同的数组之间不构成重载，不共存
    2.5 可变个数形参在方法的形参中，必须声明在末尾
    2.6 可变个数形参在方法的形参汇总，最多只能声明一个可变形参
 */

public class MethodArgs {

    public static void main(String[] args) {

        MethodArgs meth = new MethodArgs();
        meth.show(12);
        meth.show("hello");
        meth.show("hello","oo");
    }

    public void show(int i){

    }
    public void show(String s){

    }
    public void show(String ... strs){

    }
//    public void show(String[] strs){    // 作用相同
//
//    }

}
