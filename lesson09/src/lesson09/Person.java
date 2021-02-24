package lesson09;

public class Person extends Creature{
    private String name;
    int age;

    public Person() {

    }

    public Person(String name,int age) {
        this.name = name;
        this.age = age;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void eat(){
        System.out.println("eat...");
    }

    public void sleep(){
        System.out.println("sleep...");
    }

}
