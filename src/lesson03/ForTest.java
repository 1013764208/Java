package lesson03;

/*
    For 循环结构的使用
    1. 语法结构
        for(初始化； 布尔表达式； 更新){
            // 代码语句
        }

    执行过程：初始化 - 布尔表达式 - 代码语句 - 更新 - 布尔表达式 - 代码语句 - 更新
 */
public class ForTest {
    public static void main(String[] args){

        for(int i = 0; i < 5; i++){
            System.out.println("hello world");
        }

        // 练习
        int num = 1;
        for(System.out.print("a");num <= 3;System.out.print("c"),num++){
            System.out.print("b"); // 输出结果； abcbcbc
        }

        // 练习： 遍历 100 以内的偶数,输出所有偶数的和，输出偶数的个数
        int sum = 0;
        int count = 0;
        for(int i = 1; i < 100; i++){
            if(i % 2 == 0){
                sum += i;
                count++;
                System.out.print(i+" ");
            }
        }
        System.out.println("sum: "+sum);
        System.out.println("count: "+count);
    }
}
