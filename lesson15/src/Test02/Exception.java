package Test02;

import org.junit.Test;

/*
    1. 异常的处理：抓抛模型

    过程一："抛"：程序在正常执行的过程中，一旦出现异常，就会在异常代码处生成一个对应异常类的对象
                并将此对象抛出 / 一旦抛出对象以后，其后的代码不再执行

    过程二："抓"：可以理解为异常处理的方式   1. try - catch - final    2. throws

    2. try - catch - final 使用

        try {
            // 可能出现异常的代码
        } catch (异常类型1 变量名1){
            // 处理异常的方式 1
        } catch (异常类型1 变量名1){
            // 处理异常的方式 2
        } catch (异常类型1 变量名1){
            // 处理异常的方式 3
        }
        ...
        finally{
            // 一定会执行的代码
        }

    说明：
    1. finally 可选的

    2. 使用 try 将可能出现异常代码包装起来，在执行过程中，一旦出现异常，就会生成一个对象异常类的对象
       根据此对象的类型，去catch中进行匹配

    3. 一旦try中的异常对象匹配到某一个catch中进行异常的处理，一旦处理完成，就跳出当前的try-catch结构
       （在没有写finally的情况下），继续执行其后的代码

    4. catch 中的异常类型如果没有子父类关系，则谁声明在上，谁声明在下无所谓
       catch 中的异常类型如果有子父类关系，则子类声明在上，父类声明在下

    5. 常用的异常对象处理的方式 ：   1.String getMessage  2. printStackTrace

    6. 在 try 结构中声明的变量，再出了try结构以后，就不能再被调用

 */
public class Exception {

    @Test
    public void test1(){
        String str = "123";
        str = "abc";
        int num = 1; // 处理方法
        try{
            num = Integer.parseInt(str);    // 生成并抛出 NumberFormatException 对象
        } catch (NumberFormatException e){      // 捕获 NumberFormatException 对象 继续执行
            System.out.println("出现数值转换异常");

        } catch (NullPointerException n) {
            System.out.println("出现空指针异常");
        }

        System.out.println(num);
    }
}
