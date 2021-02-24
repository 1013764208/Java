package lesson04;
/*
    do while 循环
    1. 语法结构
        do {
           //代码语句
        }while(布尔表达式);

   说明 1. do while 至少会执行一次代码语句
          布尔表达式在循环体的后面，所以语句块在检测布尔表达式之前已经执行
 */
public class DoWhileTest {
    public static void main(String[] args){

        // 遍历 100 以内的偶数,并计算所有偶数的和及个数
        int num = 1;
        int sum = 0;
        int count = 0;
        do{
            if(num % 2 == 0){
                System.out.println(num);
                sum += num;
                count++;
            }
            num++;
        }while(num <= 100);
        System.out.println("sum：" + sum);
        System.out.println("count:" + count);
    }
}
