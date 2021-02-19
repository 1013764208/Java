package Test04;

public abstract class Person {
    String name;
    int age;

    public Person (){

    }

    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

//    不是抽象方法
//    public void eat(){
//        System.out.println("eat");
//    }

    // 抽象方法
    public abstract void eat();
}
