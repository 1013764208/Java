package lesson07;

/*
    方法重载 overloading
    1. 定义：在同一个类中，允许存在一个以上的同名方法，只要他们的参数个数或参数类型不同即可
       "两同一不同"：同一类，同方法名
                   参数列表不同：参数个数不同，参数类型不同

    2. 判别是否重载
        跟方法的权限修饰符、返回值类型、形参变量名、方法体都没有关系

    3. 在通过对象调用方法时，如何确定某一个指定的方法?
       方法名 - 参数列表

 */
public class OverLoad {

    public static void main(String[] args) {
        OverLoad over = new OverLoad();
        over.getSum(1,2);
    }

    // 如下 4个方法构成重载
    public void getSum(int i,int j){
        System.out.println("1");
    }
    public void getSum(double d1,double d2){
        System.out.println("2");
    }
    public void getSum(String s,int i){
        System.out.println("3");
    }
    public void getSum(int i,String s){
        System.out.println("4");
    }
}
