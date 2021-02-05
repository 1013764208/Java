package lesson08;
/*
    JavaBean是一种Java语言写成的可重用组件，所谓javaBean，是指符合如下标准的Java类
    1. 类是公共的
    2. 有一个无参的公共的构造器
    3. 有属性，且有对应的get、set方法

 */
public class Customer {

    private int id;
    private String name;

    public Customer(){

    }

    public void setId(int id) {
        this.id = id;
    }

    public int getId() {
        return id;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }
}
