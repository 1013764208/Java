package lesson10.Test06;

public class Test {
    public static void main(String[] args) {
        Test t = new Test();
        t.func(new Dog());
        t.func(new Cat());

    }

    public void func(Animal animal){ // Animal animal = new Dog();
                                     // Animal animal = new Cat();
        animal.eat();
        animal.shout();
    }
}
