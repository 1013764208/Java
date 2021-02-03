package lesson06;
/*
    类中方法的声明和使用
    方法：描述类应该具有的功能

    1. 方法的声明
       权限修饰符 返回值类型 方法名（形参类型）{
            方法体；
       }
       注：static、final、abstract 来修饰的方法

    2. 说明
    2.1 权限修饰符：private、public、缺省、protected
    2.2 返回值类型：有返回值 vs 无返回值
        有返回值，则必须在方法声明时，指定返回值的类型，同时方法中，需要使用 return 关键字 来返回指定类型的变量或常量
        无返回值，则方法声明时，使用void，但如果使用，只能 ”return“ 表示结束此方法

    2.3 方法明：属于标识符   规范，见名知意
    2.4 形参列表：方法可以声明 0,1,多个形参
    2.5 方法体：方法功能的体现

    return 关键字的使用：
        1. 使用范围：使用在方法体中
        2. 作用：结束方法
                针对与有返回值类型的方法，"return 数据"，返回所要数据
        3. 注意：return 关键字后面不可以声明执行语句

    3. 方法使用中，可以调用当前类的属性或方法 / 特殊，方法A又调用方法A，称递归
       方法中，不可以定义方法



 */
public class Custom {
    public static void main(String[] args) {
        Customer  cust1 = new Customer();
        cust1.eat();
    }
}
class Customer{
    // 属性
    String name;
    int age;
    boolean isMale;

    // 方法
    public void eat(){
        System.out.println("eat...");
    }
    public void sleep(int hour){
        System.out.println("sleep：" + hour);
    }
    public String getName(){
        return name;
    }
    public String getNation(String nation){
        String info = "nation:" + nation;
        return info;
    }
}