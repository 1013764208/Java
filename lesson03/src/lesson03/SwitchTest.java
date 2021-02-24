package lesson03;
/*
    分支结构. switch - case
    语法：
        switch(表达式){
        case 常量1：
            执行语句1;
            // break

        case 常量2：
            执行语句2;
            // break
        default:
            执行语句n;
            // break
        }

    说明：1. 根据switch表达式中的值，依次匹配各个case中的常量，一旦匹配成功，则进入相应case结构，调用其执行程序
            当调用结束，仍然继续向下执行其他case结构中的执行语句，直到遇到break 或 switch - case 结构结束
         2. break 可以使用在 switch-case 结构中，表示一旦执行到此关键字，就跳出 switch - case 结构
         3. case 之后只能声明常量，不能声明范围
         4. default：相当于 if - else 中的 else
 */
public class SwitchTest {
    public static void main(String[] args){
        int number = 2;
        switch (number){
            case 0:
                System.out.println("zero");
                break;
            case 1:
                System.out.println("one");
                break;
            case 2:
                System.out.println("two");
                break;
            case 3:
                System.out.println("three");
                break;
            default:
                System.out.println("other");
        }
    }
}
