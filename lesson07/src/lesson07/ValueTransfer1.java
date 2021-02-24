package lesson07;
/*
    方法的形参的传递机制：值传递
    1. 形参：方法定义时，声明小括号内的参数
       实参：方法调用时，实际传递给形参的数据

    2. 值传递机制
       如果参数是基本数据类型，此时实参赋值给形参的是，实参真实存储的数据

 */
public class ValueTransfer1 {
    public static void main(String[] args) {

        int m = 10;
        int n = 20;

        System.out.println("m = " + m + " n = " + n);  // m = 10 n = 20

        // 交换两个变量的值
        ValueTransfer1 valu = new ValueTransfer1();
        valu.swap(m,n);  // 没有换成, 方法形参  销毁
        System.out.println("m = " + m + " n = " + n);  // m = 10 n = 20
    }

    public void swap(int m,int n){
        int temp = m;
        m = n;
        n = temp;
        System.out.println("m = " + m + " n = " + n); // m = 20 n = 10
    }
}
