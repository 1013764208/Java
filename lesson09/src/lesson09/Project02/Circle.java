package lesson09.Project02;

import sun.nio.cs.ext.MacArabic;

public class Circle {
    private double radius; // 半径

    public Circle(){
        radius = 1.0;
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    public double findArea(){
        return Math.PI * radius * radius;
    }
}
