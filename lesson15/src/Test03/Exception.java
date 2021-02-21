package Test03;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;

/*
    异常的处理方式二： throw + 异常类型

    1. " throws + 异常类型 " 写在方法的声明处，指明此方法执行时，可能抛出异常类型
        一旦当方法执行时，出现异常，仍会在异常代码出生成一个异常类的对象，此对象满足throws后异常
        类型时，就会被抛出。异常代码后续的代码，就不再执行

    2. 体会： try - catch - finally ：真正的将异常给处理掉了
             throws 的方式只是将异常抛给了方法的调用者，并没有将异常真正处理掉

    3. 开发中如何选择使用 try - catch - finally 还是 throws
    3.1 如果父类中被重写的方法没有 throws 方法处理异常，则子类重写的方法也不能使用 throws，意味着如果
        子类重写的方法中有异常，必须使用 try - catch - finally 方式处理
    3.2 执行的方法中，先后又调用了另外的几个方法，这几个方法是递进关系执行的. 我们建议这几个方法使用 throws
        的方式进行处理，而执行的方式 a 可以考虑 try - catch - finally
 */

public class Exception {

    public static void main(String[] args) {  // 到这就不要抛了，直接处理
        try {
            method2();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static void method1() throws IOException {
        File file = new File("hello.txt");
        FileInputStream fileInputStream = new FileInputStream(file);

        int data = fileInputStream.read();
        while(data != -1){
            System.out.println((char)data);
            data = fileInputStream.read();
        }
        fileInputStream.close();
    }

    public static void method2() throws IOException {
        method1();
    }
}
