package lesson03;

import java.util.Scanner;

/*
    由键盘输入三个整数分别存入变量num1,num2,num3
    对他们进行排序,ASC
 */
public class IfTest2 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        System.out.println("num1: ");
        int num1 = sc.nextInt();
        System.out.println("num2: ");
        int num2 = sc.nextInt();
        System.out.println("num3: ");
        int num3 = sc.nextInt();

        int[] array = {num1,num2,num3};
        BubbleSort.bubbleSort(array);

        for(int i:array){
            System.out.print(i+" ");
        }



    }
}

