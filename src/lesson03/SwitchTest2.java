package lesson03;

import java.util.Scanner;

/*
    判断：判断一年是否为闰年
    依据：1. 可以被 4 整除，但不能被 100 整数
         2. 可以被 400 整除

    说明：1. 凡是使用 switch-case 的结构，都可以转换为 if-else 反之，不成立
         2. 优先 switch-case
 */
public class SwitchTest2 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int year = sc.nextInt();

        if((year%4 == 0 && year%100 != 0) || year%400 ==0){
            System.out.println(year+"为润年");
        }
    }
}
