package lesson11.Test04;

public class Test {
    public static void main(String[] args) {
        Order o1 = new Order(1,"Tom");
        Order o2 = new Order(2,"Jack");
        Order o3 = new Order(1,"Tom");


        System.out.println(o1.equals(o3)); // true


    }
}
