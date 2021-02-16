package lesson11.Test02;

public class Test {


    public void equalsArea(GeometricObject g1, GeometricObject g2){  // 动态绑定

        if (g1.findArea() == g2.findArea()){
            System.out.println("equals");
        }else System.out.println("false");

    }

    public void displayGeometricObject(GeometricObject g){
        System.out.println(g.findArea());
    }

    public static void main(String[] args) {

        Test t = new Test();
        Circle c1 = new Circle("rad",2,2);
        MyRectangle m1 = new MyRectangle("green",10,2,1);

        t.equalsArea(c1,m1);
        t.displayGeometricObject(c1);
    }
}
