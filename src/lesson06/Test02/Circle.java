package lesson06.Test02;
/*
    练习：设计circle 圆的面积
 */
public class Circle {
    // 属性
    double radius;

    // 求圆的面积
    // radius 定义在类中，Area() 可以直接调用
    public double Area(){
        return 3.14 * radius * radius;
    }

    // error
    // radius 作为属性更好，定义来类中
    public double Area(double radius){
        return 3.14 * radius * radius;
    }
}
