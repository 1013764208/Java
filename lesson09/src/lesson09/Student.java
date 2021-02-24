package lesson09;

public class Student extends Person{

//    String name;       继承 Person
//    int age;           继承 Person
    String major;

    public Student(){


    }
    public Student(String name,int age,String major){
        this.setName(name);    // private name;
        this.age = age;
        this.major = major;
    }

//    public void eat(){        继承 Person
//        System.out.println("eat...");
//    }

//    public void sleep(){      继承 Person
//        System.out.println("sleep...");
//    }

    public void study(){
        System.out.println("study");
    }
}
