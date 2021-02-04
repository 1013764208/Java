package lesson07;
/*
    匿名对象
    1. 理解：我们创建的对象，没有显式的赋给一个变量名，即为匿名对象
    2. 特征：匿名对象只能调用一次
    3. 使用
 */
public class Instance {
    public static void main(String[] args) {
        Phone p = new Phone();

        p.sendEmail(); // 有名 p

        // 匿名对象
        new Phone().sendEmail(); // 无名
        new Phone().playGame();

        new Phone().price = 1999;
        new Phone().showPrice(); // 0.0     二者没关系

        // 匿名对象的使用
        PhoneMall mall = new PhoneMall();
        mall.show(new Phone());  // 直接 把 ”new Phone（）“ 当参数调用

    }
}

class Phone{
    double price;

    public void sendEmail(){
        System.out.println("send email");
    }
    public void playGame(){
        System.out.println("play game");
    }
    public void showPrice(){
        System.out.println("show price: " + price);
    }
}

class PhoneMall{
    public void show(Phone phone){  // 可多次调用
        phone.sendEmail();
        phone.playGame();
    }
}
