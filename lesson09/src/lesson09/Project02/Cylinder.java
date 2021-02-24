package lesson09.Project02;

public class Cylinder extends Circle{
    private double length;

    public Cylinder(){
        length = 1.0;
    }

    public void setLength(double length) {
        this.length = length;
    }

    public double getLength() {
        return length;
    }

    // 返回圆柱体积
    public double findVolume(){
        return Math.PI * getRadius() * getRadius() * getLength();
    }
}
