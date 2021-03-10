package Test09;

import java.io.Serializable;

/**
 * @author HXS
 * @create 2021-03-09 17:59
 */

/*
    Person 需要满足相应的要求，方可序列化
    1. 需要实现接口：serializable
    2. 当前类提供一个全局常量： serialVersionUID
    3. 除了当前Person类需要实现serializable接口之外，还必须保证其内部的属性也必须是可序列化的
       默认下，基本数据类型可序列化

    补充：ObjectOutputStream和ObjectInputStream不能序列化static和transient修饰的成员变量


 */
public class Person implements Serializable {

    public static final long serialVersionUID = 3213124121241L;

    private String name;
    private int age;
    private Account acct;

    public Person() {
    }

    public Person(String name, int age, Account acct) {
        this.name = name;
        this.age = age;
        this.acct = acct;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public Account getAcct() {
        return acct;
    }

    public void setAcct(Account acct) {
        this.acct = acct;
    }

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", acct=" + acct +
                '}';
    }
}

class Account implements Serializable{

    public static final long serialVersionUID = 321312412121311L;

    private double balance;

    public Account() {
    }

    public Account(double balance) {
        this.balance = balance;
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    @Override
    public String toString() {
        return "Account{" +
                "balance=" + balance +
                '}';
    }
}
