package Test03;

public class Circle {
    private double radius;
    private  int id;

    private static int total;           // 记录创建圆的个数
    private static int init = 1001;     // static 声明的属性被所有对象所共享

    public Circle(){
        id = init++;
        total++;
    }

    public Circle(double radius){
        // id = init++
        // total ++
        this();  // 替换
        this.radius = radius;

    }


    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public static int getTotal() {
        return total;
    }

    public static void setTotal(int total) {
        Circle.total = total;
    }

    public static int getInit() {
        return init;
    }

    public static void setInit(int init) {
        Circle.init = init;
    }

    public double findArea(){
        return 3.14 * radius * radius;
    }
}
