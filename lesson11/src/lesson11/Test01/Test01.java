package lesson11.Test01;

// 向下转型
public class Test01 {
    public static void main(String[] args) {

        Person p1 = new ManPerson();
        // 不能调用子类所特有的方法、属性：编译时，p2是Person类型
        // p1.isSmoking = true;
        // 有了对象的多态性以后，内存中实际上是加载了子类特有的属性和方法，但是由于变量声明为父类类型，
        // 编译时，只能调用父类中声明的属性和方法，子类特有的属性和方法不能调用

        // 如何才能调用子类特有的属性和啊方法？
        // 向下转型：使用强制类型转换符
        ManPerson m1 = (ManPerson)p1;
        m1.isSmoking = true;

        // 使用强转时，可能出现 classCastException 异常
        // WomenPerson w1 = (WomenPerson)p1;


        //    instanceof 关键字的使用
        //    a instanceof A : 判断对象a是否是类A的实例
        //    使用情景：为了避免在向下转型时出现 classCastException 异常，我们在向下转型之前,先进行
        //    instanceof 的判断，一旦返回true，则进行向下转型

        //    如果 a instanceof A 返回 true，则 a instanceof B 也返回 true
        //    其中，类 B是类 A的父类
        if(p1 instanceof WomenPerson){
            WomenPerson w1 = (WomenPerson)p1;
            w1.goShipping();
        }

    }
}
