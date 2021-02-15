package lesson11.Test01;

/*


 */
public class Test01 {
    public static void main(String[] args) {

        Person p1 = new Person();
        p1.eat();

        ManPerson man = new ManPerson();
        man.eat();
        man.age = 25;
        man.earnMoney();

        // ---------------------------------------------------------
        // 对象的多态性： 父类的引用指向子类的对象
        Person p2 = new ManPerson();

        // 多态的使用：当调用子父类同名同参数的方法时，实际执行的是子类重写父类的方法 -- 虚拟方法调用
        p2.eat();  // 编译Person类, 调用的是子类重写方法


    }
}
