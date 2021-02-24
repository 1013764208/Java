package lesson04;

import java.util.Scanner;

/*
    while(true) 结构使用
    练习：从键盘读入个数不确定的整数，并判断读入的正数和负数，输入为0时结束程序
    说明：1. 不再循环条件部分限制次数的结构：for(;;) / while(true)
         2. 结束循环有几种方式
            方式一：循环条件部分返回false
            方式二：在循环调价中，执行break

 */
public class ForwhileTest {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        while(true){   // for(;;) 相似
            int number = sc.nextInt();
            if(number > 0){
                System.out.println("正数："+number);
            }else if(number < 0){
                System.out.println("负数："+ number);
            }else{
                break;
            }
        }
    }
}
