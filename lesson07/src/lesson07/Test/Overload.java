package lesson07.Test;
/*
    练习. 定义三个重载方法max()
      第一个方法求两个int值中的最大值
      第二个方法求两个double值中的最大值
      第三个方法求三个double值中的最大值，并分别调用三个方法

 */
public class Overload {

    public int max(int i,int j){
        return (i > j) ? i : j;
    }
    public double max(double d1,double d2){
        return (d1 > d2) ? d1:d2;
    }
    public double max(double d1,double d2,double d3){
        double max =  (d1 > d2) ? d1:d2;
        return max > d3 ? max : d3;
    }
}
