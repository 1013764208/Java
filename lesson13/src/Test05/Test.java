package Test05;

/*
    请使用继承的思想,设计commonEmployee 和 Manage 类，要求类中提供必要的方法进行属性方法
 */
public class Test {
    public static void main(String[] args) {
        Manager manager = new Manager("库克",1001,5000,50000);

        manager.wrok();
        CommonEmployee commonEmployee = new CommonEmployee();
        commonEmployee.wrok();
    }
}
