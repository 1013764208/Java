package lesson01;

/*
    java程序总结
    1. java程序 编写 - 编译 - 运行 的过程
       编写：我们将编写的java代码保存为以 ".java" 结尾的源文件中
       编译：使用javac.exe 命令编译 java源文件  dos：javac 源文件名.java 生成 .class 字节码文件
       运行：使用java.exe 命令解释运行我们的字节码文件  dos：java 类名.class

    2. 一个java源文件可以声明多个class，但最多只能有一个类声明为public
       而且要求声明为public的类的类名必须与源文件名相同

    3. 程序的入口是main()方法，格式是固定的

    4. 输出语句
       System.out.println()  // 先输出后换行
       System.out.print()

    5. 编译过程中，会生成一个或多个字节码文件 / 字节码文件的文件名与java 源文件的类名相同
 */

public class HelloWord {
    public static void main(String[] args){   // arguments 参数
        System.out.print("hello world");
        System.out.println("hello world");
    }
}



