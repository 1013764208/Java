package Test03;

public class Test {
    public static void main(String[] args) {

        Circle c1 = new Circle();
        Circle c2 = new Circle();

        System.out.println("c1 id :" + c1.getId());
        System.out.println("c2 id :" + c2.getId());
        System.out.println("创建圆的个数为：" + Circle.getTotal());

    }
}
