package Test02;

public class Chinese {
    String name;
    int age;
    static String nation;

    // 非静态方法
    public void eat(){
//        this.eat(); 可以调用非静态方法
//        show();   可以调用静态方法
        System.out.println("中国人吃餐");
    }

    // 静态方法
    public static void show(){
        System.out.println("CHINESE");
//        eat();   静态方法中不能调用非静态方法
//        show();  可以调用静态方法
    }
}
