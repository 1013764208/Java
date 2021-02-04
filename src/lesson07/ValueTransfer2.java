package lesson07;
/*
    方法的形参的传递机制：值传递
    1. 形参：方法定义时，声明小括号内的参数
       实参：方法调用时，实际传递给形参的数据

    2. 值传递机制
       如果参数是基本数据类型，此时实参赋值给形参的是，实参真实存储的数据
       如果变量为引用数据类型，此时赋值的是变量所保存的数据的地址
 */
public class ValueTransfer2 {
    public static void main(String[] args) {

        Data data = new Data();

        data.m = 10;
        data.n = 20;

        System.out.println("m = "+ data.m + " n = "+ data.n);

        ValueTransfer2 v = new ValueTransfer2();
        v.swap(data);  // 交换成功，引用数据类型，地址传递

    }
    public void swap(Data data){
        int temp = data.m;
        data.m = data.n;
        data.n = temp;

    }
}
class Data{
    int m = 10;
    int n = 20;
}

