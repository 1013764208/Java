package Test06;

public class Test {


    // 开发中很少见
    public void method(){
        // 局部内部类
        class AA{

        }
    }


    // 返回一个实现了 comparable 接口的类的对象
    public Comparable getComparable(){
        // 创建一个实现comparable接口的类：局部内部类
        // 方式 1
//        class MyComarable implements Comparable{
//
//            @Override
//            public int compareTo(Object o) {
//                return 0;
//            }
//        }
//        return new MyComarable();

        // 方式 2  匿名
        return new Comparable() {
            @Override
            public int compareTo(Object o) {
                return 0;
            }
        };
    }
}
