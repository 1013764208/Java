package lesson11.Test02;

public class Circle extends GeometricObject{
    double radius;

    public Circle(String color, double weight, double radius) {
        super(color, weight);
        this.radius = radius;
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    public double findArea(){  // 计算圆的面积
        return Math.PI * radius * radius;
    }
}
