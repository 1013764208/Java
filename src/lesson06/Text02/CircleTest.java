package lesson06.Text02;

public class CircleTest {
    public static void main(String[] args) {
        Circle c1 = new Circle();

        c1.radius = 2.1;    // 作为属性赋值，更好
//        Area(2.1)         // 作为形参赋值

        System.out.println(c1.Area());
    }
}
