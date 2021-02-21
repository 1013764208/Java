package Test04;

import java.io.IOException;

/*
    方法重写的规则之一：
    子类重写的方法抛出的异常类型不大于父类被重写的方法抛出的异常类型

 */
public class Test {
    public static void main(String[] args) {
        Test test = new Test();
        test.display(new SubClass());
    }

    public void display(SuperClass s){
        try {
            s.method();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
