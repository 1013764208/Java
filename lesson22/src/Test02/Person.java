package Test02;

/**
 * @author HXS
 * @create 2021-03-11 11:12
 */

@MyAnnotation(value = "hi")
public class Person extends Creature<String> implements Comparable<String>,MyInterface {

    private String name;
    int age;
    public int id;

    public Person(){

    }

    @MyAnnotation(value = "abc")
    private Person(String name) {
        this.name = name;
    }

    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    @MyAnnotation(value = "name")
    private String show(String nation){
        System.out.println("我的国籍是：" + nation);
        return nation;
    }

    public String display(String interest){
        return interest;
    }

    @Override
    public void info() {
        System.out.println("我是一个人");
    }

    @Override
    public int compareTo(String o) {
        return 0;
    }

    private static void showDesc(){
        System.out.println("我是静态方法");
    }
}

