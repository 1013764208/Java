package lesson03;

import java.util.Scanner;

// 练习：输入两个整数m,n，求其最大公约数和最小公倍数
// break的使用
public class ForTest1 {
    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);

        int m = sc.nextInt();
        int n = sc.nextInt();

        int min = m > n ? n : m;


        // 最大公约数
        for(int i = min; i >= 1; i--)
            if(m % i == 0 && n % i == 0){
                System.out.println("最大公约数" + i);
                break;
            }

        // 最小公倍数
        int max = m > n? m : n;
        for(int i = max ; i <= m * n ;i++) {
            if (i % m == 0 && i % n == 0) {
                System.out.println("最小公倍数" + i);
                break;
            }
        }
    }
}
