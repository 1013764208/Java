package Test04;

public class Test {
    public static void main(String[] args) {
        SubClass s = new SubClass();

        // 1. 接口中的定义的默认方法，可以通过 创建 实现接口的类 创建
        // 如果实现类重写了接口中的默认方法，调用时，仍然调用的是重写后的方法
        s.method2();

        // 2. 接口中定义的静态方法，只能通过接口来调用
        CompareA.method1();

        // 3. 如果子类（实现类）继承的父类和实现的接口中声明了同名同参的方法
        // 那么子类在没有重写此方法的情况下，默认调用的是父类中同名同参数的方法 -> 类优先原则
        // 4. 如果实现类多个接口，而这多个接口中定义了同名参数的方法
        // 那么在实现类没有冲洗此方法的情况下，报错 —> 接口冲突
        // 这就需要我们必须在实现类中重写此方法
        s.method2();
    }
}