package lesson10.test03;

public class Person {

    String name;
    int age;
    int id = 001; // 身份证号

    public Person(){

    }

    public Person(String name){

    }

    public Person(String name ,int age){
        this.name = name;
        this.age = age;
    }

    public void eat(){
        System.out.println("eat");
    }

    public void walk(){
        System.out.println("walk");
    }
}
