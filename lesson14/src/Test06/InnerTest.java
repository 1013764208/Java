package Test06;

public class InnerTest {

    /*
        在局部内部类的方法中 （EX- show） 如果调用局部内部类所声明的方法（EX- method）中的局部变量
        要求此局部变量声明为final

        JDK 7 及之前的版本，要求此局部变量显式的声明为final
        JDK 8 及其之后，可以省略 final
     */
    public void method(){
        // 局部变量
        int num = 10;

        class A{
            public void show(){
//                num = 20;
                System.out.println(num);
            }
        }
    }
}
